package com.doctrly.integration.allscripts.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;


@Entity
@Table(name = "diagnosis", catalog = "")
public class DiagnosisEntity {
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

    private String notes;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    private Collection<DiagnosisItemEntity> diagnosisItemsById;

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


    @Id
    @Column(name = "id")
    public BigInteger getId() {
        return id;
    }
    public void setId(BigInteger id) {
        this.id = id;
    }

    @Basic
    @Column(name = "notes")
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
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

    @OneToMany(mappedBy = "diagnosisByDiagnosisId")
    public Collection<DiagnosisItemEntity> getDiagnosisItemsById() {
        return diagnosisItemsById;
    }
    public void setDiagnosisItemsById(Collection<DiagnosisItemEntity> diagnosisItemsById) {
        this.diagnosisItemsById = diagnosisItemsById;
    }

}
