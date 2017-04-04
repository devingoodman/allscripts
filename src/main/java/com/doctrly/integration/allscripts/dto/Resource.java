package com.doctrly.integration.allscripts.dto;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;


//@Data
public class Resource {
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

    private String appointmentGroupID;
    private String resourceID;
    private String resourceType;
    private String abbreviation;
    private String practitionerID;
    private String description;
    private String encounterFormFormat;
    private String defaultAppointmentTypeID;

}