package com.doctrly.integration.allscripts.dto;

import lombok.Data;

import java.math.BigInteger;
import java.sql.Timestamp;


@Data
public class Vital {
    private BigInteger id;
    private String sourceId;
    private BigInteger encounterId;

    private String type;
    private String value;
    private String units;
    private String refRangeHigh;
    private String refRangeLow;
    private String refRangeUnits;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    private Encounter encounterByEncounterId;

}
