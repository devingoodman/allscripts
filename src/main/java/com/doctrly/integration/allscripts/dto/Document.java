package com.doctrly.integration.allscripts.dto;

import lombok.Data;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;


@Data
public class Document {
    private BigInteger id;

    private String name;
    private String type;
    private Long size;
    private String status;
    private String s3Key;
    private String tempUrl;

    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Timestamp deletedAt;

    private Collection<PatientDocument> patientDocumentsById;

}
