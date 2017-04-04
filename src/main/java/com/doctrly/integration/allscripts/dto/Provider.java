package com.doctrly.integration.allscripts.dto;

import lombok.Data;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;


//@Data
public class Provider {
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

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getAnsispecialtycode() {
        return ansispecialtycode;
    }

    public void setAnsispecialtycode(String ansispecialtycode) {
        this.ansispecialtycode = ansispecialtycode;
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

    public String getPhonePager() {
        return phonePager;
    }

    public void setPhonePager(String phonePager) {
        this.phonePager = phonePager;
    }

    public String getPhoneFax() {
        return phoneFax;
    }

    public void setPhoneFax(String phoneFax) {
        this.phoneFax = phoneFax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getLicensureState() {
        return licensureState;
    }

    public void setLicensureState(String licensureState) {
        this.licensureState = licensureState;
    }

    public String getLicensureNpi() {
        return licensureNpi;
    }

    public void setLicensureNpi(String licensureNpi) {
        this.licensureNpi = licensureNpi;
    }

    public String getLicensureDea() {
        return licensureDea;
    }

    public void setLicensureDea(String licensureDea) {
        this.licensureDea = licensureDea;
    }

    public String getLicensureGmc() {
        return licensureGmc;
    }

    public void setLicensureGmc(String licensureGmc) {
        this.licensureGmc = licensureGmc;
    }

    public String getLicensureNhs() {
        return licensureNhs;
    }

    public void setLicensureNhs(String licensureNhs) {
        this.licensureNhs = licensureNhs;
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

    public Collection<GroupProvider> getGroupProvidersById() {
        return groupProvidersById;
    }

    public void setGroupProvidersById(Collection<GroupProvider> groupProvidersById) {
        this.groupProvidersById = groupProvidersById;
    }

    public Collection<Patient> getPatientsById() {
        return patientsById;
    }

    public void setPatientsById(Collection<Patient> patientsById) {
        this.patientsById = patientsById;
    }

    public Collection<PatientDocument> getPatientDocumentsById() {
        return patientDocumentsById;
    }

    public void setPatientDocumentsById(Collection<PatientDocument> patientDocumentsById) {
        this.patientDocumentsById = patientDocumentsById;
    }

    private BigInteger id;
    private String sourceId;
    private BigInteger organizationId;
    private BigInteger groupId;

    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private String degree;
    private String ansispecialtycode;
    private String phoneMobile;
    private String phoneHome;
    private String phoneWork;
    private String phonePager;
    private String phoneFax;
    private String email;
    private String gender;
    private String language;
    private String licensureState;
    private String licensureNpi;
    private String licensureDea;
    private String licensureGmc;
    private String licensureNhs;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    private Organization organizationByOrganizationId;
    private Group groupByGroupId;

    private Collection<Appointment> appointmentsById;
    private Collection<Encounter> encountersById;
    private Collection<GroupProvider> groupProvidersById;
    private Collection<Patient> patientsById;
    private Collection<PatientDocument> patientDocumentsById;

}
