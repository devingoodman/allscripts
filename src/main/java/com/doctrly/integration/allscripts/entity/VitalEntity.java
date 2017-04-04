package com.doctrly.integration.allscripts.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "vital", catalog = "")
public class VitalEntity {
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

    private String type;
    private String value;
    private String units;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private EncounterEntity encounterByEncounterId;


    private String rr_high;
    private String rr_low;
    private String rr_units;


    private BigInteger encounterId;

    @Basic
    @Column(name = "encounter_id", insertable=false, updatable = false)
    public BigInteger getEncounterId() {
        return encounterId;
    }
    public void setEncounterId(BigInteger encounterId) {
        this.encounterId = encounterId;
    }


    @Basic
    @Column(name = "ref_range_high")
    public String getRRHigh() {
        return rr_high;
    }
    public void setRRHigh(String rr_high) {
        this.rr_high = rr_high;
    }

    @Basic
    @Column(name = "ref_range_low")
    public String getRRLow() {
        return rr_low;
    }
    public void setRRLow(String rr_low) {
        this.rr_low = rr_low;
    }

    @Basic
    @Column(name = "ref_range_units")
    public String getRRUnits() {
        return rr_units;
    }
    public void setRRUnits(String rr_units) {
        this.rr_units = rr_units;
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
    @Column(name = "type")
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "value")
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "units")
    public String getUnits() {
        return units;
    }
    public void setUnits(String units) {
        this.units = units;
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
    @JoinColumn(name = "encounter_id", referencedColumnName = "id", nullable = false)
    public EncounterEntity getEncounterByEncounterId() {
        return encounterByEncounterId;
    }
    public void setEncounterByEncounterId(EncounterEntity encounterByEncounterId) {
        this.encounterByEncounterId = encounterByEncounterId;
    }
}
