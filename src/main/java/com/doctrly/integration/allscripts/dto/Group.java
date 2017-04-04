package com.doctrly.integration.allscripts.dto;

import lombok.Data;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;


//@Data
public class Group {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTaxId() {
        return taxId;
    }

    public void setTaxId(Integer taxId) {
        this.taxId = taxId;
    }

    public BigInteger getAddressId() {
        return addressId;
    }

    public void setAddressId(BigInteger addressId) {
        this.addressId = addressId;
    }

    public Integer getNpi() {
        return npi;
    }

    public void setNpi(Integer npi) {
        this.npi = npi;
    }

    public String getClia() {
        return clia;
    }

    public void setClia(String clia) {
        this.clia = clia;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
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

    public Address getAddressByAddressId() {
        return addressByAddressId;
    }

    public void setAddressByAddressId(Address addressByAddressId) {
        this.addressByAddressId = addressByAddressId;
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

    public Collection<Location> getLocationsById() {
        return locationsById;
    }

    public void setLocationsById(Collection<Location> locationsById) {
        this.locationsById = locationsById;
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

    public Collection<Provider> getProvidersById() {
        return providersById;
    }

    public void setProvidersById(Collection<Provider> providersById) {
        this.providersById = providersById;
    }

    private BigInteger id;
    private String sourceId;
    private BigInteger organizationId;

    private String name;
    private Integer taxId;
    private BigInteger addressId;
    private Integer npi;
    private String clia;
    private Integer pos;
    private String phone;
    private String fax;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    private Organization organizationByOrganizationId;
    private Address addressByAddressId;

    private Collection<Encounter> encountersById;
    private Collection<GroupProvider> groupProvidersById;
    private Collection<Location> locationsById;
    private Collection<Patient> patientsById;
    private Collection<PatientDocument> patientDocumentsById;
    private Collection<Provider> providersById;

}
