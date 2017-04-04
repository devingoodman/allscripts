package com.doctrly.integration.allscripts.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "encounter", catalog = "")
public class EncounterEntity {
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

    private Timestamp serviceDate;
    private String encounterType;
    private String generalNote;
    private String subjective;


    private String objective;
    private String assessment;
    private String plan;
    private String carbonCopy;
    private Byte digitalSignature;
    private String chiefComplaint;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    private PatientEntity patientByPatientId;
    private ProviderEntity providerByProviderId;
    private GroupEntity groupByGroupId;

    private Collection<DiagnosisEntity> diagnosesById;
    private Collection<LabResultEntity> labResultsById;
    private Collection<VitalEntity> vitalsById;

    private Collection<AppointmentEncounterEntity> appointmentEncountersById;

    private BigInteger patientId;
    private BigInteger providerId;
    private BigInteger groupId;

    @Basic
    @Column(name = "patient_id", insertable=false, updatable = false)
    public BigInteger getPatientId() {
        return patientId;
    }
    public void setPatientId(BigInteger patientId) {
        this.patientId = patientId;
    }

    @Basic
    @Column(name = "provider_id", insertable=false, updatable = false)
    public BigInteger getProviderId() {
        return providerId;
    }
    public void setProviderId(BigInteger providerId) {
        this.providerId = providerId;
    }

    @Basic
    @Column(name = "group_id", insertable=false, updatable = false)
    public BigInteger getGroupId() {
        return groupId;
    }
    public void setGroupId(BigInteger groupId) {
        this.groupId = groupId;
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
    @Column(name = "service_date")
    public Timestamp getServiceDate() {
        return serviceDate;
    }
    public void setServiceDate(Timestamp serviceDate) {
        this.serviceDate = serviceDate;
    }

    @Basic
    @Column(name = "encounter_type")
    public String getEncounterType() {
        return encounterType;
    }
    public void setEncounterType(String encounterType) {
        this.encounterType = encounterType;
    }

    @Basic
    @Column(name = "general_note")
    public String getGeneralNote() {
        return generalNote;
    }
    public void setGeneralNote(String generalNote) {
        this.generalNote = generalNote;
    }

    @Basic
    @Column(name = "subjective")
    public String getSubjective() {
        return subjective;
    }
    public void setSubjective(String subjective) {
        this.subjective = subjective;
    }

    @Basic
    @Column(name = "objective")
    public String getObjective() {
        return objective;
    }
    public void setObjective(String objective) {
        this.objective = objective;
    }

    @Basic
    @Column(name = "assessment")
    public String getAssessment() {
        return assessment;
    }
    public void setAssessment(String assessment) {
        this.assessment = assessment;
    }

    @Basic
    @Column(name = "plan")
    public String getPlan() {
        return plan;
    }
    public void setPlan(String plan) {
        this.plan = plan;
    }

    @Basic
    @Column(name = "carbon_copy")
    public String getCarbonCopy() {
        return carbonCopy;
    }
    public void setCarbonCopy(String carbonCopy) {
        this.carbonCopy = carbonCopy;
    }

    @Basic
    @Column(name = "digital_signature")
    public Byte getDigitalSignature() {
        return digitalSignature;
    }
    public void setDigitalSignature(Byte digitalSignature) {
        this.digitalSignature = digitalSignature;
    }

    @Basic
    @Column(name = "chief_complaint")
    public String getChiefComplaint() {
        return chiefComplaint;
    }
    public void setChiefComplaint(String chiefComplaint) {
        this.chiefComplaint = chiefComplaint;
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

    @OneToMany(mappedBy = "encounterByEncounterId")
    public Collection<DiagnosisEntity> getDiagnosesById() {
        return diagnosesById;
    }
    public void setDiagnosesById(Collection<DiagnosisEntity> diagnosesById) {
        this.diagnosesById = diagnosesById;
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
    @JoinColumn(name = "provider_id", referencedColumnName = "id", nullable = false)
    public ProviderEntity getProviderByProviderId() {
        return providerByProviderId;
    }
    public void setProviderByProviderId(ProviderEntity providerByProviderId) {
        this.providerByProviderId = providerByProviderId;
    }

    @ManyToOne
    @JoinColumn(name = "group_id", referencedColumnName = "id", nullable = false)
    public GroupEntity getGroupByGroupId() {
        return groupByGroupId;
    }
    public void setGroupByGroupId(GroupEntity groupByGroupId) {
        this.groupByGroupId = groupByGroupId;
    }

    @OneToMany(mappedBy = "encounterByEncounterId")
    public Collection<LabResultEntity> getLabResultsById() {
        return labResultsById;
    }
    public void setLabResultsById(Collection<LabResultEntity> labResultsById) {
        this.labResultsById = labResultsById;
    }

    @OneToMany(mappedBy = "encounterByEncounterId")
    public Collection<VitalEntity> getVitalsById() {
        return vitalsById;
    }
    public void setVitalsById(Collection<VitalEntity> vitalsById) {
        this.vitalsById = vitalsById;
    }


    @OneToMany(mappedBy = "encounterByEncounterId")
    public Collection<AppointmentEncounterEntity> getAppointmentEncountersById() {
        return appointmentEncountersById;
    }

    public void setAppointmentEncountersById(Collection<AppointmentEncounterEntity> appointmentEncountersById) {
        this.appointmentEncountersById = appointmentEncountersById;
    }

}
