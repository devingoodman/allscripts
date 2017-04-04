package com.doctrly.integration.allscripts.dto;

import lombok.Data;
import lombok.ToString;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;


@ToString
//@Data
public class Appointment {

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public BigInteger getPatientId() {
        return patientId;
    }

    public void setPatientId(BigInteger patientId) {
        this.patientId = patientId;
    }

    public BigInteger getProviderId() {
        return providerId;
    }

    public void setProviderId(BigInteger providerId) {
        this.providerId = providerId;
    }

    public BigInteger getLocationId() {
        return locationId;
    }

    public void setLocationId(BigInteger locationId) {
        this.locationId = locationId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAppointmentType() {
        return appointmentType;
    }

    public void setAppointmentType(String appointmentType) {
        this.appointmentType = appointmentType;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Timestamp getAppointmentDatetime() {
        return appointmentDatetime;
    }

    public void setAppointmentDatetime(Timestamp appointmentDatetime) {
        this.appointmentDatetime = appointmentDatetime;
    }

    public Byte getBlock() {
        return block;
    }

    public void setBlock(Byte block) {
        this.block = block;
    }

    public String getBlockReason() {
        return blockReason;
    }

    public void setBlockReason(String blockReason) {
        this.blockReason = blockReason;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getnType() {
        return nType;
    }

    public void setnType(String nType) {
        this.nType = nType;
    }

    public String getnDestination() {
        return nDestination;
    }

    public void setnDestination(String nDestination) {
        this.nDestination = nDestination;
    }

    public Timestamp getnDatetimeSent() {
        return nDatetimeSent;
    }

    public void setnDatetimeSent(Timestamp nDatetimeSent) {
        this.nDatetimeSent = nDatetimeSent;
    }

    public String getnMessage() {
        return nMessage;
    }

    public void setnMessage(String nMessage) {
        this.nMessage = nMessage;
    }

    public Byte getnPatientConfirmed() {
        return nPatientConfirmed;
    }

    public void setnPatientConfirmed(Byte nPatientConfirmed) {
        this.nPatientConfirmed = nPatientConfirmed;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Timestamp getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Patient getPatientByPatientId() {
        return patientByPatientId;
    }

    public void setPatientByPatientId(Patient patientByPatientId) {
        this.patientByPatientId = patientByPatientId;
    }

    public Provider getProviderByProviderId() {
        return providerByProviderId;
    }

    public void setProviderByProviderId(Provider providerByProviderId) {
        this.providerByProviderId = providerByProviderId;
    }

    public Location getLocationByLocationId() {
        return locationByLocationId;
    }

    public void setLocationByLocationId(Location locationByLocationId) {
        this.locationByLocationId = locationByLocationId;
    }

    public Collection<AppointmentEncounter> getAppointmentEncountersById() {
        return appointmentEncountersById;
    }

    public void setAppointmentEncountersById(Collection<AppointmentEncounter> appointmentEncountersById) {
        this.appointmentEncountersById = appointmentEncountersById;
    }

    public Collection<ChiefComplaint> getChiefComplaintsById() {
        return chiefComplaintsById;
    }

    public void setChiefComplaintsById(Collection<ChiefComplaint> chiefComplaintsById) {
        this.chiefComplaintsById = chiefComplaintsById;
    }

    private BigInteger id;
    private String sourceId;
    private BigInteger patientId;
    private BigInteger providerId;
    private BigInteger locationId;

    private String location;
    private String appointmentType;
    private String duration;
    private Timestamp appointmentDatetime;
    private Byte block;
    private String blockReason;
    private String notes;
    private String nType;
    private String nDestination;
    private Timestamp nDatetimeSent;
    private String nMessage;
    private Byte nPatientConfirmed;
    
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Timestamp deletedAt;

    private Patient patientByPatientId;
    private Provider providerByProviderId;
    private Location locationByLocationId;

    private Collection<AppointmentEncounter> appointmentEncountersById;
    private Collection<ChiefComplaint> chiefComplaintsById;

}
