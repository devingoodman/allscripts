package com.doctrly.integration.allscripts.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;


@Entity
@Table(name = "patient", catalog = "")
public class PatientEntity {
    private BigInteger id;

    private String sourceId;

    @Basic
    @Column(name = "source_id")
    public String getSourceId() {
        return sourceId;
    }
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    private BigInteger organizationId;
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
    private String emergencyContactLastName;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Collection<AllergyEntity> allergiesById;
    private Collection<AppointmentEntity> appointmentsById;
    private Collection<EncounterEntity> encountersById;
    private Collection<LabResultEntity> labResultsById;
    private Collection<MedicationEntity> medicationsById;
    private AddressEntity addressByHomeAddressId;
    private AddressEntity addressByEmployerAddressId;
    private OrganizationEntity organizationByOrganizationId;



    private GroupEntity     groupByGroupId;
    private ProviderEntity  providerByProviderId;

    @Basic
    @Column(name = "group_id", insertable=false, updatable = false)
    public BigInteger getGroupId() {
        return groupId;
    }
    public void setGroupId(BigInteger groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "provider_id", insertable=false, updatable = false)
    public BigInteger getProviderId() {
        return providerId;
    }
    public void setProviderId(BigInteger providerId) {
        this.providerId = providerId;
    }

    private BigInteger groupId;
    private BigInteger providerId;


    @Id
    @Column(name = "id")
    public BigInteger getId() {
        return id;
    }
    public void setId(BigInteger id) {
        this.id = id;
    }

    @Basic
    @Column(name = "organization_id", insertable=false, updatable = false)
    public BigInteger getOrganizationId() {
        return organizationId;
    }
    public void setOrganizationId(BigInteger organizationId) {
        this.organizationId = organizationId;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "middle_name")
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Basic
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "suffix")
    public String getSuffix() {
        return suffix;
    }
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    @Basic
    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "encrypted_ssn")
    public String getEncryptedSsn() {
        return encryptedSsn;
    }
    public void setEncryptedSsn(String encryptedSsn) {
        this.encryptedSsn = encryptedSsn;
    }

    @Basic
    @Column(name = "encrypted_ssn_salt")
    public String getEncryptedSsnSalt() {
        return encryptedSsnSalt;
    }
    public void setEncryptedSsnSalt(String encryptedSsnSalt) {
        this.encryptedSsnSalt = encryptedSsnSalt;
    }

    @Basic
    @Column(name = "encrypted_ssn_iv")
    public String getEncryptedSsnIv() {
        return encryptedSsnIv;
    }
    public void setEncryptedSsnIv(String encryptedSsnIv) {
        this.encryptedSsnIv = encryptedSsnIv;
    }

    @Basic
    @Column(name = "birth_date")
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "deceased_date")
    public Date getDeceasedDate() {
        return deceasedDate;
    }
    public void setDeceasedDate(Date deceasedDate) {
        this.deceasedDate = deceasedDate;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone_mobile")
    public String getPhoneMobile() {
        return phoneMobile;
    }
    public void setPhoneMobile(String phoneMobile) {
        this.phoneMobile = phoneMobile;
    }

    @Basic
    @Column(name = "phone_home")
    public String getPhoneHome() {
        return phoneHome;
    }
    public void setPhoneHome(String phoneHome) {
        this.phoneHome = phoneHome;
    }

    @Basic
    @Column(name = "phone_work")
    public String getPhoneWork() {
        return phoneWork;
    }
    public void setPhoneWork(String phoneWork) {
        this.phoneWork = phoneWork;
    }

    @Basic
    @Column(name = "preferred_contact_method")
    public String getPreferredContactMethod() {
        return preferredContactMethod;
    }
    public void setPreferredContactMethod(String preferredContactMethod) {
        this.preferredContactMethod = preferredContactMethod;
    }

    @Basic
    @Column(name = "marital_status")
    public String getMaritalStatus() {
        return maritalStatus;
    }
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Basic
    @Column(name = "spouse_name")
    public String getSpouseName() {
        return spouseName;
    }
    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    @Basic
    @Column(name = "gender")
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "language")
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

    @Basic
    @Column(name = "ethnicity")
    public String getEthnicity() {
        return ethnicity;
    }
    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    @Basic
    @Column(name = "race")
    public String getRace() {
        return race;
    }
    public void setRace(String race) {
        this.race = race;
    }

    @Basic
    @Column(name = "employer_name")
    public String getEmployerName() {
        return employerName;
    }
    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    @Basic
    @Column(name = "emergency_contact_first_name")
    public String getEmergencyContactFirstName() {
        return emergencyContactFirstName;
    }
    public void setEmergencyContactFirstName(String emergencyContactFirstName) {
        this.emergencyContactFirstName = emergencyContactFirstName;
    }

    @Basic
    @Column(name = "emergency_contact_phone")
    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }
    public void setEmergencyContactPhone(String emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone;
    }

    @Basic
    @Column(name = "emergency_contact_relationship")
    public String getEmergencyContactRelationship() {
        return emergencyContactRelationship;
    }
    public void setEmergencyContactRelationship(String emergencyContactRelationship) {
        this.emergencyContactRelationship = emergencyContactRelationship;
    }

    @Basic
    @Column(name = "emergency_contact_last_name")
    public String getEmergencyContactLastName() {
        return emergencyContactLastName;
    }
    public void setEmergencyContactLastName(String emergencyContactLastName) {
        this.emergencyContactLastName = emergencyContactLastName;
    }

    @Basic
    @Column(name = "created_at")
    public Timestamp getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at")
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @OneToMany(mappedBy = "patientByPatientId")
    public Collection<AllergyEntity> getAllergiesById() {
        return allergiesById;
    }
    public void setAllergiesById(Collection<AllergyEntity> allergiesById) {
        this.allergiesById = allergiesById;
    }

    @OneToMany(mappedBy = "patientByPatientId")
    public Collection<AppointmentEntity> getAppointmentsById() {
        return appointmentsById;
    }
    public void setAppointmentsById(Collection<AppointmentEntity> appointmentsById) {
        this.appointmentsById = appointmentsById;
    }

    @OneToMany(mappedBy = "patientByPatientId")
    public Collection<EncounterEntity> getEncountersById() {
        return encountersById;
    }
    public void setEncountersById(Collection<EncounterEntity> encountersById) {
        this.encountersById = encountersById;
    }

    @OneToMany(mappedBy = "patientByPatientId")
    public Collection<LabResultEntity> getLabResultsById() {
        return labResultsById;
    }
    public void setLabResultsById(Collection<LabResultEntity> labResultsById) {
        this.labResultsById = labResultsById;
    }

    @OneToMany(mappedBy = "patientByPatientId")
    public Collection<MedicationEntity> getMedicationsById() {
        return medicationsById;
    }
    public void setMedicationsById(Collection<MedicationEntity> medicationsById) {
        this.medicationsById = medicationsById;
    }

    @ManyToOne
    @JoinColumn(name = "home_address_id", referencedColumnName = "id")
    public AddressEntity getAddressByHomeAddressId() {
        return addressByHomeAddressId;
    }
    public void setAddressByHomeAddressId(AddressEntity addressByHomeAddressId) {
        this.addressByHomeAddressId = addressByHomeAddressId;
    }

    @ManyToOne
    @JoinColumn(name = "employer_address_id", referencedColumnName = "id")
    public AddressEntity getAddressByEmployerAddressId() {
        return addressByEmployerAddressId;
    }
    public void setAddressByEmployerAddressId(AddressEntity addressByEmployerAddressId) {
        this.addressByEmployerAddressId = addressByEmployerAddressId;
    }

    @ManyToOne
    @JoinColumn(name = "organization_id", referencedColumnName = "id", nullable = false)
    public OrganizationEntity getOrganizationByOrganizationId() {
        return organizationByOrganizationId;
    }
    public void setOrganizationByOrganizationId(OrganizationEntity organizationByOrganizationId) {
        this.organizationByOrganizationId = organizationByOrganizationId;
    }

    @ManyToOne
    @JoinColumn(name = "group_id", referencedColumnName = "id")
    public GroupEntity getGroupByGroupId() {
        return groupByGroupId;
    }
    public void setGroupByGroupId(GroupEntity groupByGroupId) {
        this.groupByGroupId = groupByGroupId;
    }

    @ManyToOne
    @JoinColumn(name = "provider_id", referencedColumnName = "id")
    public ProviderEntity getProviderByProviderId() {
        return providerByProviderId;
    }
    public void setProviderByProviderId(ProviderEntity providerByProviderId) {
        this.providerByProviderId = providerByProviderId;
    }

}
