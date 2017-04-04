package com.doctrly.integration.allscripts.entity;

import lombok.ToString;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

@ToString
@Entity
@Table(name = "location", catalog = "")
public class LocationEntity {

    private BigInteger id;

    private String friendlyName;
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String phone;
    private String fax;
    private String email;

    private Timestamp createdAt;
    private Timestamp updatedAt;



    @Id
    @Column(name = "id")
    public BigInteger getId() {
        return id;
    }
    public void setId(BigInteger id) {
        this.id = id;
    }

    private String sourceId;

    @Basic
    @Column(name = "source_id")
    public String getSourceId() {
        return sourceId;
    }
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    @Basic
    @Column(name = "friendly_name")
    public String getFriendlyName() {
        return friendlyName;
    }
    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
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
    @Column(name = "email")
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
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


    private BigInteger groupId;

    @Basic
    @Column(name = "group_id", insertable=false, updatable = false)
    public BigInteger getGroupId() {
        return groupId;
    }
    public void setGroupId(BigInteger groupId) {
        this.groupId = groupId;
    }


    private GroupEntity     groupByGroupId;

    @ManyToOne
    @JoinColumn(name = "group_id", referencedColumnName = "id")
    public GroupEntity getGroupByGroupId() {
        return groupByGroupId;
    }
    public void setGroupByGroupId(GroupEntity groupByGroupId) {
        this.groupByGroupId = groupByGroupId;
    }


    /*
    private Collection<GroupEntity> groupsById;

    @OneToMany(mappedBy = "addressByAddressId")
    public Collection<GroupEntity> getGroupsById() {
        return groupsById;
    }
    public void setGroupsById(Collection<GroupEntity> groupsById) {
        this.groupsById = groupsById;
    }
    */


}
