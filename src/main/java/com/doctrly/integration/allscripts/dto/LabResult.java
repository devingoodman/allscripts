package com.doctrly.integration.allscripts.dto;

import lombok.Data;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;


@Data
public class LabResult {
    private BigInteger id;
    private String sourceId;
    private BigInteger patientId;
    private BigInteger encounterId;

    private Timestamp recordedDatetime;
    private Timestamp completedDatetime;
    private Byte fasting;
    private String comments;
    private String labName;
    private String labOrderNumber;
    private String labProviderName;
    private BigInteger labAddressId;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    private Patient patientByPatientId;
    private Encounter encounterByEncounterId;
    private Address addressByLabAddressId;

    private Collection<LabResultPanel> labResultPanelsById;

}
