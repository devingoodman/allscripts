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
        "Location_Phone_Ext",
        "Location_Fax",
        "Location_Street1",
        "Location_State",
        "Encounter_Form_Format",
        "Location_City",
        "Location_Phone",
        "Location_Description",
        "Scheduling_Location_ID",
        "Location_ID",
        "Description",
        "Location_Name",
        "Location_Street2",
        "Location_Zip",
        "Location_Email",
        "Location_Abbreviation",
        "Abbreviation"
})
public class Getschedulinglocationsinfo {
    public String getLocationPhoneExt() {
        return locationPhoneExt;
    }

    public void setLocationPhoneExt(String locationPhoneExt) {
        this.locationPhoneExt = locationPhoneExt;
    }

    public String getLocationFax() {
        return locationFax;
    }

    public void setLocationFax(String locationFax) {
        this.locationFax = locationFax;
    }

    public String getLocationStreet1() {
        return locationStreet1;
    }

    public void setLocationStreet1(String locationStreet1) {
        this.locationStreet1 = locationStreet1;
    }

    public String getLocationState() {
        return locationState;
    }

    public void setLocationState(String locationState) {
        this.locationState = locationState;
    }

    public String getEncounterFormFormat() {
        return encounterFormFormat;
    }

    public void setEncounterFormFormat(String encounterFormFormat) {
        this.encounterFormFormat = encounterFormFormat;
    }

    public String getLocationCity() {
        return locationCity;
    }

    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity;
    }

    public String getLocationPhone() {
        return locationPhone;
    }

    public void setLocationPhone(String locationPhone) {
        this.locationPhone = locationPhone;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public String getSchedulingLocationID() {
        return schedulingLocationID;
    }

    public void setSchedulingLocationID(String schedulingLocationID) {
        this.schedulingLocationID = schedulingLocationID;
    }

    public String getLocationID() {
        return locationID;
    }

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationStreet2() {
        return locationStreet2;
    }

    public void setLocationStreet2(String locationStreet2) {
        this.locationStreet2 = locationStreet2;
    }

    public String getLocationZip() {
        return locationZip;
    }

    public void setLocationZip(String locationZip) {
        this.locationZip = locationZip;
    }

    public String getLocationEmail() {
        return locationEmail;
    }

    public void setLocationEmail(String locationEmail) {
        this.locationEmail = locationEmail;
    }

    public String getLocationAbbreviation() {
        return locationAbbreviation;
    }

    public void setLocationAbbreviation(String locationAbbreviation) {
        this.locationAbbreviation = locationAbbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @JsonProperty("Location_Phone_Ext")
    private String locationPhoneExt;
    @JsonProperty("Location_Fax")
    private String locationFax;
    @JsonProperty("Location_Street1")
    private String locationStreet1;
    @JsonProperty("Location_State")
    private String locationState;
    @JsonProperty("Encounter_Form_Format")
    private String encounterFormFormat;
    @JsonProperty("Location_City")
    private String locationCity;
    @JsonProperty("Location_Phone")
    private String locationPhone;
    @JsonProperty("Location_Description")
    private String locationDescription;
    @JsonProperty("Scheduling_Location_ID")
    private String schedulingLocationID;
    @JsonProperty("Location_ID")
    private String locationID;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("Location_Name")
    private String locationName;
    @JsonProperty("Location_Street2")
    private String locationStreet2;
    @JsonProperty("Location_Zip")
    private String locationZip;
    @JsonProperty("Location_Email")
    private String locationEmail;
    @JsonProperty("Location_Abbreviation")
    private String locationAbbreviation;
    @JsonProperty("Abbreviation")
    private String abbreviation;


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