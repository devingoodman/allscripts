package com.doctrly.integration.allscripts.controller;

import com.doctrly.integration.allscripts.dto.*;
import com.doctrly.integration.allscripts.entity.*;

import com.doctrly.integration.allscripts.mapper.AllScriptsMapper;
import com.doctrly.integration.allscripts.pojo.*;
import com.doctrly.integration.allscripts.repository.*;
import com.doctrly.integration.allscripts.resource.ExtendableBean;
import com.doctrly.integration.allscripts.service.UnityPMTester;
import com.doctrly.integration.allscripts.service.UnityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.math.BigInteger;
import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;



@Slf4j
@RestController
public class TestRestController {

    @Autowired
    public void setUnityService(UnityService unityService) {
        this.unityService = unityService;
    }

    UnityService unityService;



    private AppointmentRepository appointmentRepository;
    private PatientRepository patientRepository;
    private ProviderRepository providerRepository;
    private LocationRepository locationRepository;
    private GroupRepository groupRepository;



    private UUIDRepository uuidRepository;

    private AddressRepository addressRepository;


    @Autowired
    public void setAddressRepository(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Autowired
    public void setUuidRepository(UUIDRepository uuidRepository) {
        this.uuidRepository = uuidRepository;
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
    public void setProviderRepository(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }

    @Autowired
    public void setLocationRepository(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Autowired
    public void setGroupRepository(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }



    @RequestMapping(
            value = "/{tenant}/" + "status",
            method = RequestMethod.GET,
            produces = "application/json")
    public HttpEntity<ExtendableBean> getStatus(
            @PathVariable final String tenant) throws Exception {

        ExtendableBean resp_l1 = new ExtendableBean();
        String ts = Instant.now().toString();
        log.info("timestamp : {}", ts);

        UnityPMTester.callService();

        resp_l1.getProperties().put("timestamp", Instant.now().toString());
        return new ResponseEntity<>(resp_l1, HttpStatus.OK);
    }



    @RequestMapping(
            value = "/{tenant}/" + "call",
            method = RequestMethod.POST,
            produces = "application/json")
    public HttpEntity<Map<String, Object>> callAPI(
            @PathVariable final String tenant) throws Exception {

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("tenat", tenant);
        result.put("timestamp", Instant.now().toString());
        result.put("status", "OK");

        /*
        result.put("getAppointmentsChanged", unityService.getAppointmentsChanged());
        result.put("getPatients", unityService.getPatients());

        result.put("getPractitioners", unityService.getPractitioners());
        result.put("getLocations", unityService.getLocations());

        result.put("getResources", unityService.getResources());
        result.put("getDepartments", unityService.getDepartments());

        result.put("saveApptStatus", unityService.saveApptStatus());
        result.put("savePatientNote", unityService.savePatientNote());

        result.put("getAppointments", unityService.getAppointments());
        */


        // TODO: link by a group
        // TODO: implement findBySourceID

        /*
        OrganizationEntity org = new OrganizationEntity();
        org.setId(new BigInteger("24797058879717377"));

        GroupEntity groupResult = null;
        ProviderEntity providerResult = null;

        AllScriptsMapper amapper = AllScriptsMapper.INSTANCE;


        List<Getschedulingdepartmentsinfo> departmentPOJO_list = unityService.getDepartments();
        for ( Getschedulingdepartmentsinfo item : departmentPOJO_list) {
            GroupEntity group = amapper.groupToGroupDTO(item);
            if (groupRepository.findBySourceId(group.getSourceId()) == null) {
                AddressEntity address = group.getAddressByAddressId();
                address.setId(uuidRepository.generateID());
                AddressEntity addressResult = addressRepository.saveAndFlush(address);

                group.setId(uuidRepository.generateID());
                group.setOrganizationByOrganizationId(org);
                group.setAddressByAddressId(addressResult);
                log.info("group: {}", group);
                groupResult = groupRepository.saveAndFlush(group);
            }
        }


        List<Getschedulinglocationsinfo> locationPOJO_list = unityService.getLocations();
        for ( Getschedulinglocationsinfo item : locationPOJO_list) {
            LocationEntity location = amapper.locationToLocationDTO(item);
            if (locationRepository.findBySourceId(location.getSourceId()) == null) {
                location.setId(uuidRepository.generateID());
                location.setCountry("N/A");
                log.info("location: {}", location);
                locationRepository.saveAndFlush(location);
            }
        }


        List<Getpractitionersinfo> practitionerPOJO_list = unityService.getPractitioners();
        for (Getpractitionersinfo item : practitionerPOJO_list) {
            ProviderEntity provider = amapper.providerToProviderDTO(item);
            //if (providerRepository.findBySourceId(provider.getSourceId()) == null) {
                provider.setId(uuidRepository.generateID());
                log.info("provider: {}", provider);
                providerResult = providerRepository.saveAndFlush(provider);
            //}
        }


        //TODO: assign to practitioner id based on resource id

        List<Getappointmentsbychangedttminfo> apptPOJO_list = unityService.getAppointmentsChanged();
        for (Getappointmentsbychangedttminfo item : apptPOJO_list) {
            AppointmentEntity appt = amapper.appointmentToAppointmentDTO(item);

            LocationEntity location = locationRepository.findBySourceId(appt.getLocationId().toString());
            appt.setLocationByLocationId(location);

            Getpatientdemographicsinfo patientPOJO = unityService.getPatients(appt.getPatientId().toString()).get(0);
            PatientEntity patient = amapper.patientToPatientDTO(patientPOJO);
            PatientEntity patientResult = null;
            //if (patientRepository.findBySourceId(patient.getSourceId()) == null) {
                patient.setOrganizationByOrganizationId(org);
                patient.setId(uuidRepository.generateID());
                log.info("patient: {}", patient);
                patientResult = patientRepository.saveAndFlush(patient);
            //}

            if (appointmentRepository.findBySourceId(appt.getSourceId()) == null) {
                appt.setId(uuidRepository.generateID());
                appt.setPatientByPatientId(patientResult);
                appt.setProviderByProviderId(providerResult);
                log.info("appt: {}", appt);
                appointmentRepository.saveAndFlush(appt);
            }
        }
        */

        /*
        Getresourcesinfo resourcePOJO = unityService.getResources().get(0);
        Resource resource = amapper.resourceToResourceDTO(resourcePOJO);
        result.put("Getresourcesinfo", resourcePOJO);
        result.put("Resource", resource);
        */


        return new ResponseEntity<>(result, HttpStatus.OK);

    }


}




