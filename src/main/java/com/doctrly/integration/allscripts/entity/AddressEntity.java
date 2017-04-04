package com.doctrly.integration.allscripts.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "address", catalog = "")
public class AddressEntity {
    private BigInteger id;
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String zip;
    private String country;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Collection<GroupEntity> groupsById;
    private Collection<LabResultEntity> labResultsById;
    private Collection<OrganizationEntity> organizationsById;
    private Collection<PatientEntity> patientsById;
    private Collection<PatientEntity> patientsById_0;


    @Id
    @Column(name = "id")
    public BigInteger getId() {
        return id;
    }
    public void setId(BigInteger id) {
        this.id = id;
    }

    @Basic
    @Column(name = "line_1")
    public String getLine1() {
        return line1;
    }
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    @Basic
    @Column(name = "line_2")
    public String getLine2() {
        return line2;
    }
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "state")
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "zip")
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }

    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
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


    @OneToMany(mappedBy = "addressByAddressId")
    public Collection<GroupEntity> getGroupsById() {
        return groupsById;
    }
    public void setGroupsById(Collection<GroupEntity> groupsById) {
        this.groupsById = groupsById;
    }

    @OneToMany(mappedBy = "addressByLabAddressId")
    public Collection<LabResultEntity> getLabResultsById() {
        return labResultsById;
    }
    public void setLabResultsById(Collection<LabResultEntity> labResultsById) {
        this.labResultsById = labResultsById;
    }

    @OneToMany(mappedBy = "addressByAddressId")
    public Collection<OrganizationEntity> getOrganizationsById() {
        return organizationsById;
    }
    public void setOrganizationsById(Collection<OrganizationEntity> organizationsById) {
        this.organizationsById = organizationsById;
    }

    @OneToMany(mappedBy = "addressByHomeAddressId")
    public Collection<PatientEntity> getPatientsById() {
        return patientsById;
    }
    public void setPatientsById(Collection<PatientEntity> patientsById) {
        this.patientsById = patientsById;
    }

    @OneToMany(mappedBy = "addressByEmployerAddressId")
    public Collection<PatientEntity> getPatientsById_0() {
        return patientsById_0;
    }
    public void setPatientsById_0(Collection<PatientEntity> patientsById_0) {
        this.patientsById_0 = patientsById_0;
    }

}
