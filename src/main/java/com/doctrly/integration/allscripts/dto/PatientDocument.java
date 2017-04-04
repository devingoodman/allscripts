package com.doctrly.integration.allscripts.dto;

import lombok.Data;

import java.math.BigInteger;
import java.sql.Timestamp;


@Data
public class PatientDocument {
    private BigInteger id;
    private String sourceId;
    private BigInteger patientId;
    private BigInteger providerId;
    private BigInteger groupId;
    private BigInteger encounterId;
    private BigInteger documentId;

    private String category1;
    private String category2;
    private String category3;
    private String tag1;
    private String tag2;
    private String tag3;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    private Patient patientByPatientId;
    private Provider providerByProviderId;
    private Group groupByGroupId;
    private Encounter encounterByEncounterId;
    private Document documentByDocumentId;

}
