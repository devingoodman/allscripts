package com.doctrly.integration.allscripts.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;


@Entity
@Table(name = "diagnosis_item", catalog = "")
public class DiagnosisItemEntity {
    private BigInteger id;
    private String name;
    //private String icd;
    //private String snomed;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    private DiagnosisEntity diagnosisByDiagnosisId;

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

    /*
    @Basic
    @Column(name = "icd")
    public String getIcd() {
        return icd;
    }
    public void setIcd(String icd) {
        this.icd = icd;
    }

    @Basic
    @Column(name = "snomed")
    public String getSnomed() {
        return snomed;
    }
    public void setSnomed(String snomed) {
        this.snomed = snomed;
    }
    */

    private Collection<EntityCodesEntity> codes;
    @Transient
    public Collection<EntityCodesEntity> getCodes() {
        return codes;
    }
    @Transient
    public void setCodes(Collection<EntityCodesEntity> codes) {
        this.codes = codes;
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
    @JoinColumn(name = "diagnosis_id", referencedColumnName = "id", nullable = false)
    public DiagnosisEntity getDiagnosisByDiagnosisId() {
        return diagnosisByDiagnosisId;
    }
    public void setDiagnosisByDiagnosisId(DiagnosisEntity diagnosisByDiagnosisId) {
        this.diagnosisByDiagnosisId = diagnosisByDiagnosisId;
    }

}
