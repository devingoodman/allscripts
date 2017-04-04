package com.doctrly.integration.allscripts.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "lab_result", catalog = "")
public class LabResultEntity {
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

    private Timestamp recordedDatetime;
    private Timestamp completedDatetime;
    private Byte fasting;
    private String comments;
    private String labName;
    private String labOrderNumber;
    private String labProviderName;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private PatientEntity patientByPatientId;
    private EncounterEntity encounterByEncounterId;
    private AddressEntity addressByLabAddressId;
    private Collection<LabResultPanelEntity> labResultPanelsById;


    private PatientEntity patientId;
    private EncounterEntity encounterId;

    /*
    @Basic
    @Column(name = "patient_id", insertable=false, updatable = false)
    public PatientEntity getPatientId() {
        return patientId;
    }
    public void setPatientId(PatientEntity patientId) {
        this.patientId = patientId;
    }

    @Basic
    @Column(name = "encounter_id", insertable=false, updatable = false)
    public EncounterEntity getEncounterId() {
        return encounterId;
    }
    public void setEncounterId(EncounterEntity encounterId) {
        this.encounterId = encounterId;
    }
    */


    @Id
    @Column(name = "id")
    public BigInteger getId() {
        return id;
    }
    public void setId(BigInteger id) {
        this.id = id;
    }

    @Basic
    @Column(name = "recorded_datetime")
    public Timestamp getRecordedDatetime() {
        return recordedDatetime;
    }
    public void setRecordedDatetime(Timestamp recordedDatetime) {
        this.recordedDatetime = recordedDatetime;
    }

    @Basic
    @Column(name = "completed_datetime")
    public Timestamp getCompletedDatetime() {
        return completedDatetime;
    }
    public void setCompletedDatetime(Timestamp completedDatetime) {
        this.completedDatetime = completedDatetime;
    }

    @Basic
    @Column(name = "fasting")
    public Byte getFasting() {
        return fasting;
    }
    public void setFasting(Byte fasting) {
        this.fasting = fasting;
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
    @Column(name = "lab_name")
    public String getLabName() {
        return labName;
    }
    public void setLabName(String labName) {
        this.labName = labName;
    }

    @Basic
    @Column(name = "lab_order_number")
    public String getLabOrderNumber() {
        return labOrderNumber;
    }
    public void setLabOrderNumber(String labOrderNumber) {
        this.labOrderNumber = labOrderNumber;
    }

    @Basic
    @Column(name = "lab_provider_name")
    public String getLabProviderName() {
        return labProviderName;
    }
    public void setLabProviderName(String labProviderName) {
        this.labProviderName = labProviderName;
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
    @JoinColumn(name = "patient_id", referencedColumnName = "id", nullable = false)
    public PatientEntity getPatientByPatientId() {
        return patientByPatientId;
    }
    public void setPatientByPatientId(PatientEntity patientByPatientId) {
        this.patientByPatientId = patientByPatientId;
    }

    @ManyToOne
    @JoinColumn(name = "encounter_id", referencedColumnName = "id")
    public EncounterEntity getEncounterByEncounterId() {
        return encounterByEncounterId;
    }
    public void setEncounterByEncounterId(EncounterEntity encounterByEncounterId) {
        this.encounterByEncounterId = encounterByEncounterId;
    }

    @ManyToOne
    @JoinColumn(name = "lab_address_id", referencedColumnName = "id")
    public AddressEntity getAddressByLabAddressId() {
        return addressByLabAddressId;
    }
    public void setAddressByLabAddressId(AddressEntity addressByLabAddressId) {
        this.addressByLabAddressId = addressByLabAddressId;
    }

    @OneToMany(mappedBy = "labResultByLabResultId")
    public Collection<LabResultPanelEntity> getLabResultPanelsById() {
        return labResultPanelsById;
    }
    public void setLabResultPanelsById(Collection<LabResultPanelEntity> labResultPanelsById) {
        this.labResultPanelsById = labResultPanelsById;
    }
}
