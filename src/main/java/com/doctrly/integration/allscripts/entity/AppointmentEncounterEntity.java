package com.doctrly.integration.allscripts.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;


@Entity
@Table(name = "appointment_encounter", catalog = "")
@IdClass(AppointmentEncounterEntityPK.class)
public class AppointmentEncounterEntity {

    private BigInteger appointmentId;
    private BigInteger encounterId;
    private Byte code;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private AppointmentEntity appointmentByAppointmentId;
    private EncounterEntity encounterByEncounterId;


    @Id
    @Column(name = "appointment_id", insertable=false, updatable = false)
    public BigInteger getAppointmentId() {
        return appointmentId;
    }
    public void setAppointmentId(BigInteger appointmentId) {
        this.appointmentId = appointmentId;
    }


    @Id
    @Column(name = "encounter_id", insertable=false, updatable = false)
    public BigInteger getEncounterId() {
        return encounterId;
    }
    public void setEncounterId(BigInteger encounterId) {
        this.encounterId = encounterId;
    }


    @Basic
    @Column(name = "code")
    public Byte getCode() {
        return code;
    }
    public void setCode(Byte code) {
        this.code = code;
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


    @ManyToOne
    @JoinColumn(name = "encounter_id", referencedColumnName = "id", nullable = false)
    public EncounterEntity getEncounterByEncounterId() {
        return encounterByEncounterId;
    }
    public void setEncounterByEncounterId(EncounterEntity encounterByEncounterId) {
        this.encounterByEncounterId = encounterByEncounterId;
    }

}
