package com.doctrly.integration.allscripts.dto;

import lombok.Data;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;


@Data
public class Allergy {
    private BigInteger id;
    private String sourceId;
    private BigInteger patientId;
    private BigInteger encounterId;

    private String name;
    private Timestamp onsetDatetime;
    private String severity;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    private Patient patientByPatientId;
    private Encounter encounterByEncounterId;

    private Collection<AllergyReaction> allergyReactionsById;

}
