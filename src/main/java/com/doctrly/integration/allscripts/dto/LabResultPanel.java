package com.doctrly.integration.allscripts.dto;

import lombok.Data;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;


@Data
public class LabResultPanel {
    private BigInteger id;
    private BigInteger labResultId;

    private String name;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    private LabResult labResultByLabResultId;
    
    private Collection<LabResultPanelTest> labResultPanelTestsById;

}
