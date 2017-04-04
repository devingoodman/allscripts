package com.doctrly.integration.allscripts.dto;

import lombok.Data;

import java.math.BigInteger;
import java.sql.Timestamp;


@Data
public class AllergyReaction {
    private BigInteger id;
    private BigInteger allergyId;

    private String description;
    private Byte active;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    private Allergy allergyByAllergyId;

}
