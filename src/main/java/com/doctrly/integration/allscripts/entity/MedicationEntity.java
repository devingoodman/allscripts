package com.doctrly.integration.allscripts.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "medication", catalog = "")
public class MedicationEntity {
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
    private String dosageQuantity;
    private String dosageUnits;
    private String dosageRoute;
    private String directions;
    private String comments;
    private Timestamp startDatetime;
    private Timestamp endDatetime;
    private Timestamp createdAt;
    private Timestamp updatedAt;


    private PatientEntity patientByPatientId;
    private BigInteger patientId;

    @ManyToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "id", nullable = false)
    public PatientEntity getPatientByPatientId() {
        return patientByPatientId;
    }
    public void setPatientByPatientId(PatientEntity patientByPatientId) {
        this.patientByPatientId = patientByPatientId;
    }

    @Basic
    @Column(name = "patient_id", insertable=false, updatable = false)
    public BigInteger getPatientId() {
        return patientId;
    }
    public void setPatientId(BigInteger patientId) {
        this.patientId = patientId;
    }


    private EncounterEntity encounterByEncounterId;
    private BigInteger encounterId;

    @ManyToOne
    @JoinColumn(name = "encounter_id", referencedColumnName = "id", nullable = false)
    public EncounterEntity getEncounterByEncounterId() {
        return encounterByEncounterId;
    }
    public void setEncounterByEncounterId(EncounterEntity encounterByEncounterId) {
        this.encounterByEncounterId = encounterByEncounterId;
    }

    @Basic
    @Column(name = "encounter_id", insertable=false, updatable = false)
    public BigInteger getEncounterId() {
        return encounterId;
    }
    public void setEncounterId(BigInteger encounterId) {
        this.encounterId = encounterId;
    }


    private Collection<EntityCodesEntity> codes;

    @Transient
    public Collection<EntityCodesEntity> getCodes() {
        return codes;
    }
    @Transient
    public void setCodes(Collection<EntityCodesEntity> codes) {
        this.codes = codes;
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
    @Column(name = "dosage_quantity")
    public String getDosageQuantity() {
        return dosageQuantity;
    }
    public void setDosageQuantity(String dosageQuantity) {
        this.dosageQuantity = dosageQuantity;
    }

    @Basic
    @Column(name = "dosage_units")
    public String getDosageUnits() {
        return dosageUnits;
    }
    public void setDosageUnits(String dosageUnits) {
        this.dosageUnits = dosageUnits;
    }

    @Basic
    @Column(name = "dosage_route")
    public String getDosageRoute() {
        return dosageRoute;
    }
    public void setDosageRoute(String dosageRoute) {
        this.dosageRoute = dosageRoute;
    }

    @Basic
    @Column(name = "directions")
    public String getDirections() {
        return directions;
    }
    public void setDirections(String directions) {
        this.directions = directions;
    }

    @Basic
    @Column(name = "comments")
    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }

    @Basic
    @Column(name = "start_datetime")
    public Timestamp getStartDatetime() {
        return startDatetime;
    }
    public void setStartDatetime(Timestamp startDatetime) {
        this.startDatetime = startDatetime;
    }

    @Basic
    @Column(name = "end_datetime")
    public Timestamp getEndDatetime() {
        return endDatetime;
    }
    public void setEndDatetime(Timestamp endDatetime) {
        this.endDatetime = endDatetime;
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
