package com.doctrly.integration.allscripts.dto;

import lombok.Data;

import java.math.BigInteger;
import java.sql.Timestamp;


@Data
public class ChiefComplaint {
    private BigInteger id;
    private BigInteger appointmentId;

    private String name;
    private String description;
    private String icd;
    private String snomed;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    private Appointment appointmentByAppointmentId;

}
