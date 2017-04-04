
package com.doctrly.integration.allscripts.pojo;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import com.fasterxml.jackson.annotation.*;

import lombok.Data;
import lombok.ToString;

@ToString
//@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Account_Number",
    "Guarantor_Zip_Code",
    "ReferringDr_Abbr",
    "Work_Phone_Ext",
    "Patient_Employer_Name",
    "Account_Type_Desc",
    "Guarantor_Suffix",
    "City",
    "Patient_Med_Rec_No",
    "Is_Guarantor",
    "Sex",
    "PCP_Name",
    "Account_Type_Abbr",
    "HIPAAStmtExp",
    "Patient_Employer_ID",
    "Patient_Employer_Abbr",
    "Street2",
    "Work_Phone",
    "Account_ID",
    "Guarantor_Cell_Phone",
    "Guarantor_State",
    "Suffix",
    "Guarantor_Street2",
    "Guarantor_Street1",
    "Guarantor_MI",
    "EmergencyContactRelation",
    "PCP_Abbr",
    "Patient_ID",
    "Guarantor_SSN",
    "Ethnicity",
    "Guarantor_City",
    "Guarantor_Home_Phone",
    "Is_Patient",
    "Emergency_Contact",
    "Guarantor_Email",
    "Guarantor_DOB",
    "ReferringDr_Name",
    "Race",
    "RelationToGuarantor",
    "Patient_Enterprise_Number",
    "Guarantor_Name",
    "Guarantor_Work_Phone",
    "Marital_Status",
    "Patient_Number",
    "HideSSN",
    "State",
    "Guarantor_Country",
    "Zip_Code",
    "Usual_Provider_Name",
    "Guarantor_Last_Name",
    "Guarantor_Work_Ext",
    "Cell_Phone",
    "SSN",
    "Email_Address",
    "Street1",
    "Language",
    "HomePhone",
    "Middle_Initial",
    "SuppressSSN",
    "Guarantor_First_Name",
    "DOB",
    "Contact_ID",
    "Usual_Provider_Abbr",
    "Last_Name",
    "First_Name"
})
public class Getpatientdemographicsinfo {

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getGuarantorZipCode() {
        return guarantorZipCode;
    }

    public void setGuarantorZipCode(String guarantorZipCode) {
        this.guarantorZipCode = guarantorZipCode;
    }

    public String getReferringDrAbbr() {
        return referringDrAbbr;
    }

    public void setReferringDrAbbr(String referringDrAbbr) {
        this.referringDrAbbr = referringDrAbbr;
    }

    public String getWorkPhoneExt() {
        return workPhoneExt;
    }

    public void setWorkPhoneExt(String workPhoneExt) {
        this.workPhoneExt = workPhoneExt;
    }

    public String getPatientEmployerName() {
        return patientEmployerName;
    }

    public void setPatientEmployerName(String patientEmployerName) {
        this.patientEmployerName = patientEmployerName;
    }

    public String getAccountTypeDesc() {
        return accountTypeDesc;
    }

    public void setAccountTypeDesc(String accountTypeDesc) {
        this.accountTypeDesc = accountTypeDesc;
    }

    public String getGuarantorSuffix() {
        return guarantorSuffix;
    }

    public void setGuarantorSuffix(String guarantorSuffix) {
        this.guarantorSuffix = guarantorSuffix;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPatientMedRecNo() {
        return patientMedRecNo;
    }

    public void setPatientMedRecNo(String patientMedRecNo) {
        this.patientMedRecNo = patientMedRecNo;
    }

    public String getIsGuarantor() {
        return isGuarantor;
    }

    public void setIsGuarantor(String isGuarantor) {
        this.isGuarantor = isGuarantor;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getpCPName() {
        return pCPName;
    }

    public void setpCPName(String pCPName) {
        this.pCPName = pCPName;
    }

    public String getAccountTypeAbbr() {
        return accountTypeAbbr;
    }

    public void setAccountTypeAbbr(String accountTypeAbbr) {
        this.accountTypeAbbr = accountTypeAbbr;
    }

    public String gethIPAAStmtExp() {
        return hIPAAStmtExp;
    }

    public void sethIPAAStmtExp(String hIPAAStmtExp) {
        this.hIPAAStmtExp = hIPAAStmtExp;
    }

    public String getPatientEmployerID() {
        return patientEmployerID;
    }

    public void setPatientEmployerID(String patientEmployerID) {
        this.patientEmployerID = patientEmployerID;
    }

    public String getPatientEmployerAbbr() {
        return patientEmployerAbbr;
    }

    public void setPatientEmployerAbbr(String patientEmployerAbbr) {
        this.patientEmployerAbbr = patientEmployerAbbr;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getGuarantorCellPhone() {
        return guarantorCellPhone;
    }

    public void setGuarantorCellPhone(String guarantorCellPhone) {
        this.guarantorCellPhone = guarantorCellPhone;
    }

    public String getGuarantorState() {
        return guarantorState;
    }

    public void setGuarantorState(String guarantorState) {
        this.guarantorState = guarantorState;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getGuarantorStreet2() {
        return guarantorStreet2;
    }

    public void setGuarantorStreet2(String guarantorStreet2) {
        this.guarantorStreet2 = guarantorStreet2;
    }

    public String getGuarantorStreet1() {
        return guarantorStreet1;
    }

    public void setGuarantorStreet1(String guarantorStreet1) {
        this.guarantorStreet1 = guarantorStreet1;
    }

    public String getGuarantorMI() {
        return guarantorMI;
    }

    public void setGuarantorMI(String guarantorMI) {
        this.guarantorMI = guarantorMI;
    }

    public String getEmergencyContactRelation() {
        return emergencyContactRelation;
    }

    public void setEmergencyContactRelation(String emergencyContactRelation) {
        this.emergencyContactRelation = emergencyContactRelation;
    }

    public String getpCPAbbr() {
        return pCPAbbr;
    }

    public void setpCPAbbr(String pCPAbbr) {
        this.pCPAbbr = pCPAbbr;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getGuarantorSSN() {
        return guarantorSSN;
    }

    public void setGuarantorSSN(String guarantorSSN) {
        this.guarantorSSN = guarantorSSN;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getGuarantorCity() {
        return guarantorCity;
    }

    public void setGuarantorCity(String guarantorCity) {
        this.guarantorCity = guarantorCity;
    }

    public String getGuarantorHomePhone() {
        return guarantorHomePhone;
    }

    public void setGuarantorHomePhone(String guarantorHomePhone) {
        this.guarantorHomePhone = guarantorHomePhone;
    }

    public String getIsPatient() {
        return isPatient;
    }

    public void setIsPatient(String isPatient) {
        this.isPatient = isPatient;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getGuarantorEmail() {
        return guarantorEmail;
    }

    public void setGuarantorEmail(String guarantorEmail) {
        this.guarantorEmail = guarantorEmail;
    }

    public String getGuarantorDOB() {
        return guarantorDOB;
    }

    public void setGuarantorDOB(String guarantorDOB) {
        this.guarantorDOB = guarantorDOB;
    }

    public String getReferringDrName() {
        return referringDrName;
    }

    public void setReferringDrName(String referringDrName) {
        this.referringDrName = referringDrName;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getRelationToGuarantor() {
        return relationToGuarantor;
    }

    public void setRelationToGuarantor(String relationToGuarantor) {
        this.relationToGuarantor = relationToGuarantor;
    }

    public String getPatientEnterpriseNumber() {
        return patientEnterpriseNumber;
    }

    public void setPatientEnterpriseNumber(String patientEnterpriseNumber) {
        this.patientEnterpriseNumber = patientEnterpriseNumber;
    }

    public String getGuarantorName() {
        return guarantorName;
    }

    public void setGuarantorName(String guarantorName) {
        this.guarantorName = guarantorName;
    }

    public String getGuarantorWorkPhone() {
        return guarantorWorkPhone;
    }

    public void setGuarantorWorkPhone(String guarantorWorkPhone) {
        this.guarantorWorkPhone = guarantorWorkPhone;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(String patientNumber) {
        this.patientNumber = patientNumber;
    }

    public String getHideSSN() {
        return hideSSN;
    }

    public void setHideSSN(String hideSSN) {
        this.hideSSN = hideSSN;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getGuarantorCountry() {
        return guarantorCountry;
    }

    public void setGuarantorCountry(String guarantorCountry) {
        this.guarantorCountry = guarantorCountry;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getUsualProviderName() {
        return usualProviderName;
    }

    public void setUsualProviderName(String usualProviderName) {
        this.usualProviderName = usualProviderName;
    }

    public String getGuarantorLastName() {
        return guarantorLastName;
    }

    public void setGuarantorLastName(String guarantorLastName) {
        this.guarantorLastName = guarantorLastName;
    }

    public String getGuarantorWorkExt() {
        return guarantorWorkExt;
    }

    public void setGuarantorWorkExt(String guarantorWorkExt) {
        this.guarantorWorkExt = guarantorWorkExt;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getsSN() {
        return sSN;
    }

    public void setsSN(String sSN) {
        this.sSN = sSN;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getSuppressSSN() {
        return suppressSSN;
    }

    public void setSuppressSSN(String suppressSSN) {
        this.suppressSSN = suppressSSN;
    }

    public String getGuarantorFirstName() {
        return guarantorFirstName;
    }

    public void setGuarantorFirstName(String guarantorFirstName) {
        this.guarantorFirstName = guarantorFirstName;
    }

    public String getdOB() {
        return dOB;
    }

    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    public String getContactID() {
        return contactID;
    }

    public void setContactID(String contactID) {
        this.contactID = contactID;
    }

    public String getUsualProviderAbbr() {
        return usualProviderAbbr;
    }

    public void setUsualProviderAbbr(String usualProviderAbbr) {
        this.usualProviderAbbr = usualProviderAbbr;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("Account_Number")
    private String accountNumber;
    @JsonProperty("Guarantor_Zip_Code")
    private String guarantorZipCode;
    @JsonProperty("ReferringDr_Abbr")
    private String referringDrAbbr;
    @JsonProperty("Work_Phone_Ext")
    private String workPhoneExt;
    @JsonProperty("Patient_Employer_Name")
    private String patientEmployerName;
    @JsonProperty("Account_Type_Desc")
    private String accountTypeDesc;
    @JsonProperty("Guarantor_Suffix")
    private String guarantorSuffix;
    @JsonProperty("City")
    private String city;
    @JsonProperty("Patient_Med_Rec_No")
    private String patientMedRecNo;
    @JsonProperty("Is_Guarantor")
    private String isGuarantor;
    @JsonProperty("Sex")
    private String sex;
    @JsonProperty("PCP_Name")
    private String pCPName;
    @JsonProperty("Account_Type_Abbr")
    private String accountTypeAbbr;
    @JsonProperty("HIPAAStmtExp")
    private String hIPAAStmtExp;
    @JsonProperty("Patient_Employer_ID")
    private String patientEmployerID;
    @JsonProperty("Patient_Employer_Abbr")
    private String patientEmployerAbbr;
    @JsonProperty("Street2")
    private String street2;
    @JsonProperty("Work_Phone")
    private String workPhone;
    @JsonProperty("Account_ID")
    private String accountID;
    @JsonProperty("Guarantor_Cell_Phone")
    private String guarantorCellPhone;
    @JsonProperty("Guarantor_State")
    private String guarantorState;
    @JsonProperty("Suffix")
    private String suffix;
    @JsonProperty("Guarantor_Street2")
    private String guarantorStreet2;
    @JsonProperty("Guarantor_Street1")
    private String guarantorStreet1;
    @JsonProperty("Guarantor_MI")
    private String guarantorMI;
    @JsonProperty("EmergencyContactRelation")
    private String emergencyContactRelation;
    @JsonProperty("PCP_Abbr")
    private String pCPAbbr;
    @JsonProperty("Patient_ID")
    private String patientID;
    @JsonProperty("Guarantor_SSN")
    private String guarantorSSN;
    @JsonProperty("Ethnicity")
    private String ethnicity;
    @JsonProperty("Guarantor_City")
    private String guarantorCity;
    @JsonProperty("Guarantor_Home_Phone")
    private String guarantorHomePhone;
    @JsonProperty("Is_Patient")
    private String isPatient;
    @JsonProperty("Emergency_Contact")
    private String emergencyContact;
    @JsonProperty("Guarantor_Email")
    private String guarantorEmail;
    @JsonProperty("Guarantor_DOB")
    private String guarantorDOB;
    @JsonProperty("ReferringDr_Name")
    private String referringDrName;
    @JsonProperty("Race")
    private String race;
    @JsonProperty("RelationToGuarantor")
    private String relationToGuarantor;
    @JsonProperty("Patient_Enterprise_Number")
    private String patientEnterpriseNumber;
    @JsonProperty("Guarantor_Name")
    private String guarantorName;
    @JsonProperty("Guarantor_Work_Phone")
    private String guarantorWorkPhone;
    @JsonProperty("Marital_Status")
    private String maritalStatus;
    @JsonProperty("Patient_Number")
    private String patientNumber;
    @JsonProperty("HideSSN")
    private String hideSSN;
    @JsonProperty("State")
    private String state;
    @JsonProperty("Guarantor_Country")
    private String guarantorCountry;
    @JsonProperty("Zip_Code")
    private String zipCode;
    @JsonProperty("Usual_Provider_Name")
    private String usualProviderName;
    @JsonProperty("Guarantor_Last_Name")
    private String guarantorLastName;
    @JsonProperty("Guarantor_Work_Ext")
    private String guarantorWorkExt;
    @JsonProperty("Cell_Phone")
    private String cellPhone;
    @JsonProperty("SSN")
    private String sSN;
    @JsonProperty("Email_Address")
    private String emailAddress;
    @JsonProperty("Street1")
    private String street1;
    @JsonProperty("Language")
    private String language;
    @JsonProperty("HomePhone")
    private String homePhone;
    @JsonProperty("Middle_Initial")
    private String middleInitial;
    @JsonProperty("SuppressSSN")
    private String suppressSSN;
    @JsonProperty("Guarantor_First_Name")
    private String guarantorFirstName;
    @JsonProperty("DOB")
    private String dOB;
    @JsonProperty("Contact_ID")
    private String contactID;
    @JsonProperty("Usual_Provider_Abbr")
    private String usualProviderAbbr;
    @JsonProperty("Last_Name")
    private String lastName;
    @JsonProperty("First_Name")
    private String firstName;


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
