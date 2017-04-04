package com.doctrly.integration.allscripts.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigInteger;


public class AppointmentEncounterEntityPK implements Serializable {

    private BigInteger appointmentId;
    private BigInteger encounterId;


    @Id
    @Column(name = "appointment_id", insertable=false, updatable = false)
    public BigInteger getAppointmentId() {
        return appointmentId;
    }
    public void setAppointmentId(BigInteger appointmentId) {
        this.appointmentId = appointmentId;
    }

    @Id
    @Column(name = "encounter_id", insertable=false, updatable = false)
    public BigInteger getEncounterId() {
        return encounterId;
    }
    public void setEncounterId(BigInteger encounterId) {
        this.encounterId = encounterId;
    }


}
