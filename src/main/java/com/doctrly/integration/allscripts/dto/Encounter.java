package com.doctrly.integration.allscripts.dto;

import lombok.Data;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;


@Data
public class Encounter {
    private BigInteger id;
    private String sourceId;
    private BigInteger patientId;
    private BigInteger providerId;
    private BigInteger groupId;

    private Timestamp serviceDate;
    private String encounterType;
    private String generalNote;
    private String subjective;
    private String objective;
    private String assessment;
    private String plan;
    private String carbonCopy;
    private Byte digitalSignature;
    private String chiefComplaInt;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    private Patient patientByPatientId;
    private Provider providerByProviderId;
    private Group groupByGroupId;

    private Collection<Allergy> allergiesById;
    private Collection<AppointmentEncounter> appointmentEncountersById;
    private Collection<Diagnosis> diagnosesById;
    private Collection<LabResult> labResultsById;
    private Collection<Medication> medicationsById;
    private Collection<PatientDocument> patientDocumentsById;
    private Collection<Vital> vitalsById;

}
