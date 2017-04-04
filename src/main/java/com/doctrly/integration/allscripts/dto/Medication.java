package com.doctrly.integration.allscripts.dto;

import lombok.Data;

import java.math.BigInteger;
import java.sql.Timestamp;


@Data
public class Medication {
    private BigInteger id;
    private String sourceId;
    private BigInteger patientId;
    private BigInteger encounterId;

    private String name;
    private String dosageQuantity;
    private String dosageUnits;
    private String dosageRoute;
    private String directions;
    private String comments;
    private Timestamp startDatetime;
    private Timestamp endDatetime;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    private Patient patientByPatientId;
    private Encounter encounterByEncounterId;

}
