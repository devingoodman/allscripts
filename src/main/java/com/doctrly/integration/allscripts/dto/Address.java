package com.doctrly.integration.allscripts.dto;

import lombok.Data;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;


//@Data
public class Address {
    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public Collection<Group> getGroupssById() {
        return groupssById;
    }

    public void setGroupssById(Collection<Group> groupssById) {
        this.groupssById = groupssById;
    }

    public Collection<LabResult> getLabResultsById() {
        return labResultsById;
    }

    public void setLabResultsById(Collection<LabResult> labResultsById) {
        this.labResultsById = labResultsById;
    }

    public Collection<Organization> getOrganizationsById() {
        return organizationsById;
    }

    public void setOrganizationsById(Collection<Organization> organizationsById) {
        this.organizationsById = organizationsById;
    }

    public Collection<Patient> getPatientsById() {
        return patientsById;
    }

    public void setPatientsById(Collection<Patient> patientsById) {
        this.patientsById = patientsById;
    }

    private BigInteger id;

    private String line1;
    private String line2;
    private String city;
    private String state;
    private String zip;
    private String country;
    
    private Timestamp createdAt;
    private Timestamp updatedAt;

    private Collection<Group> groupssById;
    private Collection<LabResult> labResultsById;
    private Collection<Organization> organizationsById;
    private Collection<Patient> patientsById;

}
