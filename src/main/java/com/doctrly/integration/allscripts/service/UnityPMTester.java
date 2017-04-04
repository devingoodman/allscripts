package com.doctrly.integration.allscripts.service;

import com.google.gson.*;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
//import org.jsonschema2pojo.*;
//import org.jsonschema2pojo.rules.RuleFactory;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;


public class UnityPMTester {

    static String svcUsername   = "Doctr-233b-CCPM-test";
    static String svcPassword   = "D!4TrlY5c-p4T%sTdpP%8B6%";
    static String appname       = "Doctrly.CC-PM.TestApp";

    /*
    static String svcUsername   = "Doctr-3616-CCPEHR-test";
    static String svcPassword   = "D!1TrlYbc-p5Hrt%stappFd3%6";
    static String appname       = "Doctrly.CC-PEHR.TestApp";
    */

    /*
    static String svcUsername   = "Doctr-07ac-CCSEHR-test";
    static String svcPassword   = "D!9TrlY0c-s4Hrt%st0pp4c0@4";
    static String appname       = "Doctrly.CC-SEHR.TestApp";
    */

    /*
    static String svcUsername   = "Doctr-f0ba-CCTEHR-test";
    static String svcPassword   = "D!2TrlYcc-taHrt%stbpp%087c";
    static String appname       = "Doctrly.CC-TEHR.TestApp";
    */

    /*
    static String svcUsername   = "Sl3utH";
    static String svcPassword   = "5aNdB0xSl3utH";
    static String appname       = "Sleuth";
    */

    static String pmUsername    = "demo1";
    static String URL           = "http://pmga.unitysandbox.com";
    //static String URL           = "http://localhost:8888";
    static String Token         = "";

    //http://pmga.unitysandbox.com
    //http://pmdev.unitysandbox.com


    HttpPost method = null;
    HttpEntity entity = null;
    HttpClient client = null;
    HttpResponse resp = null;

    public static void callService() {
        try {
            UnityPMTester unity = new UnityPMTester();

			/* GetSecurityToken */
            Token = unity.getToken();

            if (Token.startsWith("error:") || Token.startsWith("Error:")) {
                System.out.println("Error getting security token (" + Token + "). " +
                        "Giving up.");
                System.exit(-1);
            }

            System.out.println("Using Unity security token: " + Token);

			/* Magic: GetServerInfo action */
			/*
            String serverInfo =
                    unity.Magic(
                            "GetServerInfo", pmUsername, appname, "", Token,
                            "", "", "", "", "", "", null);

            System.out.println("\nRaw response from GetServerInfo:");
            unity.displayJson(serverInfo);
            */

			/* prompt for patient ID, call GetPatientDiagnostics */
            String searchId = "33283";

            /* patient ID goes in Magic action's PatientID field; other fields unused for this example */
            String getPatient =
                    unity.Magic(
                            "GetSchedule", pmUsername, appname, searchId, Token,
                            "1/01/2016|12/30/2016", "", "", "All", "", "", null);
            System.out.println("\nRaw response from GetPatientDemographics:");
            unity.displayJson(getPatient);

            /*
            final GenerationConfig config = new DefaultGenerationConfig() {

                @Override
                public String getTargetVersion() {return "1.8";}

                @Override
                public SourceType getSourceType() {return SourceType.JSON;}

                @Override
                public AnnotationStyle getAnnotationStyle() {return AnnotationStyle.JACKSON2;}

                @Override
                public String getOutputEncoding() {return "UTF-8";}

                @Override
                public boolean isIncludeHashcodeAndEquals() {return false;}

                @Override
                public boolean isIncludeToString() {return true;}

                @Override
                public boolean isUsePrimitives() {return false;}

                @Override
                public boolean isGenerateBuilders() {return false;}

                @Override
                public boolean isIncludeAdditionalProperties() {return true;}

                @Override
                public boolean isIncludeAccessors() {return true;}

                @Override
                public boolean isIncludeDynamicAccessors() {return false;}

                @Override
                public boolean isIncludeConstructors() {return false;}

                @Override
                public boolean isConstructorsRequiredPropertiesOnly() {return false;}


                @Override
                public Class<? extends Annotator> getCustomAnnotator() {
                    return NoopAnnotator.class;
                }

            };

            final JCodeModel codeModel = new JCodeModel();
            final RuleFactory ruleFactory = new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore());
            final SchemaMapper mapper = new SchemaMapper(ruleFactory, new SchemaGenerator());

            mapper.generate(codeModel, "AppointmentPOJO","com.it", getPatient);
            codeModel.build(new File("d:/files"));
            */

			/* clean up (ignoring probably empty return string) */
            //unity.forgetToken();

        } catch (Exception drat) {
            drat.printStackTrace();
        }
    }

    /* build Json string for Magic action, send to Unity endpoint, receive Json output */
    public String Magic(String action, String appuser, String appname,
                        String patientid, String token, String param1, String param2,
                        String param3, String param4, String param5, String param6,
                        byte[] data) throws Exception {
        /* build the Json string */
        Gson gson = new Gson();

        JsonObject jo = new JsonObject();
        jo.addProperty("Action", action);
        jo.addProperty("Appname", appname);
        jo.addProperty("AppUserID", appuser);
        jo.addProperty("PatientID", patientid);
        jo.addProperty("Token", token);
        jo.addProperty("Parameter1", param1);
        jo.addProperty("Parameter2", param2);
        jo.addProperty("Parameter3", param3);
        jo.addProperty("Parameter4", param4);
        jo.addProperty("Parameter5", param5);
        jo.addProperty("Parameter6", param6);
        jo.addProperty("Data", gson.toJson(data));

        String requestBody = jo.toString();
        System.out.println("request: " + requestBody);

		/* send Json to Unity endpoint */
        client = HttpClientBuilder.create().build();

        try {
            method = new HttpPost(new URI(URL + "/UnityPM/unityservice.svc/json/MagicJson"));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        StringEntity stringEntity = new StringEntity(requestBody, ContentType.APPLICATION_JSON);
        method.setEntity(stringEntity);
        HttpResponse response = client.execute(method);

        InputStream content = response.getEntity().getContent();
        String Json = getStringFromStream(content);

        return Json;
    }

    /* get the Unity security token on startup */
    private String getToken() throws Exception {
		/* build {"Username":"un", "Password":"pw"} string */
        JsonObject jo = new JsonObject();
        jo.addProperty("Username", svcUsername);
        jo.addProperty("Password", svcPassword);
        String reqBody = jo.toString();

        client = HttpClientBuilder.create().build();

        try {
            method = new HttpPost(new URI(URL + "/UnityPM/unityservice.svc/json/GetToken"));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        StringEntity stringEntity = new StringEntity(reqBody, ContentType.APPLICATION_JSON);
        method.setEntity(stringEntity);
        HttpResponse response = client.execute(method);

        InputStream content = response.getEntity().getContent();
        String token = getStringFromStream(content);
        return token;
    }

    /* retire the Unity security token */
    private String forgetToken() throws Exception {
        JsonObject jo = new JsonObject();
        jo.addProperty("Token", Token);
        jo.addProperty("Appname", appname);

        String reqBody = jo.toString();

        client = HttpClientBuilder.create().build();

        try {
            method = new HttpPost(new URI(URL + "/UnityPM/unityservice.svc/json/RetireToken"));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        StringEntity stringEntity = new StringEntity(reqBody, ContentType.APPLICATION_JSON);
        method.setEntity(stringEntity);
        HttpResponse response = client.execute(method);

        InputStream content = response.getEntity().getContent();
        String msg = getStringFromStream(content);
        return msg;
    }

    public String getStringFromStream(InputStream in) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String rData = null;

        try {
            int read;
            byte[] next = new byte[256];
            while ((read = in.read(next)) != -1) {
                out.write(next, 0, read);
            }

            byte[] byteArray = out.toByteArray();
            //rData = new String(byteArray, Charset.forName("UTF-8"));
            rData = new String(byteArray);

        } catch (Exception ex) {
            System.out.println("Exception occurred while reading stream: " + ex);
        }
        return rData;
    }

    /* for this example, just print the Json; in practice, process it */
    public void displayJson(String Json) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        JsonParser jp = new JsonParser();
        JsonElement parse = jp.parse(Json);

        JsonArray asJsonArray = parse.getAsJsonArray();

        for (JsonElement jse : asJsonArray) {
            String prettyGson = gson.toJson(jse);
            System.out.println(prettyGson);
        }
    }


}



