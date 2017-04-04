package com.doctrly.integration.allscripts.service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Action",
        "Appname",
        "AppUserID",
        "PatientID",
        "Token",
        "Parameter1",
        "Parameter2",
        "Parameter3",
        "Parameter4",
        "Parameter5",
        "Parameter6",
        "Data"
})
public class UnityRequest {

    public UnityRequest() {
        this.appname = "";
        this.appUserID = "";
        this.parameter1 = "";
        this.parameter2 = "";
        this.parameter3 = "";
        this.parameter4 = "";
        this.parameter5 = "";
        this.parameter6 = "";
        this.data = "null";
    }


    @JsonProperty("Action")
    public String action;
    @JsonProperty("Appname")
    public String appname;
    @JsonProperty("AppUserID")
    public String appUserID;
    @JsonProperty("PatientID")
    public String patientID;
    @JsonProperty("Token")
    public String token;
    @JsonProperty("Parameter1")
    public String parameter1;
    @JsonProperty("Parameter2")
    public String parameter2;
    @JsonProperty("Parameter3")
    public String parameter3;
    @JsonProperty("Parameter4")
    public String parameter4;
    @JsonProperty("Parameter5")
    public String parameter5;
    @JsonProperty("Parameter6")
    public String parameter6;
    @JsonProperty("Data")
    public String data;

}