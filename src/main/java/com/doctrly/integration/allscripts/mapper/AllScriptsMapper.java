package com.doctrly.integration.allscripts.mapper;

import com.doctrly.integration.allscripts.entity.*;
import com.doctrly.integration.allscripts.pojo.*;


import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper
public interface AllScriptsMapper {

    AllScriptsMapper INSTANCE = Mappers.getMapper( AllScriptsMapper.class );

    // TODO: add MRN, patient address

    // **** Appointment ****
    @Mappings({
            @Mapping(source = "appointmentID", target = "sourceId"),
            @Mapping(source = "patientID", target = "patientId"),
            @Mapping(source = "resourceID", target = "providerId"),
            @Mapping(source = "schedulingLocationID", target = "locationId"),
            @Mapping(source = "apptTypeDesc", target = "appointmentType"),
            @Mapping(source = "duration", target = "duration"),
            @Mapping(source = "appointmentDateTime", dateFormat = "MM/dd/yyyy hh:mma", target = "appointmentDatetime"),
            @Mapping(source = "apptComments", target = "notes")
    })
    AppointmentEntity appointmentToAppointmentDTO(Getappointmentsbychangedttminfo appointment);

    @IterableMapping(dateFormat = "MM/dd/yyyy hh:mma")
    java.sql.Timestamp mapDateTime(java.lang.String value);


    // **** Patient ****
    //TODO: "Patient_Med_Rec_No"
    @Mappings({
            @Mapping(source = "patientID", target = "sourceId"),
            @Mapping(source = "firstName", target = "firstName"),
            @Mapping(source = "middleInitial", target = "middleName"),
            @Mapping(source = "lastName", target = "lastName"),
            @Mapping(source = "suffix", target = "suffix"),
            @Mapping(source = "sSN", target = "encryptedSsn"),
            @Mapping(source = "dOB", dateFormat = "MM/dd/yyyy", target = "birthDate"),
            @Mapping(source = "emailAddress", target = "email"),
            @Mapping(source = "cellPhone", target = "phoneMobile"),
            @Mapping(source = "homePhone", target = "phoneHome"),
            @Mapping(source = "workPhone", target = "phoneWork"),
            @Mapping(source = "maritalStatus", target = "maritalStatus"),
            @Mapping(source = "sex", target = "gender"),
            @Mapping(source = "language", target = "language"),
            @Mapping(source = "ethnicity", target = "ethnicity"),
            @Mapping(source = "race", target = "race"),
            @Mapping(source = "patientEmployerName", target = "employerName"),
            @Mapping(source = "emergencyContact", target = "emergencyContactFirstName"),
            @Mapping(source = "contactID", target = "emergencyContactPhone"),
            @Mapping(source = "emergencyContactRelation", target = "emergencyContactRelationship")
    })
    PatientEntity patientToPatientDTO(Getpatientdemographicsinfo patient);

    @IterableMapping(dateFormat = "MM/dd/yyyy")
    java.sql.Date mapDate(java.lang.String value);


    // **** Resource ****
    /*
    @Mappings({
            @Mapping(source = "appointmentGroupID", target = "appointmentGroupID"),
            @Mapping(source = "resourceID", target = "resourceID"),
            @Mapping(source = "resourceType", target = "resourceType"),
            @Mapping(source = "abbreviation", target = "abbreviation"),
            @Mapping(source = "practitionerID", target = "practitionerID"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "encounterFormFormat", target = "encounterFormFormat"),
            @Mapping(source = "defaultAppointmentTypeID", target = "defaultAppointmentTypeID")
    })
    ResourceEntity resourceToResourceDTO(Getresourcesinfo resource);
    */


    // **** Group ****
    //TODO: "Phone_Ext"
    @Mappings({
            @Mapping(source = "schedulingDepartmentID", target = "sourceId"),
            @Mapping(source = "description", target = "name"),
            @Mapping(source = "phone", target = "phone"),
            @Mapping(source = "street1", target = "addressByAddressId.line1"),
            @Mapping(source = "street2", target = "addressByAddressId.line2"),
            @Mapping(source = "city", target = "addressByAddressId.city"),
            @Mapping(source = "zipCode", target = "addressByAddressId.zip"),
            @Mapping(source = "state", target = "addressByAddressId.state"),
            @Mapping(source = "countryCode", target = "addressByAddressId.country")
    })
    GroupEntity groupToGroupDTO(Getschedulingdepartmentsinfo group);


    // **** Location ****
    //TODO: "Location_Phone_Ext"
    @Mappings({
            @Mapping(source = "schedulingLocationID", target = "sourceId"),
            @Mapping(source = "locationName", target = "friendlyName"),
            @Mapping(source = "locationStreet1", target = "line1"),
            @Mapping(source = "locationStreet2", target = "line2"),
            @Mapping(source = "locationCity", target = "city"),
            @Mapping(source = "locationState", target = "state"),
            @Mapping(source = "locationZip", target = "zip"),
            @Mapping(source = "locationPhone", target = "phone"),
            @Mapping(source = "locationFax", target = "fax"),
            @Mapping(source = "locationEmail", target = "email")
    })
    LocationEntity locationToLocationDTO(Getschedulinglocationsinfo location);


    // **** Provider ****
    //TODO: "Phone_Ext"
    @Mappings({
            @Mapping(source = "practitionerID", target = "sourceId"),
            @Mapping(source = "firstName", target = "firstName"),
            @Mapping(source = "middleInitial", target = "middleName"),
            @Mapping(source = "lastName", target = "lastName"),
            @Mapping(source = "suffix", target = "suffix"),
            @Mapping(source = "specialty", target = "ansispecialtycode"),
            @Mapping(source = "phone", target = "phoneWork"),
            @Mapping(source = "faxNumber", target = "phoneFax"),
            @Mapping(source = "emailAddress", target = "email"),
            @Mapping(source = "sex", target = "gender"),
            @Mapping(source = "providerNPI", target = "licensureNpi")
    })
    ProviderEntity providerToProviderDTO(Getpractitionersinfo provider);

}
