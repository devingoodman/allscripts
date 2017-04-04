package com.doctrly.integration.allscripts.dto;

import lombok.Data;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;


@Data
public class SourceSystem {
    private BigInteger id;

    private String systemType;
    private String vendorName;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    private Collection<PatientSourceSystem> patientSourceSystemsById;

}
