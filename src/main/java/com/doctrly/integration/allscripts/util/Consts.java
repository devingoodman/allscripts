package com.doctrly.integration.allscripts.util;

/**
 Collected constants of general utility.

 <P>All members of this class are immutable.
 */
public final class Consts {

    public final static class Config {
        public static final String USERNAME     = "Doctr-233b-CCPM-test";
        public static final String PASSWORD     = "D!4TrlY5c-p4T%sTdpP%8B6%";
        public static final String APP_NAME     = "Doctrly.CC-PM.TestApp";
        public static final String PM_USERNAME  = "demo1";

        public static final String HOSTNAME             = "http://pmga.unitysandbox.com";
        public static final String MAGIC_URL            = HOSTNAME + "/UnityPM/unityservice.svc/json/MagicJson";
        public static final String GET_TOKEN_URL        = HOSTNAME + "/UnityPM/unityservice.svc/json/GetToken";
        public static final String RETIRE_TOKEN_URL     = HOSTNAME + "/UnityPM/unityservice.svc/json/RetireToken";
    }

    public final static class Action {

        public static final String SET_APPOINTMENT_STATUS       = "SetAppointmentStatus";
        public static final String SAVE_PATIENT_NOTE            = "SavePatientNote";

        public static final String GET_APPOINTMENTS_CHANGED     = "GetAppointmentsByChangeDTTM";

        public static final String GET_PATIENT_DEMOGRAPHICS     = "GetPatientDemographics";
        public static final String GET_PRACTITIONERS            = "GetPractitioners";

        public static final String GET_SCHEDULE                 = "GetSchedule";

        public static final String GET_SCHEDULING_LOCATIONS     = "GetSchedulingLocations";
        public static final String GET_RESOURCES                = "GetResources";
        public static final String GET_SCHEDULING_DEPARTMENTS   = "GetSchedulingDepartments";

    }

    public final static class AppointmentStatus {
        public static final String ACKNOWLEDGE  = "A";
        public static final String BUMPED       = "B";
        public static final String CONFIRMED    = "C";
        public static final String CANCELED     = "X";
        public static final String NO_SHOW      = "N";
        public static final String WAIT_LISTED  = "W";
        public static final String SCHEDULED    = "S";
    }


    /** Opposite of {@link #FAILURE}.  */
    public static final boolean SUCCESS = true;
    /** Opposite of {@link #SUCCESS}.  */
    public static final boolean FAILURE = false;


    public static final String EMPTY_STRING     = "";
    public static final String SPACE            = " ";
    public static final String TAB              = "\t";
    public static final String SINGLE_QUOTE     = "'";
    public static final String PERIOD           = ".";
    public static final String DOUBLE_QUOTE     = "\"";


    // PRIVATE //
    /**
     The caller references the constants using <tt>Consts.EMPTY_STRING</tt>, and so on.
     Thus, the caller should be prevented from constructing objects of this class,
     by declaring this private constructor.
     */
    private Consts(){
        //this prevents even the native class from calling this ctor as well :
        throw new AssertionError();
    }

}