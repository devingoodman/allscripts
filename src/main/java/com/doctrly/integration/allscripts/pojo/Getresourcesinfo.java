package com.doctrly.integration.allscripts.pojo;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import com.fasterxml.jackson.annotation.*;

import lombok.Data;


//@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Appointment_Group_ID",
        "Resource_ID",
        "Resource_Type",
        "Abbreviation",
        "Practitioner_ID",
        "Description",
        "Encounter_Form_Format",
        "Default_Appointment_Type_ID"
})
public class Getresourcesinfo {
    public String getAppointmentGroupID() {
        return appointmentGroupID;
    }

    public void setAppointmentGroupID(String appointmentGroupID) {
        this.appointmentGroupID = appointmentGroupID;
    }

    public String getResourceID() {
        return resourceID;
    }

    public void setResourceID(String resourceID) {
        this.resourceID = resourceID;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getPractitionerID() {
        return practitionerID;
    }

    public void setPractitionerID(String practitionerID) {
        this.practitionerID = practitionerID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEncounterFormFormat() {
        return encounterFormFormat;
    }

    public void setEncounterFormFormat(String encounterFormFormat) {
        this.encounterFormFormat = encounterFormFormat;
    }

    public String getDefaultAppointmentTypeID() {
        return defaultAppointmentTypeID;
    }

    public void setDefaultAppointmentTypeID(String defaultAppointmentTypeID) {
        this.defaultAppointmentTypeID = defaultAppointmentTypeID;
    }

    @JsonProperty("Appointment_Group_ID")
    private String appointmentGroupID;
    @JsonProperty("Resource_ID")
    private String resourceID;
    @JsonProperty("Resource_Type")
    private String resourceType;
    @JsonProperty("Abbreviation")
    private String abbreviation;
    @JsonProperty("Practitioner_ID")
    private String practitionerID;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("Encounter_Form_Format")
    private String encounterFormFormat;
    @JsonProperty("Default_Appointment_Type_ID")
    private String defaultAppointmentTypeID;


    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }
    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}