package com.doctrly.integration.allscripts.entity;

import java.io.Serializable;
import java.math.BigInteger;


public class PatientSourceSystemEntityPK implements Serializable {

    private BigInteger patientId;
    private BigInteger sourceSystemId;

    public PatientSourceSystemEntityPK() {
    }

    public PatientSourceSystemEntityPK(BigInteger patientId, BigInteger sourceSystemId) {
        this.patientId = patientId;
        this.sourceSystemId = sourceSystemId;
    }

    public BigInteger getPatientId() {
        return patientId;
    }
    public void setPatientId(BigInteger patientId) {
        this.patientId = patientId;
    }

    public BigInteger getSourceSystemId() {
        return sourceSystemId;
    }
    public void setSourceSystemId(BigInteger sourceSystemId) {
        this.sourceSystemId = sourceSystemId;
    }

}
