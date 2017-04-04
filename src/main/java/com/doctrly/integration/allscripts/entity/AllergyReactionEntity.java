package com.doctrly.integration.allscripts.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Table(name = "allergy_reaction", catalog = "")
public class AllergyReactionEntity {
    private BigInteger id;
    private String description;
    private Byte active;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private AllergyEntity allergyByAllergyId;

    @Id
    @Column(name = "id")
    public BigInteger getId() {
        return id;
    }
    public void setId(BigInteger id) {
        this.id = id;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "active")
    public Byte getActive() {
        return active;
    }
    public void setActive(Byte active) {
        this.active = active;
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
    @JoinColumn(name = "allergy_id", referencedColumnName = "id", nullable = false)
    public AllergyEntity getAllergyByAllergyId() {
        return allergyByAllergyId;
    }
    public void setAllergyByAllergyId(AllergyEntity allergyByAllergyId) {
        this.allergyByAllergyId = allergyByAllergyId;
    }
}
