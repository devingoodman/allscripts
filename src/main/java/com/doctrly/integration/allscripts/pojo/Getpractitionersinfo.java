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
        "Is_Org_Member",
        "State",
        "Suffix",
        "Phone_Ext",
        "Practitioner_ID",
        "Default_Department_Desc",
        "Last_Modified_By",
        "Is_Non_Person",
        "Is_Mid_Level",
        "UPIN",
        "Specialist_CoPay_Applies",
        "Federal_ID_Suffix",
        "Referring_Provider_NPI",
        "FullName",
        "Federal_ID_Sub_No",
        "Is_Physician",
        "Email_Address",
        "Inactivation_Date",
        "Federal_ID_No",
        "GL_Sub_Account_Number",
        "First_Name",
        "Sex",
        "Provider_NPI",
        "Is_Ref_Source",
        "Date_Of_Birth",
        "Street1",
        "Street2",
        "Country_Code",
        "Specialty",
        "Specialty_ID",
        "Last_Modified_DateTime",
        "Middle_Initial",
        "Fax_Number",
        "Abbreviation",
        "SSN",
        "Phone",
        "Last_Name",
        "Zip_Code",
        "Default_Department_Abbr",
        "City"
})
public class Getpractitionersinfo {
    public String getIsOrgMember() {
        return isOrgMember;
    }

    public void setIsOrgMember(String isOrgMember) {
        this.isOrgMember = isOrgMember;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getPhoneExt() {
        return phoneExt;
    }

    public void setPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
    }

    public String getPractitionerID() {
        return practitionerID;
    }

    public void setPractitionerID(String practitionerID) {
        this.practitionerID = practitionerID;
    }

    public String getDefaultDepartmentDesc() {
        return defaultDepartmentDesc;
    }

    public void setDefaultDepartmentDesc(String defaultDepartmentDesc) {
        this.defaultDepartmentDesc = defaultDepartmentDesc;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public String getIsNonPerson() {
        return isNonPerson;
    }

    public void setIsNonPerson(String isNonPerson) {
        this.isNonPerson = isNonPerson;
    }

    public String getIsMidLevel() {
        return isMidLevel;
    }

    public void setIsMidLevel(String isMidLevel) {
        this.isMidLevel = isMidLevel;
    }

    public String getuPIN() {
        return uPIN;
    }

    public void setuPIN(String uPIN) {
        this.uPIN = uPIN;
    }

    public String getSpecialistCoPayApplies() {
        return specialistCoPayApplies;
    }

    public void setSpecialistCoPayApplies(String specialistCoPayApplies) {
        this.specialistCoPayApplies = specialistCoPayApplies;
    }

    public String getFederalIDSuffix() {
        return federalIDSuffix;
    }

    public void setFederalIDSuffix(String federalIDSuffix) {
        this.federalIDSuffix = federalIDSuffix;
    }

    public String getReferringProviderNPI() {
        return referringProviderNPI;
    }

    public void setReferringProviderNPI(String referringProviderNPI) {
        this.referringProviderNPI = referringProviderNPI;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFederalIDSubNo() {
        return federalIDSubNo;
    }

    public void setFederalIDSubNo(String federalIDSubNo) {
        this.federalIDSubNo = federalIDSubNo;
    }

    public String getIsPhysician() {
        return isPhysician;
    }

    public void setIsPhysician(String isPhysician) {
        this.isPhysician = isPhysician;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getInactivationDate() {
        return inactivationDate;
    }

    public void setInactivationDate(String inactivationDate) {
        this.inactivationDate = inactivationDate;
    }

    public String getFederalIDNo() {
        return federalIDNo;
    }

    public void setFederalIDNo(String federalIDNo) {
        this.federalIDNo = federalIDNo;
    }

    public String getgLSubAccountNumber() {
        return gLSubAccountNumber;
    }

    public void setgLSubAccountNumber(String gLSubAccountNumber) {
        this.gLSubAccountNumber = gLSubAccountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getProviderNPI() {
        return providerNPI;
    }

    public void setProviderNPI(String providerNPI) {
        this.providerNPI = providerNPI;
    }

    public String getIsRefSource() {
        return isRefSource;
    }

    public void setIsRefSource(String isRefSource) {
        this.isRefSource = isRefSource;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getSpecialtyID() {
        return specialtyID;
    }

    public void setSpecialtyID(String specialtyID) {
        this.specialtyID = specialtyID;
    }

    public String getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    public void setLastModifiedDateTime(String lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getsSN() {
        return sSN;
    }

    public void setsSN(String sSN) {
        this.sSN = sSN;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getDefaultDepartmentAbbr() {
        return defaultDepartmentAbbr;
    }

    public void setDefaultDepartmentAbbr(String defaultDepartmentAbbr) {
        this.defaultDepartmentAbbr = defaultDepartmentAbbr;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("Is_Org_Member")
    private String isOrgMember;
    @JsonProperty("State")
    private String state;
    @JsonProperty("Suffix")
    private String suffix;
    @JsonProperty("Phone_Ext")
    private String phoneExt;
    @JsonProperty("Practitioner_ID")
    private String practitionerID;
    @JsonProperty("Default_Department_Desc")
    private String defaultDepartmentDesc;
    @JsonProperty("Last_Modified_By")
    private String lastModifiedBy;
    @JsonProperty("Is_Non_Person")
    private String isNonPerson;
    @JsonProperty("Is_Mid_Level")
    private String isMidLevel;
    @JsonProperty("UPIN")
    private String uPIN;
    @JsonProperty("Specialist_CoPay_Applies")
    private String specialistCoPayApplies;
    @JsonProperty("Federal_ID_Suffix")
    private String federalIDSuffix;
    @JsonProperty("Referring_Provider_NPI")
    private String referringProviderNPI;
    @JsonProperty("FullName")
    private String fullName;
    @JsonProperty("Federal_ID_Sub_No")
    private String federalIDSubNo;
    @JsonProperty("Is_Physician")
    private String isPhysician;
    @JsonProperty("Email_Address")
    private String emailAddress;
    @JsonProperty("Inactivation_Date")
    private String inactivationDate;
    @JsonProperty("Federal_ID_No")
    private String federalIDNo;
    @JsonProperty("GL_Sub_Account_Number")
    private String gLSubAccountNumber;
    @JsonProperty("First_Name")
    private String firstName;
    @JsonProperty("Sex")
    private String sex;
    @JsonProperty("Provider_NPI")
    private String providerNPI;
    @JsonProperty("Is_Ref_Source")
    private String isRefSource;
    @JsonProperty("Date_Of_Birth")
    private String dateOfBirth;
    @JsonProperty("Street1")
    private String street1;
    @JsonProperty("Street2")
    private String street2;
    @JsonProperty("Country_Code")
    private String countryCode;
    @JsonProperty("Specialty")
    private String specialty;
    @JsonProperty("Specialty_ID")
    private String specialtyID;
    @JsonProperty("Last_Modified_DateTime")
    private String lastModifiedDateTime;
    @JsonProperty("Middle_Initial")
    private String middleInitial;
    @JsonProperty("Fax_Number")
    private String faxNumber;
    @JsonProperty("Abbreviation")
    private String abbreviation;
    @JsonProperty("SSN")
    private String sSN;
    @JsonProperty("Phone")
    private String phone;
    @JsonProperty("Last_Name")
    private String lastName;
    @JsonProperty("Zip_Code")
    private String zipCode;
    @JsonProperty("Default_Department_Abbr")
    private String defaultDepartmentAbbr;
    @JsonProperty("City")
    private String city;


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