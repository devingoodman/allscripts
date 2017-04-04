package com.doctrly.integration.allscripts.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "provider", catalog = "")
public class ProviderEntity {
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

    private Collection<AppointmentEntity> appointmentsById;
    private Collection<EncounterEntity> encountersById;
    private Collection<GroupProviderEntity> groupProvidersById;

    private OrganizationEntity  organizationByOrganizationId;
    private GroupEntity         groupByGroupId;


    @Id
    @Column(name = "id")
    public BigInteger getId() {
        return id;
    }
    public void setId(BigInteger id) {
        this.id = id;
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
    @Column(name = "degree")
    public String getDegree() {
        return degree;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Basic
    @Column(name = "ansispecialtycode")
    public String getAnsispecialtycode() {
        return ansispecialtycode;
    }
    public void setAnsispecialtycode(String ansispecialtycode) {
        this.ansispecialtycode = ansispecialtycode;
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
    @Column(name = "phone_pager")
    public String getPhonePager() {
        return phonePager;
    }
    public void setPhonePager(String phonePager) {
        this.phonePager = phonePager;
    }

    @Basic
    @Column(name = "phone_fax")
    public String getPhoneFax() {
        return phoneFax;
    }
    public void setPhoneFax(String phoneFax) {
        this.phoneFax = phoneFax;
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
    @Column(name = "licensure_state")
    public String getLicensureState() {
        return licensureState;
    }
    public void setLicensureState(String licensureState) {
        this.licensureState = licensureState;
    }

    @Basic
    @Column(name = "licensure_npi")
    public String getLicensureNpi() {
        return licensureNpi;
    }
    public void setLicensureNpi(String licensureNpi) {
        this.licensureNpi = licensureNpi;
    }

    @Basic
    @Column(name = "licensure_dea")
    public String getLicensureDea() {
        return licensureDea;
    }
    public void setLicensureDea(String licensureDea) {
        this.licensureDea = licensureDea;
    }

    @Basic
    @Column(name = "licensure_gmc")
    public String getLicensureGmc() {
        return licensureGmc;
    }
    public void setLicensureGmc(String licensureGmc) {
        this.licensureGmc = licensureGmc;
    }

    @Basic
    @Column(name = "licensure_nhs")
    public String getLicensureNhs() {
        return licensureNhs;
    }
    public void setLicensureNhs(String licensureNhs) {
        this.licensureNhs = licensureNhs;
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



    @OneToMany(mappedBy = "providerByProviderId")
    public Collection<AppointmentEntity> getAppointmentsById() {
        return appointmentsById;
    }
    public void setAppointmentsById(Collection<AppointmentEntity> appointmentsById) {
        this.appointmentsById = appointmentsById;
    }

    @OneToMany(mappedBy = "providerByProviderId")
    public Collection<EncounterEntity> getEncountersById() {
        return encountersById;
    }
    public void setEncountersById(Collection<EncounterEntity> encountersById) {
        this.encountersById = encountersById;
    }

    @OneToMany(mappedBy = "providerByProviderId")
    public Collection<GroupProviderEntity> getGroupProvidersById() {
        return groupProvidersById;
    }
    public void setGroupProvidersById(Collection<GroupProviderEntity> groupProvidersById) {
        this.groupProvidersById = groupProvidersById;
    }



    @ManyToOne
    @JoinColumn(name = "organization_id", referencedColumnName = "id")
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

}
