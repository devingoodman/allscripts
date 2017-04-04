package com.doctrly.integration.allscripts.dto;

import lombok.Data;

import java.math.BigInteger;
import java.sql.Timestamp;


@Data
public class LabResultPanelTest {
    private BigInteger id;
    private BigInteger labResultPanelId;

    private String name;
    private String value;
    private String units;
    private String referenceLow;
    private String referenceHigh;
    private String referenceUnits;
    private String flag;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    private LabResultPanel labResultPanelByLabResultPanelId;

}
