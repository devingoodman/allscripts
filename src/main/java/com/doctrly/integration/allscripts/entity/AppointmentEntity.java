package com.doctrly.integration.allscripts.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;


@Entity
@Table(name = "appointment", catalog = "")
public class AppointmentEntity {
    private BigInteger id;
    private String sourceId;
    private String location;
    private String appointmentType;
    private String duration;
    private Timestamp appointmentDatetime;
    private Byte block;
    private String blockReason;
    private String notes;

    private String NType;
    private String NDestination;
    private Timestamp NDatetimeSent;
    private String NMessage;
    private Byte NPatientConfirmed;
    //private String document_id;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Timestamp deletedAt;


    private PatientEntity patientByPatientId;
    private ProviderEntity providerByProviderId;
    private LocationEntity locationByLocationId;

    private BigInteger patientId;
    private BigInteger providerId;
    private BigInteger locationId;

    private Collection<AppointmentEncounterEntity> appointmentEncountersById;
    private Collection<ChiefComplaintEntity> chiefComplaintsById;


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
    @Column(name = "location_id", insertable=false, updatable = false)
    public BigInteger getLocationId() {
        return locationId;
    }
    public void setLocationId(BigInteger locationId) {
        this.locationId = locationId;
    }


    private Collection<ChiefComplaintEntity> chiefComplaints;
    @Transient
    public Collection<ChiefComplaintEntity> getChiefComplaints() {
        return chiefComplaints;
    }
    @Transient
    public void setChiefComplaints(Collection<ChiefComplaintEntity> chiefComplaints) {
        this.chiefComplaints = chiefComplaints;
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
    @Column(name = "source_id")
    public String getSourceId() {
        return sourceId;
    }
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    @Basic
    @Column(name = "location")
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "appointment_type")
    public String getAppointmentType() {
        return appointmentType;
    }
    public void setAppointmentType(String appointmentType) {
        this.appointmentType = appointmentType;
    }

    @Basic
    @Column(name = "duration")
    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Basic
    @Column(name = "appointment_datetime")
    public Timestamp getAppointmentDateTime() {
        return appointmentDatetime;
    }
    public void setAppointmentDateTime(Timestamp appointmentDateTime) {
        this.appointmentDatetime = appointmentDateTime;
    }

    @Basic
    @Column(name = "block")
    public Byte getBlock() {
        return block;
    }
    public void setBlock(Byte block) {
        this.block = block;
    }

    @Basic
    @Column(name = "block_reason")
    public String getBlockReason() {
        return blockReason;
    }
    public void setBlockReason(String blockReason) {
        this.blockReason = blockReason;
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
    @Column(name = "n_type")
    public String getNType() {
        return NType;
    }
    public void setNType(String NType) {
        this.NType = NType;
    }

    @Basic
    @Column(name = "n_destination")
    public String getNDestination() {
        return NDestination;
    }
    public void setNDestination(String NDestination) {
        this.NDestination = NDestination;
    }

    @Basic
    @Column(name = "n_datetime_sent")
    public Timestamp getNDatetimeSent() {
        return NDatetimeSent;
    }
    public void setNDatetimeSent(Timestamp NDatetimeSent) {
        this.NDatetimeSent = NDatetimeSent;
    }

    @Basic
    @Column(name = "n_message")
    public String getNMessage() {
        return NMessage;
    }
    public void setNMessage(String NMessage) {
        this.NMessage = NMessage;
    }

    @Basic
    @Column(name = "n_patient_confirmed")
    public Byte getNPatientConfirmed() {
        return NPatientConfirmed;
    }
    public void setNPatientConfirmed(Byte NPatientConfirmed) {
        this.NPatientConfirmed = NPatientConfirmed;
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


    @Basic
    @Column(name = "deleted_at")
    public Timestamp getDeletedAt() {
        return deletedAt;
    }
    public void setDeletedAt(Timestamp deletedAt) {
        this.deletedAt = deletedAt;
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
    @JoinColumn(name = "location_id", referencedColumnName = "id", nullable = false)
    public LocationEntity getLocationByLocationId() {
        return locationByLocationId;
    }
    public void setLocationByLocationId(LocationEntity locationByLocationId) {
        this.locationByLocationId = locationByLocationId;
    }


    @OneToMany(mappedBy = "appointmentByAppointmentId")
    public Collection<ChiefComplaintEntity> getChiefComplaintsById() {
        return chiefComplaintsById;
    }
    public void setChiefComplaintsById(Collection<ChiefComplaintEntity> chiefComplaintsById) {
        this.chiefComplaintsById = chiefComplaintsById;
    }

    @OneToMany(mappedBy = "appointmentByAppointmentId")
    public Collection<AppointmentEncounterEntity> getAppointmentEncountersById() {
        return appointmentEncountersById;
    }
    public void setAppointmentEncountersById(Collection<AppointmentEncounterEntity> appointmentEncountersById) {
        this.appointmentEncountersById = appointmentEncountersById;
    }

}
