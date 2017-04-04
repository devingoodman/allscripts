package com.doctrly.integration.allscripts.entity;


import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;


@Entity
@Table(name = "patient_source_system", catalog = "")
@IdClass(PatientSourceSystemEntityPK.class)
public class PatientSourceSystemEntity {

    private BigInteger patientId;
    private BigInteger sourceSystemId;
    private String mrn;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    private PatientEntity       patientByPatientEntityId;
    private SourceSystemEntity  sourceSystemBySourceSystemId;


    @Id
    @Column(name = "patient_id")
    public BigInteger getPatientId() {
        return patientId;
    }
    public void setPatientId(BigInteger patientId) {
        this.patientId = patientId;
    }

    @Id
    @Column(name = "source_system_id")
    public BigInteger getSourceSystemId() {
        return sourceSystemId;
    }
    public void setSourceSystemId(BigInteger sourceSystemId) {
        this.sourceSystemId = sourceSystemId;
    }

    @Basic
    @Column(name = "mrn")
    public String getMrn() {
        return mrn;
    }
    public void setMrn(String mrn) {
        this.mrn = mrn;
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
    @JoinColumn(name = "patient_id", referencedColumnName = "id", insertable = false, updatable = false)
    public PatientEntity getPatientByPatientEntityId() {
        return patientByPatientEntityId;
    }
    public void setPatientByPatientEntityId(PatientEntity patientByPatientEntityId) {
        this.patientByPatientEntityId = patientByPatientEntityId;
    }

    @ManyToOne
    @JoinColumn(name = "source_system_id", referencedColumnName = "id", insertable = false, updatable = false)
    public SourceSystemEntity getSourceSystemBySourceSystemId() {
        return sourceSystemBySourceSystemId;
    }
    public void setSourceSystemBySourceSystemId(SourceSystemEntity sourceSystemBySourceSystemId) {
        this.sourceSystemBySourceSystemId = sourceSystemBySourceSystemId;
    }

}
