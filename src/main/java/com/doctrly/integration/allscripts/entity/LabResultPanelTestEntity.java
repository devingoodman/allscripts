package com.doctrly.integration.allscripts.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Table(name = "lab_result_panel_test", catalog = "")
public class LabResultPanelTestEntity {
    private BigInteger id;
    private String name;
    private String value;
    private String units;
    private String referenceLow;
    private String referenceHigh;
    private String referenceUnits;
    private String flag;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private LabResultPanelEntity labResultPanelByLabResultPanelId;

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
    @Column(name = "reference_low")
    public String getReferenceLow() {
        return referenceLow;
    }
    public void setReferenceLow(String referenceLow) {
        this.referenceLow = referenceLow;
    }

    @Basic
    @Column(name = "reference_high")
    public String getReferenceHigh() {
        return referenceHigh;
    }
    public void setReferenceHigh(String referenceHigh) {
        this.referenceHigh = referenceHigh;
    }

    @Basic
    @Column(name = "reference_units")
    public String getReferenceUnits() {
        return referenceUnits;
    }
    public void setReferenceUnits(String referenceUnits) {
        this.referenceUnits = referenceUnits;
    }

    @Basic
    @Column(name = "flag")
    public String getFlag() {
        return flag;
    }
    public void setFlag(String flag) {
        this.flag = flag;
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
    @JoinColumn(name = "lab_result_panel_id", referencedColumnName = "id", nullable = false)
    public LabResultPanelEntity getLabResultPanelByLabResultPanelId() {
        return labResultPanelByLabResultPanelId;
    }
    public void setLabResultPanelByLabResultPanelId(LabResultPanelEntity labResultPanelByLabResultPanelId) {
        this.labResultPanelByLabResultPanelId = labResultPanelByLabResultPanelId;
    }
}
