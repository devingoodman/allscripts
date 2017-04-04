package com.doctrly.integration.allscripts.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "groups", catalog = "")
public class GroupEntity {
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
    private String name;
    private Integer taxId;
    private Integer npi;
    private String clia;
    private Integer pos;
    private String phone;
    private String fax;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    private OrganizationEntity organizationByOrganizationId;
    private AddressEntity addressByAddressId;

    private Collection<EncounterEntity> encountersById;
    private Collection<GroupProviderEntity> groupProvidersById;

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
    @Column(name = "name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "tax_id")
    public Integer getTaxId() {
        return taxId;
    }
    public void setTaxId(Integer taxId) {
        this.taxId = taxId;
    }

    @Basic
    @Column(name = "npi")
    public Integer getNpi() {
        return npi;
    }
    public void setNpi(Integer npi) {
        this.npi = npi;
    }

    @Basic
    @Column(name = "clia")
    public String getClia() {
        return clia;
    }
    public void setClia(String clia) {
        this.clia = clia;
    }

    @Basic
    @Column(name = "pos")
    public Integer getPos() {
        return pos;
    }
    public void setPos(Integer pos) {
        this.pos = pos;
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
    @Column(name = "fax")
    public String getFax() {
        return fax;
    }
    public void setFax(String fax) {
        this.fax = fax;
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

    @OneToMany(mappedBy = "groupByGroupId")
    public Collection<EncounterEntity> getEncountersById() {
        return encountersById;
    }
    public void setEncountersById(Collection<EncounterEntity> encountersById) {
        this.encountersById = encountersById;
    }

    @ManyToOne
    @JoinColumn(name = "organization_id", referencedColumnName = "id", nullable = false)
    public OrganizationEntity getOrganizationByOrganizationId() {
        return organizationByOrganizationId;
    }
    public void setOrganizationByOrganizationId(OrganizationEntity organizationByOrganizationId) {
        this.organizationByOrganizationId = organizationByOrganizationId;
    }

   // (cascade=CascadeType.PERSIST)
    @ManyToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    public AddressEntity getAddressByAddressId() {
        return addressByAddressId;
    }
    public void setAddressByAddressId(AddressEntity addressByAddressId) {
        this.addressByAddressId = addressByAddressId;
    }

    @OneToMany(mappedBy = "groupByGroupId")
    public Collection<GroupProviderEntity> getGroupProvidersById() {
        return groupProvidersById;
    }
    public void setGroupProvidersById(Collection<GroupProviderEntity> groupProvidersById) {
        this.groupProvidersById = groupProvidersById;
    }

}
