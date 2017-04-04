package com.doctrly.integration.allscripts.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "allergy", catalog = "")
public class AllergyEntity {
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
    private Timestamp onsetDatetime;
    private String severity;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Collection<AllergyReactionEntity> allergyReactionsById;


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
    @Column(name = "onset_datetime")
    public Timestamp getOnsetDatetime() {
        return onsetDatetime;
    }
    public void setOnsetDatetime(Timestamp onsetDatetime) {
        this.onsetDatetime = onsetDatetime;
    }

    @Basic
    @Column(name = "severity")
    public String getSeverity() {
        return severity;
    }
    public void setSeverity(String severity) {
        this.severity = severity;
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


    @OneToMany(mappedBy = "allergyByAllergyId")
    public Collection<AllergyReactionEntity> getAllergyReactionsById() {
        return allergyReactionsById;
    }
    public void setAllergyReactionsById(Collection<AllergyReactionEntity> allergyReactionsById) {
        this.allergyReactionsById = allergyReactionsById;
    }

}
