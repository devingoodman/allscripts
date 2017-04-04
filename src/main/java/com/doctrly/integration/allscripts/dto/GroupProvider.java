package com.doctrly.integration.allscripts.dto;

import lombok.Data;

import java.math.BigInteger;
import java.sql.Timestamp;


@Data
public class GroupProvider {
    private BigInteger id;
    private BigInteger groupId;
    private BigInteger providerId;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    private Group groupByGroupId;
    private Provider providerByProviderId;

}
