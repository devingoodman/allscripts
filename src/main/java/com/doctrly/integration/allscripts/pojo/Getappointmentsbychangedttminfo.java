package com.doctrly.integration.allscripts.pojo;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import com.fasterxml.jackson.annotation.*;

import lombok.Data;
import lombok.ToString;

@ToString
//@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Noshow_Op_LastName",
        "Resource_Abbr",
        "Specialist_CoPay_Applies",
        "DepartmentAbbr",
        "Ref_Dr_Practitioner_ID",
        "AttendingFirstName",
        "Patient_ID",
        "Patient_DOB",
        "Appt_Sched_Location_Abbr",
        "Check_Out_Time",
        "Scheduling_Department_ID",
        "Noshow_Op_MI",
        "Cancellation_Op_FirstName",
        "Noshow_Operator_Abbr",
        "Scheduling_Location_ID",
        "Patient_Last_Name",
        "Resource_ID",
        "Coverage_Type",
        "Ailment_ID",
        "Pending_Avail_Update_Count",
        "Bumped_Op_MI",
        "Cancellation_Reason_ID",
        "Bumped_Reason_ID",
        "Patient_First_Name",
        "Check_In_Time",
        "Bumped_By_Operator_ID",
        "Cancellation_Reason_Abbr",
        "LocationAbbr",
        "Appt_Type_Desc",
        "Cancellation_Op_LastName",
        "DateTime_Cancelled",
        "CoPayment_Amount",
        "Status",
        "DateTime_Scheduled",
        "Appointment_ID",
        "Appt_Sched_Department_Abbr",
        "LastRequestDateTime",
        "DateTime_NoShow",
        "Appt_Sched_Department_Desc",
        "AttendingSuffix",
        "Link_Control_Number",
        "Patient_Suffix",
        "LastResponseDateTime",
        "Patient_Number",
        "Location_ID",
        "Eligibility_Status_Coverage",
        "Is_Forced_Appointment",
        "DateTime_Bumped",
        "NoShow_By_Operator_ID",
        "AttendingMI",
        "Bumped_Op_LastName",
        "Cancellation_Operator",
        "Duration",
        "AttendingSpecialty",
        "Appt_Type_Abbr",
        "Patient_Middle_Initial",
        "Cancellation_Reason_Desc",
        "Bumped_Reason_Abbr",
        "Cancellation_Op_MI",
        "Appt_Sched_Location_Desc",
        "Appt_Comments",
        "Noshow_Op_FirstName",
        "Bumped_Op_FirstName",
        "Department_ID",
        "Encounter_Number",
        "Appointment_DateTime",
        "Bumped_Reason_Desc",
        "Ailment_Comments",
        "Eligibility_Status",
        "Bumped_Operator",
        "Cancelled_By_Operator_ID",
        "AttendingLastName",
        "DateTIme_Confirmed",
        "AttendingAbbreviation",
        "Eligible_RealTime",
        "Appointment_Type_ID"
})
public class Getappointmentsbychangedttminfo {

    public String getNoshowOpLastName() {
        return noshowOpLastName;
    }

    public void setNoshowOpLastName(String noshowOpLastName) {
        this.noshowOpLastName = noshowOpLastName;
    }

    public String getResourceAbbr() {
        return resourceAbbr;
    }

    public void setResourceAbbr(String resourceAbbr) {
        this.resourceAbbr = resourceAbbr;
    }

    public String getSpecialistCoPayApplies() {
        return specialistCoPayApplies;
    }

    public void setSpecialistCoPayApplies(String specialistCoPayApplies) {
        this.specialistCoPayApplies = specialistCoPayApplies;
    }

    public String getDepartmentAbbr() {
        return departmentAbbr;
    }

    public void setDepartmentAbbr(String departmentAbbr) {
        this.departmentAbbr = departmentAbbr;
    }

    public String getRefDrPractitionerID() {
        return refDrPractitionerID;
    }

    public void setRefDrPractitionerID(String refDrPractitionerID) {
        this.refDrPractitionerID = refDrPractitionerID;
    }

    public String getAttendingFirstName() {
        return attendingFirstName;
    }

    public void setAttendingFirstName(String attendingFirstName) {
        this.attendingFirstName = attendingFirstName;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getPatientDOB() {
        return patientDOB;
    }

    public void setPatientDOB(String patientDOB) {
        this.patientDOB = patientDOB;
    }

    public String getApptSchedLocationAbbr() {
        return apptSchedLocationAbbr;
    }

    public void setApptSchedLocationAbbr(String apptSchedLocationAbbr) {
        this.apptSchedLocationAbbr = apptSchedLocationAbbr;
    }

    public String getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public String getSchedulingDepartmentID() {
        return schedulingDepartmentID;
    }

    public void setSchedulingDepartmentID(String schedulingDepartmentID) {
        this.schedulingDepartmentID = schedulingDepartmentID;
    }

    public String getNoshowOpMI() {
        return noshowOpMI;
    }

    public void setNoshowOpMI(String noshowOpMI) {
        this.noshowOpMI = noshowOpMI;
    }

    public String getCancellationOpFirstName() {
        return cancellationOpFirstName;
    }

    public void setCancellationOpFirstName(String cancellationOpFirstName) {
        this.cancellationOpFirstName = cancellationOpFirstName;
    }

    public String getNoshowOperatorAbbr() {
        return noshowOperatorAbbr;
    }

    public void setNoshowOperatorAbbr(String noshowOperatorAbbr) {
        this.noshowOperatorAbbr = noshowOperatorAbbr;
    }

    public String getSchedulingLocationID() {
        return schedulingLocationID;
    }

    public void setSchedulingLocationID(String schedulingLocationID) {
        this.schedulingLocationID = schedulingLocationID;
    }

    public String getPatientLastName() {
        return patientLastName;
    }

    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }

    public String getResourceID() {
        return resourceID;
    }

    public void setResourceID(String resourceID) {
        this.resourceID = resourceID;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public void setCoverageType(String coverageType) {
        this.coverageType = coverageType;
    }

    public String getAilmentID() {
        return ailmentID;
    }

    public void setAilmentID(String ailmentID) {
        this.ailmentID = ailmentID;
    }

    public String getPendingAvailUpdateCount() {
        return pendingAvailUpdateCount;
    }

    public void setPendingAvailUpdateCount(String pendingAvailUpdateCount) {
        this.pendingAvailUpdateCount = pendingAvailUpdateCount;
    }

    public String getBumpedOpMI() {
        return bumpedOpMI;
    }

    public void setBumpedOpMI(String bumpedOpMI) {
        this.bumpedOpMI = bumpedOpMI;
    }

    public String getCancellationReasonID() {
        return cancellationReasonID;
    }

    public void setCancellationReasonID(String cancellationReasonID) {
        this.cancellationReasonID = cancellationReasonID;
    }

    public String getBumpedReasonID() {
        return bumpedReasonID;
    }

    public void setBumpedReasonID(String bumpedReasonID) {
        this.bumpedReasonID = bumpedReasonID;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public String getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(String checkInTime) {
        this.checkInTime = checkInTime;
    }

    public String getBumpedByOperatorID() {
        return bumpedByOperatorID;
    }

    public void setBumpedByOperatorID(String bumpedByOperatorID) {
        this.bumpedByOperatorID = bumpedByOperatorID;
    }

    public String getCancellationReasonAbbr() {
        return cancellationReasonAbbr;
    }

    public void setCancellationReasonAbbr(String cancellationReasonAbbr) {
        this.cancellationReasonAbbr = cancellationReasonAbbr;
    }

    public String getLocationAbbr() {
        return locationAbbr;
    }

    public void setLocationAbbr(String locationAbbr) {
        this.locationAbbr = locationAbbr;
    }

    public String getApptTypeDesc() {
        return apptTypeDesc;
    }

    public void setApptTypeDesc(String apptTypeDesc) {
        this.apptTypeDesc = apptTypeDesc;
    }

    public String getCancellationOpLastName() {
        return cancellationOpLastName;
    }

    public void setCancellationOpLastName(String cancellationOpLastName) {
        this.cancellationOpLastName = cancellationOpLastName;
    }

    public String getDateTimeCancelled() {
        return dateTimeCancelled;
    }

    public void setDateTimeCancelled(String dateTimeCancelled) {
        this.dateTimeCancelled = dateTimeCancelled;
    }

    public String getCoPaymentAmount() {
        return coPaymentAmount;
    }

    public void setCoPaymentAmount(String coPaymentAmount) {
        this.coPaymentAmount = coPaymentAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDateTimeScheduled() {
        return dateTimeScheduled;
    }

    public void setDateTimeScheduled(String dateTimeScheduled) {
        this.dateTimeScheduled = dateTimeScheduled;
    }

    public String getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(String appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getApptSchedDepartmentAbbr() {
        return apptSchedDepartmentAbbr;
    }

    public void setApptSchedDepartmentAbbr(String apptSchedDepartmentAbbr) {
        this.apptSchedDepartmentAbbr = apptSchedDepartmentAbbr;
    }

    public String getLastRequestDateTime() {
        return lastRequestDateTime;
    }

    public void setLastRequestDateTime(String lastRequestDateTime) {
        this.lastRequestDateTime = lastRequestDateTime;
    }

    public String getDateTimeNoShow() {
        return dateTimeNoShow;
    }

    public void setDateTimeNoShow(String dateTimeNoShow) {
        this.dateTimeNoShow = dateTimeNoShow;
    }

    public String getApptSchedDepartmentDesc() {
        return apptSchedDepartmentDesc;
    }

    public void setApptSchedDepartmentDesc(String apptSchedDepartmentDesc) {
        this.apptSchedDepartmentDesc = apptSchedDepartmentDesc;
    }

    public String getAttendingSuffix() {
        return attendingSuffix;
    }

    public void setAttendingSuffix(String attendingSuffix) {
        this.attendingSuffix = attendingSuffix;
    }

    public String getLinkControlNumber() {
        return linkControlNumber;
    }

    public void setLinkControlNumber(String linkControlNumber) {
        this.linkControlNumber = linkControlNumber;
    }

    public String getPatientSuffix() {
        return patientSuffix;
    }

    public void setPatientSuffix(String patientSuffix) {
        this.patientSuffix = patientSuffix;
    }

    public String getLastResponseDateTime() {
        return lastResponseDateTime;
    }

    public void setLastResponseDateTime(String lastResponseDateTime) {
        this.lastResponseDateTime = lastResponseDateTime;
    }

    public String getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(String patientNumber) {
        this.patientNumber = patientNumber;
    }

    public String getLocationID() {
        return locationID;
    }

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    public String getEligibilityStatusCoverage() {
        return eligibilityStatusCoverage;
    }

    public void setEligibilityStatusCoverage(String eligibilityStatusCoverage) {
        this.eligibilityStatusCoverage = eligibilityStatusCoverage;
    }

    public String getIsForcedAppointment() {
        return isForcedAppointment;
    }

    public void setIsForcedAppointment(String isForcedAppointment) {
        this.isForcedAppointment = isForcedAppointment;
    }

    public String getDateTimeBumped() {
        return dateTimeBumped;
    }

    public void setDateTimeBumped(String dateTimeBumped) {
        this.dateTimeBumped = dateTimeBumped;
    }

    public String getNoShowByOperatorID() {
        return noShowByOperatorID;
    }

    public void setNoShowByOperatorID(String noShowByOperatorID) {
        this.noShowByOperatorID = noShowByOperatorID;
    }

    public String getAttendingMI() {
        return attendingMI;
    }

    public void setAttendingMI(String attendingMI) {
        this.attendingMI = attendingMI;
    }

    public String getBumpedOpLastName() {
        return bumpedOpLastName;
    }

    public void setBumpedOpLastName(String bumpedOpLastName) {
        this.bumpedOpLastName = bumpedOpLastName;
    }

    public String getCancellationOperator() {
        return cancellationOperator;
    }

    public void setCancellationOperator(String cancellationOperator) {
        this.cancellationOperator = cancellationOperator;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getAttendingSpecialty() {
        return attendingSpecialty;
    }

    public void setAttendingSpecialty(String attendingSpecialty) {
        this.attendingSpecialty = attendingSpecialty;
    }

    public String getApptTypeAbbr() {
        return apptTypeAbbr;
    }

    public void setApptTypeAbbr(String apptTypeAbbr) {
        this.apptTypeAbbr = apptTypeAbbr;
    }

    public String getPatientMiddleInitial() {
        return patientMiddleInitial;
    }

    public void setPatientMiddleInitial(String patientMiddleInitial) {
        this.patientMiddleInitial = patientMiddleInitial;
    }

    public String getCancellationReasonDesc() {
        return cancellationReasonDesc;
    }

    public void setCancellationReasonDesc(String cancellationReasonDesc) {
        this.cancellationReasonDesc = cancellationReasonDesc;
    }

    public String getBumpedReasonAbbr() {
        return bumpedReasonAbbr;
    }

    public void setBumpedReasonAbbr(String bumpedReasonAbbr) {
        this.bumpedReasonAbbr = bumpedReasonAbbr;
    }

    public String getCancellationOpMI() {
        return cancellationOpMI;
    }

    public void setCancellationOpMI(String cancellationOpMI) {
        this.cancellationOpMI = cancellationOpMI;
    }

    public String getApptSchedLocationDesc() {
        return apptSchedLocationDesc;
    }

    public void setApptSchedLocationDesc(String apptSchedLocationDesc) {
        this.apptSchedLocationDesc = apptSchedLocationDesc;
    }

    public String getApptComments() {
        return apptComments;
    }

    public void setApptComments(String apptComments) {
        this.apptComments = apptComments;
    }

    public String getNoshowOpFirstName() {
        return noshowOpFirstName;
    }

    public void setNoshowOpFirstName(String noshowOpFirstName) {
        this.noshowOpFirstName = noshowOpFirstName;
    }

    public String getBumpedOpFirstName() {
        return bumpedOpFirstName;
    }

    public void setBumpedOpFirstName(String bumpedOpFirstName) {
        this.bumpedOpFirstName = bumpedOpFirstName;
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public String getEncounterNumber() {
        return encounterNumber;
    }

    public void setEncounterNumber(String encounterNumber) {
        this.encounterNumber = encounterNumber;
    }

    public String getAppointmentDateTime() {
        return appointmentDateTime;
    }

    public void setAppointmentDateTime(String appointmentDateTime) {
        this.appointmentDateTime = appointmentDateTime;
    }

    public String getBumpedReasonDesc() {
        return bumpedReasonDesc;
    }

    public void setBumpedReasonDesc(String bumpedReasonDesc) {
        this.bumpedReasonDesc = bumpedReasonDesc;
    }

    public String getAilmentComments() {
        return ailmentComments;
    }

    public void setAilmentComments(String ailmentComments) {
        this.ailmentComments = ailmentComments;
    }

    public String getEligibilityStatus() {
        return eligibilityStatus;
    }

    public void setEligibilityStatus(String eligibilityStatus) {
        this.eligibilityStatus = eligibilityStatus;
    }

    public String getBumpedOperator() {
        return bumpedOperator;
    }

    public void setBumpedOperator(String bumpedOperator) {
        this.bumpedOperator = bumpedOperator;
    }

    public String getCancelledByOperatorID() {
        return cancelledByOperatorID;
    }

    public void setCancelledByOperatorID(String cancelledByOperatorID) {
        this.cancelledByOperatorID = cancelledByOperatorID;
    }

    public String getAttendingLastName() {
        return attendingLastName;
    }

    public void setAttendingLastName(String attendingLastName) {
        this.attendingLastName = attendingLastName;
    }

    public String getDateTImeConfirmed() {
        return dateTImeConfirmed;
    }

    public void setDateTImeConfirmed(String dateTImeConfirmed) {
        this.dateTImeConfirmed = dateTImeConfirmed;
    }

    public String getAttendingAbbreviation() {
        return attendingAbbreviation;
    }

    public void setAttendingAbbreviation(String attendingAbbreviation) {
        this.attendingAbbreviation = attendingAbbreviation;
    }

    public String getEligibleRealTime() {
        return eligibleRealTime;
    }

    public void setEligibleRealTime(String eligibleRealTime) {
        this.eligibleRealTime = eligibleRealTime;
    }

    public String getAppointmentTypeID() {
        return appointmentTypeID;
    }

    public void setAppointmentTypeID(String appointmentTypeID) {
        this.appointmentTypeID = appointmentTypeID;
    }


    @JsonProperty("Noshow_Op_LastName")
    private String noshowOpLastName;
    @JsonProperty("Resource_Abbr")
    private String resourceAbbr;
    @JsonProperty("Specialist_CoPay_Applies")
    private String specialistCoPayApplies;
    @JsonProperty("DepartmentAbbr")
    private String departmentAbbr;
    @JsonProperty("Ref_Dr_Practitioner_ID")
    private String refDrPractitionerID;
    @JsonProperty("AttendingFirstName")
    private String attendingFirstName;
    @JsonProperty("Patient_ID")
    private String patientID;
    @JsonProperty("Patient_DOB")
    private String patientDOB;
    @JsonProperty("Appt_Sched_Location_Abbr")
    private String apptSchedLocationAbbr;
    @JsonProperty("Check_Out_Time")
    private String checkOutTime;
    @JsonProperty("Scheduling_Department_ID")
    private String schedulingDepartmentID;
    @JsonProperty("Noshow_Op_MI")
    private String noshowOpMI;
    @JsonProperty("Cancellation_Op_FirstName")
    private String cancellationOpFirstName;
    @JsonProperty("Noshow_Operator_Abbr")
    private String noshowOperatorAbbr;
    @JsonProperty("Scheduling_Location_ID")
    private String schedulingLocationID;
    @JsonProperty("Patient_Last_Name")
    private String patientLastName;
    @JsonProperty("Resource_ID")
    private String resourceID;
    @JsonProperty("Coverage_Type")
    private String coverageType;
    @JsonProperty("Ailment_ID")
    private String ailmentID;
    @JsonProperty("Pending_Avail_Update_Count")
    private String pendingAvailUpdateCount;
    @JsonProperty("Bumped_Op_MI")
    private String bumpedOpMI;
    @JsonProperty("Cancellation_Reason_ID")
    private String cancellationReasonID;
    @JsonProperty("Bumped_Reason_ID")
    private String bumpedReasonID;
    @JsonProperty("Patient_First_Name")
    private String patientFirstName;
    @JsonProperty("Check_In_Time")
    private String checkInTime;
    @JsonProperty("Bumped_By_Operator_ID")
    private String bumpedByOperatorID;
    @JsonProperty("Cancellation_Reason_Abbr")
    private String cancellationReasonAbbr;
    @JsonProperty("LocationAbbr")
    private String locationAbbr;
    @JsonProperty("Appt_Type_Desc")
    private String apptTypeDesc;
    @JsonProperty("Cancellation_Op_LastName")
    private String cancellationOpLastName;
    @JsonProperty("DateTime_Cancelled")
    private String dateTimeCancelled;
    @JsonProperty("CoPayment_Amount")
    private String coPaymentAmount;
    @JsonProperty("Status")
    private String status;
    @JsonProperty("DateTime_Scheduled")
    private String dateTimeScheduled;
    @JsonProperty("Appointment_ID")
    private String appointmentID;
    @JsonProperty("Appt_Sched_Department_Abbr")
    private String apptSchedDepartmentAbbr;
    @JsonProperty("LastRequestDateTime")
    private String lastRequestDateTime;
    @JsonProperty("DateTime_NoShow")
    private String dateTimeNoShow;
    @JsonProperty("Appt_Sched_Department_Desc")
    private String apptSchedDepartmentDesc;
    @JsonProperty("AttendingSuffix")
    private String attendingSuffix;
    @JsonProperty("Link_Control_Number")
    private String linkControlNumber;
    @JsonProperty("Patient_Suffix")
    private String patientSuffix;
    @JsonProperty("LastResponseDateTime")
    private String lastResponseDateTime;
    @JsonProperty("Patient_Number")
    private String patientNumber;
    @JsonProperty("Location_ID")
    private String locationID;
    @JsonProperty("Eligibility_Status_Coverage")
    private String eligibilityStatusCoverage;
    @JsonProperty("Is_Forced_Appointment")
    private String isForcedAppointment;
    @JsonProperty("DateTime_Bumped")
    private String dateTimeBumped;
    @JsonProperty("NoShow_By_Operator_ID")
    private String noShowByOperatorID;
    @JsonProperty("AttendingMI")
    private String attendingMI;
    @JsonProperty("Bumped_Op_LastName")
    private String bumpedOpLastName;
    @JsonProperty("Cancellation_Operator")
    private String cancellationOperator;
    @JsonProperty("Duration")
    private String duration;
    @JsonProperty("AttendingSpecialty")
    private String attendingSpecialty;
    @JsonProperty("Appt_Type_Abbr")
    private String apptTypeAbbr;
    @JsonProperty("Patient_Middle_Initial")
    private String patientMiddleInitial;
    @JsonProperty("Cancellation_Reason_Desc")
    private String cancellationReasonDesc;
    @JsonProperty("Bumped_Reason_Abbr")
    private String bumpedReasonAbbr;
    @JsonProperty("Cancellation_Op_MI")
    private String cancellationOpMI;
    @JsonProperty("Appt_Sched_Location_Desc")
    private String apptSchedLocationDesc;
    @JsonProperty("Appt_Comments")
    private String apptComments;
    @JsonProperty("Noshow_Op_FirstName")
    private String noshowOpFirstName;
    @JsonProperty("Bumped_Op_FirstName")
    private String bumpedOpFirstName;
    @JsonProperty("Department_ID")
    private String departmentID;
    @JsonProperty("Encounter_Number")
    private String encounterNumber;
    @JsonProperty("Appointment_DateTime")
    private String appointmentDateTime;
    @JsonProperty("Bumped_Reason_Desc")
    private String bumpedReasonDesc;
    @JsonProperty("Ailment_Comments")
    private String ailmentComments;
    @JsonProperty("Eligibility_Status")
    private String eligibilityStatus;
    @JsonProperty("Bumped_Operator")
    private String bumpedOperator;
    @JsonProperty("Cancelled_By_Operator_ID")
    private String cancelledByOperatorID;
    @JsonProperty("AttendingLastName")
    private String attendingLastName;
    @JsonProperty("DateTIme_Confirmed")
    private String dateTImeConfirmed;
    @JsonProperty("AttendingAbbreviation")
    private String attendingAbbreviation;
    @JsonProperty("Eligible_RealTime")
    private String eligibleRealTime;
    @JsonProperty("Appointment_Type_ID")
    private String appointmentTypeID;


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