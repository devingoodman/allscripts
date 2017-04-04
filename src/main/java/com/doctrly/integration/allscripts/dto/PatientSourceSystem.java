package com.doctrly.integration.allscripts.dto;

import lombok.Data;

import java.math.BigInteger;
import java.sql.Timestamp;


@Data
public class PatientSourceSystem {
    private BigInteger patientId;
    private BigInteger sourceSystemId;

    private String mrn;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    private Patient patientByPatientId;
    private SourceSystem sourceSystemBySourceSystemId;

}
