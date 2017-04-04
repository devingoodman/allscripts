package com.doctrly.integration.allscripts.dto;

import lombok.Data;

import java.math.BigInteger;
import java.sql.Timestamp;


@Data
public class DiagnosisItem {
    private BigInteger id;
    private BigInteger diagnosisId;

    private String name;
    private String icd;
    private String snomed;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    private Diagnosis diagnosisByDiagnosisId;

}
