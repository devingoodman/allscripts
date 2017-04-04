package com.doctrly.integration.allscripts.service;

import com.doctrly.integration.allscripts.entity.*;
import com.doctrly.integration.allscripts.mapper.AllScriptsMapper;
import com.doctrly.integration.allscripts.pojo.*;
import com.doctrly.integration.allscripts.repository.*;
import com.google.common.base.MoreObjects;
import jdk.nashorn.internal.runtime.ECMAException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Slf4j
@Service
public class UnityBatchService {

    private final int INDEX = 0;

    private UnityService unityService;
    private GroupRepository groupRepository;
    private LocationRepository locationRepository;
    private ProviderRepository providerRepository;
    private AppointmentRepository appointmentRepository;
    private PatientRepository patientRepository;
    private AddressRepository addressRepository;
    private UUIDRepository uuidRepository;

    private AllScriptsMapper amapper;


    @PostConstruct
    public void initIt() throws Exception {
        amapper = AllScriptsMapper.INSTANCE;
    }


    public void execute() throws Exception {

        // TODO: pick the right organization and database target based on tenant ID
        OrganizationEntity org = new OrganizationEntity();
        org.setId(new BigInteger("24797058879717377"));

        // build resource/provider map
        Map<String, String> resource_provider = new HashMap<>();
        Map<String, String> provider_resource = new HashMap<>();
        Map<String, String> resource_group = new HashMap<>();

        List<Getresourcesinfo> resourcesList = unityService.getResources();
        for (Getresourcesinfo resource : resourcesList) {
            resource_provider.put(resource.getResourceID(), resource.getPractitionerID());
            provider_resource.put(resource.getPractitionerID(), resource.getResourceID());
            resource_group.put(resource.getResourceID(), resource.getAppointmentGroupID());

            String strMap = MoreObjects.toStringHelper("Map")
                    .add("ResourceID", resource.getResourceID())
                    .add("PractitionerID", resource.getPractitionerID())
                    .add("AppointmentGroupID", resource.getAppointmentGroupID()).toString();
            log.info(strMap);

        }
        log.info("resources: {}", resourcesList.size());

        // TODO: Logic to compare and update existing groups, locations, patients, providers

        // Step 1 - Groups/Locations
        try {
            List<Getschedulingdepartmentsinfo> departmentList = unityService.getDepartments();
            for (Getschedulingdepartmentsinfo department : departmentList) {
                GroupEntity group = amapper.groupToGroupDTO(department);

                Optional<GroupEntity> groupResult;
                groupResult =
                        Optional.ofNullable(groupRepository.findBySourceId(group.getSourceId()));
                if (!groupResult.isPresent()) {
                    AddressEntity address = group.getAddressByAddressId();
                    address.setId(uuidRepository.generateID());
                    AddressEntity addressResult = addressRepository.saveAndFlush(address);

                    group.setOrganizationByOrganizationId(org);
                    group.setAddressByAddressId(addressResult);
                    group.setId(uuidRepository.generateID());
                    groupResult = Optional.of(groupRepository.saveAndFlush(group));
                    log.info("group saved: {}-{}", department.getAbbreviation(), groupResult.get().getSourceId());
                } else {
                    log.info("group found: {}-{}", department.getAbbreviation(), groupResult.get().getSourceId());
                }

                try {
                    //TODO: verify group mapping
                    List<Getschedulinglocationsinfo> locationList =
                            unityService.getLocations(department.getAbbreviation());
                    log.info("group/locations: {}/{}", department.getAbbreviation(), locationList.size());

                    for (Getschedulinglocationsinfo loc : locationList) {
                        LocationEntity location = amapper.locationToLocationDTO(loc);

                        Optional<LocationEntity> locationResult;
                        locationResult =
                                Optional.ofNullable(locationRepository.findBySourceId(location.getSourceId()));
                        if (!locationResult.isPresent()) {
                            location.setGroupByGroupId(groupResult.get());
                            location.setCountry("N/A");
                            location.setId(uuidRepository.generateID());
                            locationResult = Optional.of(locationRepository.saveAndFlush(location));
                            log.info("location saved: {}", locationResult.get().getSourceId());
                        } else {
                            log.info("location found: {}", locationResult.get().getSourceId());
                        }
                    }
                } catch (Exception e) {
                    log.info("Exception: {}", e.getMessage());
                    e.printStackTrace();
                }

            }
        } catch (Exception e) {
            log.info("Exception: {}", e.getMessage());
            e.printStackTrace();
        }


        // Step 2 - Providers
        try {
            List<Getpractitionersinfo> practitionerList = unityService.getPractitioners();
            for (Getpractitionersinfo practitioner : practitionerList) {
                ProviderEntity provider = amapper.providerToProviderDTO(practitioner);
                provider.setOrganizationByOrganizationId(org);

                Optional<ProviderEntity> providerResult =
                        Optional.ofNullable(providerRepository.findBySourceId(provider.getSourceId()));
                if (!providerResult.isPresent()) {

                    // Get group
                    log.info("providerId: {}", provider.getSourceId());
                    Optional<String> resourceId =
                            Optional.ofNullable(provider_resource.get(provider.getSourceId()));
                    if (resourceId.isPresent()) {
                        log.info("resourceId: {}", resourceId.get());
                        Optional<String> groupId =
                                Optional.ofNullable(resource_group.get(resourceId.get()));
                        if (groupId.isPresent()) {
                            log.info("groupId: {}", groupId.get());
                            Optional<GroupEntity> groupResult;
                            groupResult =
                                    Optional.ofNullable(groupRepository.findBySourceId(groupId.get()));
                            if (groupResult.isPresent()) {
                                provider.setGroupByGroupId(groupResult.get());
                            } else {
                                log.info("group not found: {}", groupId.get());
                            }
                        }
                    }

                    provider.setId(uuidRepository.generateID());
                    providerResult = Optional.of(providerRepository.saveAndFlush(provider));
                    log.info("provider created: {}", providerResult.get().getSourceId());
                } else {
                    log.info("existing provider: {}", providerResult.get().getSourceId());
                }

            }
        } catch (Exception e) {
            log.info("Exception: {}", e.getMessage());
            e.printStackTrace();
        }


        // Step 3 - Appointments with location, provider, patient
        try {
            List<Getappointmentsbychangedttminfo> apptList = unityService.getAppointmentsChanged(
                    "","", "");

            for (Getappointmentsbychangedttminfo appt : apptList) {
                AppointmentEntity appointment = amapper.appointmentToAppointmentDTO(appt);

                Optional<AppointmentEntity> appointmentResult;
                appointmentResult =
                        Optional.ofNullable(appointmentRepository.findBySourceId(appointment.getSourceId()));
                if (!appointmentResult.isPresent()) {

                    // Get location
                    Optional<LocationEntity> location =
                            Optional.ofNullable(locationRepository.findBySourceId(appointment.getLocationId().toString()));
                    if (location.isPresent()) {
                        appointment.setLocationByLocationId(location.get());
                    } else {
                        log.info("location not found: {}", appointment.getLocationId());
                    }

                    // Get provider
                    Optional<String> practitionerId =
                            Optional.ofNullable(resource_provider.get(appt.getResourceID()));
                    if (practitionerId.isPresent()) {
                        Optional<ProviderEntity> providerResult =
                                Optional.ofNullable(providerRepository.findBySourceId(practitionerId.get()));
                        if (providerResult.isPresent()) {
                            appointment.setProviderByProviderId(providerResult.get());
                        } else {
                            log.info("provider not found: {}", practitionerId.get());
                        }
                    } else {
                        log.info("resource id not found: {}", appt.getResourceID());
                    }

                    // Get patient
                    Optional<List<Getpatientdemographicsinfo>> patientList =
                            Optional.ofNullable(unityService.getPatients(appointment.getPatientId().toString()));
                    if (patientList.isPresent()) {
                        Getpatientdemographicsinfo patientItem = patientList.get().get(INDEX);
                        PatientEntity patient = amapper.patientToPatientDTO(patientItem);

                        Optional<PatientEntity> patientResult =
                                Optional.ofNullable(patientRepository.findBySourceId(patient.getSourceId()));
                        if (!patientResult.isPresent()) {
                            patient.setOrganizationByOrganizationId(org);
                            patient.setId(uuidRepository.generateID());
                            patientResult = Optional.of(patientRepository.saveAndFlush(patient));
                            appointment.setPatientByPatientId(patientResult.get());
                            log.info("patient created: {}", patientResult.get().getSourceId());
                        }
                        else {
                            log.info("existing patient: {}", patientResult.get().getSourceId());
                        }

                        appointment.setId(uuidRepository.generateID());
                        appointmentRepository.saveAndFlush(appointment);
                        log.info("appointment created: {}", appointment.getSourceId());
                    }

                }
                else {
                    log.info("existing appointment: {}", appointment.getSourceId());
                }

            }
        } catch (Exception e) {
            log.info("Exception: {}", e.getMessage());
            e.printStackTrace();
        }


    }


    @Autowired
    public void setUnityService(UnityService unityService) {
        this.unityService = unityService;
    }

    @Autowired
    public void setGroupRepository(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Autowired
    public void setLocationRepository(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Autowired
    public void setProviderRepository(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }

    @Autowired
    public void setAppointmentRepository(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Autowired
    public void setPatientRepository(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Autowired
    public void setAddressRepository(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Autowired
    public void setUuidRepository(UUIDRepository uuidRepository) {
        this.uuidRepository = uuidRepository;
    }

}
