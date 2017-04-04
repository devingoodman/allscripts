package com.doctrly.integration.allscripts.dto;

import lombok.Data;

import java.math.BigInteger;
import java.sql.Timestamp;


@Data
public class EntityCodes {
    private BigInteger id;
    private BigInteger entityId;

    private String entityType;
    private String system;
    private String code;
    private Byte status;
    private String tag;

    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Timestamp deletedAt;

}
