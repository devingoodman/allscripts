package com.doctrly.integration.allscripts.dto;

import lombok.Data;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;


@Data
public class Diagnosis {
    private BigInteger id;
    private String sourceId;
    private BigInteger encounterId;

    private String notes;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    private Encounter encounterByEncounterId;
    
    private Collection<DiagnosisItem> diagnosisItemsById;

}
