package com.doctrly.integration.allscripts.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;


@Entity
@Table(name = "chief_complaint", catalog = "")
public class ChiefComplaintEntity {
    private BigInteger id;
    private String name;
    private String icd;
    private String snomed;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    private AppointmentEntity appointmentByAppointmentId;


    private BigInteger appointmentId;

    @Basic
    @Column(name = "appointment_id", insertable=false, updatable = false)
    public BigInteger getAppointmentId() {
        return appointmentId;
    }
    public void setAppointmentId(BigInteger appointmentId) {
        this.appointmentId = appointmentId;
    }


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
    @Column(name = "icd")
    public String getIcd() {
        return icd;
    }
    public void setIcd(String icd) {
        this.icd = icd;
    }

    @Basic
    @Column(name = "snomed")
    public String getSnomed() {
        return snomed;
    }
    public void setSnomed(String snomed) {
        this.snomed = snomed;
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

    @ManyToOne
    @JoinColumn(name = "appointment_id", referencedColumnName = "id", nullable = false)
    public AppointmentEntity getAppointmentByAppointmentId() {
        return appointmentByAppointmentId;
    }
    public void setAppointmentByAppointmentId(AppointmentEntity appointmentByAppointmentId) {
        this.appointmentByAppointmentId = appointmentByAppointmentId;
    }

}
