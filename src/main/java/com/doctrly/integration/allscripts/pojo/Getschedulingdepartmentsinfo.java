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
        "Zip_Code",
        "Country_Code",
        "Encounter_Form_Format",
        "State",
        "Department_ID",
        "Street1",
        "Scheduling_Department_ID",
        "Phone_Ext",
        "City",
        "Phone",
        "Description",
        "Street2",
        "Abbreviation"
})
public class Getschedulingdepartmentsinfo {
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getEncounterFormFormat() {
        return encounterFormFormat;
    }

    public void setEncounterFormFormat(String encounterFormFormat) {
        this.encounterFormFormat = encounterFormFormat;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getSchedulingDepartmentID() {
        return schedulingDepartmentID;
    }

    public void setSchedulingDepartmentID(String schedulingDepartmentID) {
        this.schedulingDepartmentID = schedulingDepartmentID;
    }

    public String getPhoneExt() {
        return phoneExt;
    }

    public void setPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @JsonProperty("Zip_Code")
    private String zipCode;
    @JsonProperty("Country_Code")
    private String countryCode;
    @JsonProperty("Encounter_Form_Format")
    private String encounterFormFormat;
    @JsonProperty("State")
    private String state;
    @JsonProperty("Department_ID")
    private String departmentID;
    @JsonProperty("Street1")
    private String street1;
    @JsonProperty("Scheduling_Department_ID")
    private String schedulingDepartmentID;
    @JsonProperty("Phone_Ext")
    private String phoneExt;
    @JsonProperty("City")
    private String city;
    @JsonProperty("Phone")
    private String phone;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("Street2")
    private String street2;
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