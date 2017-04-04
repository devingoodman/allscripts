
package com.doctrly.integration.allscripts.pojo;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import com.fasterxml.jackson.annotation.*;

import lombok.Data;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "LocationName",
    "Practitioner_Name",
    "TimeOut",
    "Link_Control_Number",
    "Duration",
    "Comment",
    "patient",
    "base64image",
    "organizationMRN",
    "Status",
    "PatientFirstName",
    "SchedComment",
    "ApptTime2",
    "appttype",
    "ApptTime",
    "AppointmentID",
    "SchedText",
    "OrganizationID",
    "TimeStart",
    "Practitioner_ID",
    "ProviderID",
    "OrgName",
    "PatientLastName",
    "Patient_DOB",
    "TimeIn",
    "statuscolor",
    "Provider",
    "type",
    "patientID",
    "username"
})
public class Getscheduleinfo {

    @JsonProperty("LocationName")
    private String locationName;
    @JsonProperty("Practitioner_Name")
    private String practitionerName;
    @JsonProperty("TimeOut")
    private String timeOut;
    @JsonProperty("Link_Control_Number")
    private String linkControlNumber;
    @JsonProperty("Duration")
    private String duration;
    @JsonProperty("Comment")
    private String comment;
    @JsonProperty("patient")
    private String patient;
    @JsonProperty("base64image")
    private String base64image;
    @JsonProperty("organizationMRN")
    private String organizationMRN;
    @JsonProperty("Status")
    private String status;
    @JsonProperty("PatientFirstName")
    private String patientFirstName;
    @JsonProperty("SchedComment")
    private String schedComment;
    @JsonProperty("ApptTime2")
    private String apptTime2;
    @JsonProperty("appttype")
    private String appttype;
    @JsonProperty("ApptTime")
    private String apptTime;
    @JsonProperty("AppointmentID")
    private String appointmentID;
    @JsonProperty("SchedText")
    private String schedText;
    @JsonProperty("OrganizationID")
    private String organizationID;
    @JsonProperty("TimeStart")
    private String timeStart;
    @JsonProperty("Practitioner_ID")
    private String practitionerID;
    @JsonProperty("ProviderID")
    private String providerID;
    @JsonProperty("OrgName")
    private String orgName;
    @JsonProperty("PatientLastName")
    private String patientLastName;
    @JsonProperty("Patient_DOB")
    private String patientDOB;
    @JsonProperty("TimeIn")
    private String timeIn;
    @JsonProperty("statuscolor")
    private String statuscolor;
    @JsonProperty("Provider")
    private String provider;
    @JsonProperty("type")
    private String type;
    @JsonProperty("patientID")
    private String patientID;
    @JsonProperty("username")
    private String username;


    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }
    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
