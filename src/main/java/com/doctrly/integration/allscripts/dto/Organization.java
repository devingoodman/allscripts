package com.doctrly.integration.allscripts.dto;

import lombok.Data;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;


@Data
public class Organization {
    private BigInteger id;
    private String sourceId;

    private String name;
    private BigInteger addressId;
    private String phone;
    private String website;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    private Address addressByAddressId;

    private Collection<Group> groupssById;
    private Collection<Patient> patientsById;
    private Collection<Provider> providersById;

}
