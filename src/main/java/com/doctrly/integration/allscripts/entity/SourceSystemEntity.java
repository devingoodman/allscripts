package com.doctrly.integration.allscripts.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;


@Entity
@Table(name = "source_system", catalog = "")
public class SourceSystemEntity {

    private BigInteger id;

    private String systemType;
    private String vendorName;

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


    @Basic
    @Column(name = "system_type")
    public String getSystemType() {
        return systemType;
    }
    public void setSystemType(String system_type) {
        this.systemType = system_type;
    }

    @Basic
    @Column(name = "vendor_name")
    public String getVendorName() {
        return vendorName;
    }
    public void setVendorName(String vendor_name) {
        this.vendorName = vendor_name;
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


}
