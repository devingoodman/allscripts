package com.doctrly.integration.allscripts.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "lab_result_panel", catalog = "")
public class LabResultPanelEntity {
    private BigInteger id;
    private String name;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private LabResultEntity labResultByLabResultId;
    private Collection<LabResultPanelTestEntity> labResultPanelTestsById;

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
    @JoinColumn(name = "lab_result_id", referencedColumnName = "id", nullable = false)
    public LabResultEntity getLabResultByLabResultId() {
        return labResultByLabResultId;
    }
    public void setLabResultByLabResultId(LabResultEntity labResultByLabResultId) {
        this.labResultByLabResultId = labResultByLabResultId;
    }

    @OneToMany(mappedBy = "labResultPanelByLabResultPanelId")
    public Collection<LabResultPanelTestEntity> getLabResultPanelTestsById() {
        return labResultPanelTestsById;
    }
    public void setLabResultPanelTestsById(Collection<LabResultPanelTestEntity> labResultPanelTestsById) {
        this.labResultPanelTestsById = labResultPanelTestsById;
    }
}
