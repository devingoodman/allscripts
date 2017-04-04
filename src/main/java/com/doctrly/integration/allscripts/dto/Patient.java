package com.doctrly.integration.allscripts.dto;

import lombok.Data;
import lombok.ToString;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;

@ToString
//@Data
public class Patient {

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public BigInteger getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(BigInteger organizationId) {
        this.organizationId = organizationId;
    }

    public BigInteger getGroupId() {
        return groupId;
    }

    public void setGroupId(BigInteger groupId) {
        this.groupId = groupId;
    }

    public BigInteger getProviderId() {
        return providerId;
    }

    public void setProviderId(BigInteger providerId) {
        this.providerId = providerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEncryptedSsn() {
        return encryptedSsn;
    }

    public void setEncryptedSsn(String encryptedSsn) {
        this.encryptedSsn = encryptedSsn;
    }

    public String getEncryptedSsnSalt() {
        return encryptedSsnSalt;
    }

    public void setEncryptedSsnSalt(String encryptedSsnSalt) {
        this.encryptedSsnSalt = encryptedSsnSalt;
    }

    public String getEncryptedSsnIv() {
        return encryptedSsnIv;
    }

    public void setEncryptedSsnIv(String encryptedSsnIv) {
        this.encryptedSsnIv = encryptedSsnIv;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getDeceasedDate() {
        return deceasedDate;
    }

    public void setDeceasedDate(Date deceasedDate) {
        this.deceasedDate = deceasedDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneMobile() {
        return phoneMobile;
    }

    public void setPhoneMobile(String phoneMobile) {
        this.phoneMobile = phoneMobile;
    }

    public String getPhoneHome() {
        return phoneHome;
    }

    public void setPhoneHome(String phoneHome) {
        this.phoneHome = phoneHome;
    }

    public String getPhoneWork() {
        return phoneWork;
    }

    public void setPhoneWork(String phoneWork) {
        this.phoneWork = phoneWork;
    }

    public String getPreferredContactMethod() {
        return preferredContactMethod;
    }

    public void setPreferredContactMethod(String preferredContactMethod) {
        this.preferredContactMethod = preferredContactMethod;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getEmergencyContactFirstName() {
        return emergencyContactFirstName;
    }

    public void setEmergencyContactFirstName(String emergencyContactFirstName) {
        this.emergencyContactFirstName = emergencyContactFirstName;
    }

    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }

    public void setEmergencyContactPhone(String emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone;
    }

    public String getEmergencyContactRelationship() {
        return emergencyContactRelationship;
    }

    public void setEmergencyContactRelationship(String emergencyContactRelationship) {
        this.emergencyContactRelationship = emergencyContactRelationship;
    }

    public BigInteger getHomeAddressId() {
        return homeAddressId;
    }

    public void setHomeAddressId(BigInteger homeAddressId) {
        this.homeAddressId = homeAddressId;
    }

    public BigInteger getEmployerAddressId() {
        return employerAddressId;
    }

    public void setEmployerAddressId(BigInteger employerAddressId) {
        this.employerAddressId = employerAddressId;
    }

    public String getEmergencyContactLastName() {
        return emergencyContactLastName;
    }

    public void setEmergencyContactLastName(String emergencyContactLastName) {
        this.emergencyContactLastName = emergencyContactLastName;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Organization getOrganizationByOrganizationId() {
        return organizationByOrganizationId;
    }

    public void setOrganizationByOrganizationId(Organization organizationByOrganizationId) {
        this.organizationByOrganizationId = organizationByOrganizationId;
    }

    public Group getGroupByGroupId() {
        return groupByGroupId;
    }

    public void setGroupByGroupId(Group groupByGroupId) {
        this.groupByGroupId = groupByGroupId;
    }

    public Provider getProviderByProviderId() {
        return providerByProviderId;
    }

    public void setProviderByProviderId(Provider providerByProviderId) {
        this.providerByProviderId = providerByProviderId;
    }

    public Address getAddressByHomeAddressId() {
        return addressByHomeAddressId;
    }

    public void setAddressByHomeAddressId(Address addressByHomeAddressId) {
        this.addressByHomeAddressId = addressByHomeAddressId;
    }

    public Address getAddressByEmployerAddressId() {
        return addressByEmployerAddressId;
    }

    public void setAddressByEmployerAddressId(Address addressByEmployerAddressId) {
        this.addressByEmployerAddressId = addressByEmployerAddressId;
    }

    public Collection<Allergy> getAllergiesById() {
        return allergiesById;
    }

    public void setAllergiesById(Collection<Allergy> allergiesById) {
        this.allergiesById = allergiesById;
    }

    public Collection<Appointment> getAppointmentsById() {
        return appointmentsById;
    }

    public void setAppointmentsById(Collection<Appointment> appointmentsById) {
        this.appointmentsById = appointmentsById;
    }

    public Collection<Encounter> getEncountersById() {
        return encountersById;
    }

    public void setEncountersById(Collection<Encounter> encountersById) {
        this.encountersById = encountersById;
    }

    public Collection<LabResult> getLabResultsById() {
        return labResultsById;
    }

    public void setLabResultsById(Collection<LabResult> labResultsById) {
        this.labResultsById = labResultsById;
    }

    public Collection<Medication> getMedicationsById() {
        return medicationsById;
    }

    public void setMedicationsById(Collection<Medication> medicationsById) {
        this.medicationsById = medicationsById;
    }

    public Collection<PatientDocument> getPatientDocumentsById() {
        return patientDocumentsById;
    }

    public void setPatientDocumentsById(Collection<PatientDocument> patientDocumentsById) {
        this.patientDocumentsById = patientDocumentsById;
    }

    public Collection<PatientSourceSystem> getPatientSourceSystemsById() {
        return patientSourceSystemsById;
    }

    public void setPatientSourceSystemsById(Collection<PatientSourceSystem> patientSourceSystemsById) {
        this.patientSourceSystemsById = patientSourceSystemsById;
    }

    private BigInteger id;
    private String sourceId;
    private BigInteger organizationId;
    private BigInteger groupId;
    private BigInteger providerId;

    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private String nickname;
    private String encryptedSsn;
    private String encryptedSsnSalt;
    private String encryptedSsnIv;
    private Date birthDate;
    private Date deceasedDate;
    private String email;
    private String phoneMobile;
    private String phoneHome;
    private String phoneWork;
    private String preferredContactMethod;
    private String maritalStatus;
    private String spouseName;
    private String gender;
    private String language;
    private String ethnicity;
    private String race;
    private String employerName;
    private String emergencyContactFirstName;
    private String emergencyContactPhone;
    private String emergencyContactRelationship;
    private BigInteger homeAddressId;
    private BigInteger employerAddressId;
    private String emergencyContactLastName;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    private Organization organizationByOrganizationId;
    private Group groupByGroupId;
    private Provider providerByProviderId;
    private Address addressByHomeAddressId;
    private Address addressByEmployerAddressId;

    private Collection<Allergy> allergiesById;
    private Collection<Appointment> appointmentsById;
    private Collection<Encounter> encountersById;
    private Collection<LabResult> labResultsById;
    private Collection<Medication> medicationsById;
    private Collection<PatientDocument> patientDocumentsById;
    private Collection<PatientSourceSystem> patientSourceSystemsById;

}
