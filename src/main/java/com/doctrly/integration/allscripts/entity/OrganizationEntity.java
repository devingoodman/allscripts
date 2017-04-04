package com.doctrly.integration.allscripts.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "organization", catalog = "")
public class OrganizationEntity {
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

    private String name;
    private String phone;
    private String website;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Collection<GroupEntity> groupsById;
    private AddressEntity addressByAddressId;
    private Collection<PatientEntity> patientsById;
    private Collection<ProviderEntity> providersById;

    @Id
    @Column(name = "id")
    public BigInteger getId() {
        return id;
    }
    public void setId(BigInteger id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "website")
    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
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

    @OneToMany(mappedBy = "organizationByOrganizationId")
    public Collection<GroupEntity> getGroupsById() {
        return groupsById;
    }
    public void setGroupsById(Collection<GroupEntity> groupsById) {
        this.groupsById = groupsById;
    }

    @ManyToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    public AddressEntity getAddressByAddressId() {
        return addressByAddressId;
    }
    public void setAddressByAddressId(AddressEntity addressByAddressId) {
        this.addressByAddressId = addressByAddressId;
    }

    @OneToMany(mappedBy = "organizationByOrganizationId")
    public Collection<PatientEntity> getPatientsById() {
        return patientsById;
    }
    public void setPatientsById(Collection<PatientEntity> patientsById) {
        this.patientsById = patientsById;
    }

    @OneToMany(mappedBy = "organizationByOrganizationId")
    public Collection<ProviderEntity> getProvidersById() {
        return providersById;
    }
    public void setProvidersById(Collection<ProviderEntity> providersById) {
        this.providersById = providersById;
    }
}
