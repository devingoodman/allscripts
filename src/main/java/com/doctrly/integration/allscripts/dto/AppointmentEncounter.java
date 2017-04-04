package com.doctrly.integration.allscripts.dto;

import lombok.Data;

import java.math.BigInteger;
import java.sql.Timestamp;


@Data
public class AppointmentEncounter {
    private BigInteger appointmentId;
    private BigInteger encounterId;

    private Byte code;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    private Appointment appointmentByAppointmentId;
    private Encounter encounterByEncounterId;

}
