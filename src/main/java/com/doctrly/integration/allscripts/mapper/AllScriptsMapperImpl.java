package com.doctrly.integration.allscripts.mapper;

import com.doctrly.integration.allscripts.entity.*;
import com.doctrly.integration.allscripts.pojo.Getappointmentsbychangedttminfo;
import com.doctrly.integration.allscripts.pojo.Getpatientdemographicsinfo;
import com.doctrly.integration.allscripts.pojo.Getpractitionersinfo;
import com.doctrly.integration.allscripts.pojo.Getresourcesinfo;
import com.doctrly.integration.allscripts.pojo.Getschedulingdepartmentsinfo;
import com.doctrly.integration.allscripts.pojo.Getschedulinglocationsinfo;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.annotation.Generated;

@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2017-02-10T12:50:47-0800",
        comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_91 (Oracle Corporation)"
)
public class AllScriptsMapperImpl implements AllScriptsMapper {

    @Override
    public AppointmentEntity appointmentToAppointmentDTO(Getappointmentsbychangedttminfo appointment) {
        if (appointment == null) {
            return null;
        }

        AppointmentEntity appointment_ = new AppointmentEntity();

        appointment_.setSourceId(appointment.getAppointmentID());
        appointment_.setDuration(appointment.getDuration());
        appointment_.setAppointmentType(appointment.getApptTypeDesc());
        appointment_.setNotes(appointment.getApptComments());

        if (appointment.getPatientID() != null) {
            appointment_.setPatientId(new BigInteger(appointment.getPatientID()));
        }
        if (appointment.getResourceID() != null) {
            appointment_.setProviderId(new BigInteger(appointment.getResourceID()));
        }
        if (appointment.getSchedulingLocationID() != null) {
            appointment_.setLocationId(new BigInteger(appointment.getSchedulingLocationID()));
        }

        appointment_.setAppointmentDateTime(mapDateTime(appointment.getAppointmentDateTime()));

        return appointment_;
    }

    @Override
    public Timestamp mapDateTime(String value) {
        if (value == null) {
            return null;
        }
        try {
            SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy hh:mma");
            java.util.Date date = sdf1.parse(value);
            return new Timestamp(date.getTime());
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
    }

    @Override
    public PatientEntity patientToPatientDTO(Getpatientdemographicsinfo patient) {
        if (patient == null) {
            return null;
        }

        PatientEntity patient_ = new PatientEntity();

        patient_.setSourceId(patient.getPatientID());
        patient_.setLastName(patient.getLastName());
        patient_.setGender(patient.getSex());
        patient_.setEthnicity(patient.getEthnicity());
        patient_.setRace(patient.getRace());
        patient_.setPhoneMobile(patient.getCellPhone());
        patient_.setPhoneHome(patient.getHomePhone());
        patient_.setEmergencyContactRelationship(patient.getEmergencyContactRelation());
        patient_.setEmployerName(patient.getPatientEmployerName());
        patient_.setLanguage(patient.getLanguage());
        patient_.setEmergencyContactFirstName(patient.getEmergencyContact());
        patient_.setSuffix(patient.getSuffix());
        patient_.setBirthDate(mapDate(patient.getdOB()));
        patient_.setFirstName(patient.getFirstName());
        patient_.setEmergencyContactPhone(patient.getContactID());
        patient_.setPhoneWork(patient.getWorkPhone());
        patient_.setEncryptedSsn(patient.getsSN());
        patient_.setMiddleName(patient.getMiddleInitial());
        patient_.setEmail(patient.getEmailAddress());
        patient_.setMaritalStatus(patient.getMaritalStatus());

        return patient_;
    }

    @Override
    public Date mapDate(String value) {
        if (value == null) {
            return null;
        }
        try {
            SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-yyyy");
            java.util.Date date = sdf1.parse(value);
            return new Date(date.getTime());
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
    }

    @Override
    public ProviderEntity providerToProviderDTO(Getpractitionersinfo provider) {
        if (provider == null) {
            return null;
        }

        ProviderEntity provider_ = new ProviderEntity();

        provider_.setSourceId(provider.getPractitionerID());
        provider_.setFirstName(provider.getFirstName());
        provider_.setLastName(provider.getLastName());
        provider_.setPhoneWork(provider.getPhone());
        provider_.setLicensureNpi(provider.getProviderNPI());
        provider_.setGender(provider.getSex());
        provider_.setMiddleName(provider.getMiddleInitial());
        provider_.setSuffix(provider.getSuffix());
        provider_.setPhoneFax(provider.getFaxNumber());
        provider_.setAnsispecialtycode(provider.getSpecialty());
        provider_.setEmail(provider.getEmailAddress());

        return provider_;
    }

    @Override
    public LocationEntity locationToLocationDTO(Getschedulinglocationsinfo location) {
        if (location == null) {
            return null;
        }

        LocationEntity location_ = new LocationEntity();

        location_.setSourceId(location.getSchedulingLocationID());
        location_.setZip(location.getLocationZip());
        location_.setCity(location.getLocationCity());
        location_.setPhone(location.getLocationPhone());
        location_.setState(location.getLocationState());
        location_.setFax(location.getLocationFax());
        location_.setLine2(location.getLocationStreet2());
        location_.setFriendlyName(location.getLocationName());
        location_.setLine1(location.getLocationStreet1());
        location_.setEmail(location.getLocationEmail());

        return location_;
    }

    /*
    @Override
    public Resource resourceToResourceDTO(Getresourcesinfo resource) {
        if (resource == null) {
            return null;
        }

        Resource resource_ = new Resource();

        resource_.setResourceID(resource.getResourceID());
        resource_.setAppointmentGroupID(resource.getAppointmentGroupID());
        resource_.setEncounterFormFormat(resource.getEncounterFormFormat());
        resource_.setDescription(resource.getDescription());
        resource_.setDefaultAppointmentTypeID(resource.getDefaultAppointmentTypeID());
        resource_.setAbbreviation(resource.getAbbreviation());
        resource_.setPractitionerID(resource.getPractitionerID());
        resource_.setResourceType(resource.getResourceType());

        return resource_;
    }
    */

    @Override
    public GroupEntity groupToGroupDTO(Getschedulingdepartmentsinfo group) {
        if (group == null) {
            return null;
        }

        GroupEntity group_ = new GroupEntity();

        AddressEntity addressByAddressId = new AddressEntity();
        group_.setAddressByAddressId(addressByAddressId);

        group_.setSourceId(group.getSchedulingDepartmentID());
        group_.setPhone(group.getPhone());
        group_.setName(group.getDescription());

        addressByAddressId.setCity(group.getCity());
        addressByAddressId.setState(group.getState());
        addressByAddressId.setLine1(group.getStreet1());
        addressByAddressId.setZip(group.getZipCode());
        addressByAddressId.setCountry(group.getCountryCode());
        addressByAddressId.setLine2(group.getStreet2());

        return group_;
    }
}
