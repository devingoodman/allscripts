package com.doctrly.integration.allscripts.service;

import com.doctrly.integration.allscripts.pojo.*;
import com.doctrly.integration.allscripts.resource.ExtendableBean;
import com.doctrly.integration.allscripts.util.Consts;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Optional;


@Slf4j
@Service
public class UnityService {

    Integer INDEX = 0;

    private RestTemplate restTemplate;
    private HttpHeaders headers;


    @PostConstruct
    public void initIt() throws Exception {
        restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
    }

    @PreDestroy
    public void cleanUp() throws Exception {
    }


    //TODO, verify if Error property exits in order to avoid code crashing
    //TODO, verify if Error property exits in get token retire token

    public List<Getschedulingdepartmentsinfo> getDepartments() {

        String token = getSecurityToken();
        UnityRequest unityRequest = new UnityRequest();
        unityRequest.setAppname(Consts.Config.APP_NAME);
        unityRequest.setAppUserID(Consts.Config.PM_USERNAME);
        unityRequest.setAction(Consts.Action.GET_SCHEDULING_DEPARTMENTS);
        unityRequest.setToken(token);

        List<DepartmentPOJO> departmentsList = null;
        try {
            HttpEntity<UnityRequest> request = new HttpEntity<>(unityRequest, headers);
            ResponseEntity<List<DepartmentPOJO>> response =
                    restTemplate.exchange(
                            Consts.Config.MAGIC_URL, HttpMethod.POST,
                            request, new ParameterizedTypeReference<List<DepartmentPOJO>>() {});

            HttpStatus statusCode = response.getStatusCode();
            log.info("\tstatus code: {}", statusCode);

            if (statusCode.equals(HttpStatus.OK)) {
                departmentsList = response.getBody();
                String error = (String) departmentsList.get(INDEX).getAdditionalProperties().get("Error");
                if (error != null) {
                    log.info("\tservice error: {}", error);
                    return null;
                } else {
                    log.info("\tservice result: Departments({})", departmentsList.get(INDEX).getGetschedulingdepartmentsinfo().size());
                }
            } else {
                log.info("\tresponse error: {}", response.getBody());
                return null;
            }
        } catch (Exception e) {
            log.info("\texception: {}", e.getMessage());
            e.printStackTrace();
            return null;
        } finally {
            if (token != null) forgetSecurityToken(token);
        }

        return departmentsList.get(INDEX).getGetschedulingdepartmentsinfo();
    }


    public List<Getschedulinglocationsinfo> getLocations(String departmentParam) {

        Optional<String> department = Optional.ofNullable(departmentParam);

        String token = getSecurityToken();
        UnityRequest unityRequest = new UnityRequest();
        unityRequest.setAppname(Consts.Config.APP_NAME);
        unityRequest.setAppUserID(Consts.Config.PM_USERNAME);
        unityRequest.setAction(Consts.Action.GET_SCHEDULING_LOCATIONS);
        unityRequest.setAction(Consts.Action.GET_SCHEDULING_LOCATIONS);
        unityRequest.setToken(token);
        unityRequest.setParameter2(department.orElse(""));

        List<LocationPOJO> locationsList = null;
        try {
            HttpEntity<UnityRequest> request = new HttpEntity<>(unityRequest, headers);
            ResponseEntity<List<LocationPOJO>> response =
                    restTemplate.exchange(
                            Consts.Config.MAGIC_URL, HttpMethod.POST,
                            request, new ParameterizedTypeReference<List<LocationPOJO>>() {});

            HttpStatus statusCode = response.getStatusCode();
            log.info("\tstatus code: {}", statusCode);

            if (statusCode.equals(HttpStatus.OK)) {
                locationsList = response.getBody();
                String error = (String) locationsList.get(INDEX).getAdditionalProperties().get("Error");
                if (error != null) {
                    log.info("\tservice error: {}", error);
                    return null;
                } else {
                    log.info("\tservice result: Locations({})", locationsList.get(INDEX).getGetschedulinglocationsinfo().size());
                }
            } else {
                log.info("\tresponse error: {}", response.getBody());
                return null;
            }
        } catch (Exception e) {
            log.info("\texception: {}", e.getMessage());
            e.printStackTrace();
            return null;
        } finally {
            if (token != null) forgetSecurityToken(token);
        }

        return locationsList.get(INDEX).getGetschedulinglocationsinfo();
    }


    public List<Getpractitionersinfo> getPractitioners() {

        String token = getSecurityToken();
        UnityRequest unityRequest = new UnityRequest();
        unityRequest.setAppname(Consts.Config.APP_NAME);
        unityRequest.setAppUserID(Consts.Config.PM_USERNAME);
        unityRequest.setAction(Consts.Action.GET_PRACTITIONERS);
        unityRequest.setToken(token);

        List<PractitionerPOJO> practitionerList = null;
        try {
            HttpEntity<UnityRequest> request = new HttpEntity<>(unityRequest, headers);
            ResponseEntity<List<PractitionerPOJO>> response =
                    restTemplate.exchange(
                            Consts.Config.MAGIC_URL, HttpMethod.POST,
                            request, new ParameterizedTypeReference<List<PractitionerPOJO>>() {
                            });

            HttpStatus statusCode = response.getStatusCode();
            log.info("\tstatus code: {}", statusCode);

            if (statusCode.equals(HttpStatus.OK)) {
                practitionerList = response.getBody();
                String error = (String) practitionerList.get(INDEX).getAdditionalProperties().get("Error");
                if (error != null) {
                    log.info("\tservice error: {}", error);
                    return null;
                } else {
                    log.info("\tservice result: Practitioners({})", practitionerList.get(INDEX).getGetpractitionersinfo().size());
                }
            } else {
                log.info("\tresponse error: {}", response.getBody());
                return null;
            }
        } catch (Exception e) {
            log.info("\texception: {}", e.getMessage());
            e.printStackTrace();
            return null;
        } finally {
            if (token != null) forgetSecurityToken(token);
        }

        return practitionerList.get(INDEX).getGetpractitionersinfo();
    }


    public List<Getresourcesinfo> getResources() {

        String token = getSecurityToken();
        UnityRequest unityRequest = new UnityRequest();
        unityRequest.setAppname(Consts.Config.APP_NAME);
        unityRequest.setAppUserID(Consts.Config.PM_USERNAME);
        unityRequest.setAction(Consts.Action.GET_RESOURCES);
        unityRequest.setToken(token);

        List<ResourcePOJO> resourcesList = null;
        try {
            HttpEntity<UnityRequest> request = new HttpEntity<>(unityRequest, headers);
            ResponseEntity<List<ResourcePOJO>> response =
                    restTemplate.exchange(
                            Consts.Config.MAGIC_URL, HttpMethod.POST,
                            request, new ParameterizedTypeReference<List<ResourcePOJO>>() {
                            });

            HttpStatus statusCode = response.getStatusCode();
            log.info("\tstatus code: {}", statusCode);

            if (statusCode.equals(HttpStatus.OK)) {
                resourcesList = response.getBody();
                String error = (String) resourcesList.get(INDEX).getAdditionalProperties().get("Error");
                if (error != null) {
                    log.info("\tservice error: {}", error);
                    return null;
                } else {
                    log.info("\tservice result: Resources({})", resourcesList.get(INDEX).getGetresourcesinfo().size());
                }
            } else {
                log.info("\tresponse error: {}", response.getBody());
                return null;
            }
        } catch (Exception e) {
            log.info("\texception: {}", e.getMessage());
            e.printStackTrace();
            return null;
        } finally {
            if (token != null) forgetSecurityToken(token);
        }

        return resourcesList.get(INDEX).getGetresourcesinfo();
    }


    public List<Getappointmentsbychangedttminfo> getAppointmentsChanged(
            String startDate, String endDate, String lastPulled) {

        Optional<String> optStartDate = Optional.ofNullable(startDate);
        Optional<String> optEndDate = Optional.ofNullable(endDate);
        Optional<String> optLastPulled = Optional.ofNullable(lastPulled);

        String token = getSecurityToken();
        UnityRequest unityRequest = new UnityRequest();
        unityRequest.setAppname(Consts.Config.APP_NAME);
        unityRequest.setAppUserID(Consts.Config.PM_USERNAME);
        unityRequest.setAction(Consts.Action.GET_APPOINTMENTS_CHANGED);
        unityRequest.setToken(token);
        unityRequest.setParameter1(optStartDate.orElse(""));
        unityRequest.setParameter2(optEndDate.orElse(""));
        unityRequest.setParameter3(optLastPulled.orElse(""));

        List<AppointmentsChangedPOJO> apptList = null;
        try {
            HttpEntity<UnityRequest> request = new HttpEntity<>(unityRequest, headers);
            ResponseEntity<List<AppointmentsChangedPOJO>> response =
                    restTemplate.exchange(
                            Consts.Config.MAGIC_URL, HttpMethod.POST,
                            request, new ParameterizedTypeReference<List<AppointmentsChangedPOJO>>() {
                            });

            HttpStatus statusCode = response.getStatusCode();
            log.info("\tstatus code: {}", statusCode);

            if (statusCode.equals(HttpStatus.OK)) {
                apptList = response.getBody();
                String error = (String) apptList.get(INDEX).getAdditionalProperties().get("Error");
                if (error != null) {
                    log.info("\tservice error: {}", error);
                    return null;
                } else {
                    log.info("\tservice result: AppointmentsChanged({})", apptList.get(INDEX).getGetappointmentsbychangedttminfo().size());
                }
            } else {
                log.info("\tresponse error: {}", response.getBody());
                return null;
            }
        } catch (Exception e) {
            log.info("\texception: {}", e.getMessage());
            e.printStackTrace();
            return null;
        } finally {
            if (token != null) forgetSecurityToken(token);
        }

        return apptList.get(INDEX).getGetappointmentsbychangedttminfo();
    }


    public List<Getpatientdemographicsinfo> getPatients(String patientId) {

        String token = getSecurityToken();
        UnityRequest unityRequest = new UnityRequest();
        unityRequest.setAppname(Consts.Config.APP_NAME);
        unityRequest.setAppUserID(Consts.Config.PM_USERNAME);
        unityRequest.setAction(Consts.Action.GET_PATIENT_DEMOGRAPHICS);
        unityRequest.setToken(token);
        unityRequest.setPatientID(patientId);

        List<PatientPOJO> patientList = null;
        try {
            HttpEntity<UnityRequest> request = new HttpEntity<>(unityRequest, headers);
            ResponseEntity<List<PatientPOJO>> response =
                    restTemplate.exchange(
                            Consts.Config.MAGIC_URL, HttpMethod.POST,
                            request, new ParameterizedTypeReference<List<PatientPOJO>>() {});

            HttpStatus statusCode = response.getStatusCode();
            log.info("\tstatus code: {}", statusCode);

            if (statusCode.equals(HttpStatus.OK)) {
                patientList = response.getBody();
                String error = (String) patientList.get(INDEX).getAdditionalProperties().get("Error");
                if (error != null) {
                    log.info("\tservice error: {}", error);
                    return null;
                }
                else {
                    log.info("\tservice result: PatientID({})",
                            patientList.get(INDEX).getGetpatientdemographicsinfo().get(INDEX).getPatientID());
                }
            }
            else {
                log.info("\tresponse error: {}", response.getBody());
                return null;
            }
        }
        catch (Exception e) {
            log.info("\texception: {}", e.getMessage());
            e.printStackTrace();
            return null;
        }
        finally {
            if (token != null) forgetSecurityToken(token);
        }

        return patientList.get(INDEX).getGetpatientdemographicsinfo();
    }


    public List<Setappointmentstatusinfo> saveApptStatus() {

        String token = getSecurityToken();
        UnityRequest unityRequest = new UnityRequest();
        unityRequest.setAppname(Consts.Config.APP_NAME);
        unityRequest.setAppUserID(Consts.Config.PM_USERNAME);
        unityRequest.setAction(Consts.Action.SET_APPOINTMENT_STATUS);
        unityRequest.setToken(token);

        //unityRequest.setPatientID("");        // Patient ID
        unityRequest.setParameter1("9915");     // Appointment ID
        unityRequest.setParameter2(Consts.AppointmentStatus.CONFIRMED); // New Appointment Status
        //unityRequest.setParameter3("0102");     // Update date
        unityRequest.setParameter4("1248");     // Update time
        // Optional
        unityRequest.setParameter5("");         // Confirmation reason ID
        unityRequest.setParameter6("");         // Cancellation reason ID


        List<AppointmentStatusPOJO> apptStatusList = null;
        try {
            HttpEntity<UnityRequest> request = new HttpEntity<>(unityRequest, headers);
            ResponseEntity<List<AppointmentStatusPOJO>> response =
                    restTemplate.exchange(
                            Consts.Config.MAGIC_URL, HttpMethod.POST,
                            request, new ParameterizedTypeReference<List<AppointmentStatusPOJO>>() {
                            });

            HttpStatus statusCode = response.getStatusCode();
            log.info("\tstatus code: {}", statusCode);

            if (statusCode.equals(HttpStatus.OK)) {
                apptStatusList = response.getBody();
                String error = (String) apptStatusList.get(INDEX).getAdditionalProperties().get("Error");
                if (error != null) {
                    log.info("\tservice error: {}", error);
                    return null;
                } else {
                    log.info("\tservice result: Status({})" +
                            apptStatusList.get(INDEX).getSetappointmentstatusinfo().get(INDEX).getStatus());
                }
            } else {
                log.info("\tresponse error: {}", response.getBody());
                return null;
            }
        } catch (Exception e) {
            log.info("\texception: {}", e.getMessage());
            e.printStackTrace();
            return null;
        } finally {
            if (token != null) forgetSecurityToken(token);
        }

        return apptStatusList.get(INDEX).getSetappointmentstatusinfo();
    }


    public List<Savepatientnoteinfo> savePatientNote() {

        String token = getSecurityToken();
        UnityRequest unityRequest = new UnityRequest();
        unityRequest.setAppname(Consts.Config.APP_NAME);
        unityRequest.setAppUserID(Consts.Config.PM_USERNAME);
        unityRequest.setAction(Consts.Action.SAVE_PATIENT_NOTE);
        unityRequest.setToken(token);
        unityRequest.setPatientID("33759");        // Patient ID

        List<PatientNotePJO> patientNoteList = null;
        try {
            PatientNoteXML note = new PatientNoteXML();
            note.setText("Test Note");
            note.setSubject("Patient has been notified");
            note.setNoteTypeID(1L);
            note.setExpDate("0102");
            ObjectMapper xmlMapper = new XmlMapper();
            String xmlPayload = xmlMapper.writeValueAsString(note);
            log.info("\txmlPayload : " + xmlPayload);

            unityRequest.setParameter1(xmlPayload);     // Note content
            //unityRequest.setParameter2("");           // 	Note ID	Required if performing an edit

            HttpEntity<UnityRequest> request = new HttpEntity<>(unityRequest, headers);
            ResponseEntity<List<PatientNotePJO>> response =
                    restTemplate.exchange(
                            Consts.Config.MAGIC_URL, HttpMethod.POST,
                            request, new ParameterizedTypeReference<List<PatientNotePJO>>() {
                            });

            HttpStatus statusCode = response.getStatusCode();
            log.info("\tstatus code: {}", statusCode);

            if (statusCode.equals(HttpStatus.OK)) {
                patientNoteList = response.getBody();
                String error = (String) patientNoteList.get(INDEX).getAdditionalProperties().get("Error");
                if (error != null) {
                    log.info("\tservice error {}: ", error);
                    return null;
                } else {
                    log.info("\tservice result: NoteID({})",
                            patientNoteList.get(INDEX).getSavepatientnoteinfo().get(INDEX).getNoteID());
                }
            } else {
                log.info("\tresponse error: {}", response.getBody());
                return null;
            }
        } catch (Exception e) {
            log.info("\texception: {}", e.getMessage());
            e.printStackTrace();
            return null;
        } finally {
            if (token != null) forgetSecurityToken(token);
        }

        return patientNoteList.get(INDEX).getSavepatientnoteinfo();
    }


    public List<Getscheduleinfo> getAppointments() {

        String token = getSecurityToken();
        UnityRequest unityRequest = new UnityRequest();
        unityRequest.setAppname(Consts.Config.APP_NAME);
        unityRequest.setAppUserID(Consts.Config.PM_USERNAME);
        unityRequest.setAction(Consts.Action.GET_SCHEDULE);
        unityRequest.setToken(token);
        unityRequest.setParameter1("1/01/2016|12/30/2016");
        unityRequest.setParameter4("All");

        List<AppointmentPOJO> apptList = null;
        try {
            HttpEntity<UnityRequest> request = new HttpEntity<>(unityRequest, headers);
            ResponseEntity<List<AppointmentPOJO>> response =
                    restTemplate.exchange(
                            Consts.Config.MAGIC_URL, HttpMethod.POST,
                            request, new ParameterizedTypeReference<List<AppointmentPOJO>>() {
                            });

            HttpStatus statusCode = response.getStatusCode();
            log.info("\tstatus code: {}", statusCode);

            if (statusCode.equals(HttpStatus.OK)) {
                apptList = response.getBody();
                String error = (String) apptList.get(INDEX).getAdditionalProperties().get("Error");
                if (error != null) {
                    log.info("\tservice error: {}", error);
                    return null;
                } else {
                    log.info("\tservice result: Appointments({})",
                            apptList.get(INDEX).getGetscheduleinfo().size());
                }
            } else {
                log.info("\tresponse error: {}", response.getBody());
                return null;
            }
        } catch (Exception e) {
            log.info("\texception: {}", e.getMessage());
            e.printStackTrace();
            return null;
        } finally {
            if (token != null) forgetSecurityToken(token);
        }

        return apptList.get(INDEX).getGetscheduleinfo();
    }


    private String getSecurityToken() {

        ExtendableBean unityRequest = new ExtendableBean();
        unityRequest.getProperties().put("Username", Consts.Config.USERNAME);
        unityRequest.getProperties().put("Password", Consts.Config.PASSWORD);

        String token = null;
        try {
            HttpEntity<ExtendableBean> request = new HttpEntity<>(unityRequest, headers);
            ResponseEntity<String> response =
                    restTemplate.exchange(
                            Consts.Config.GET_TOKEN_URL, HttpMethod.POST,
                            request, String.class);

            HttpStatus statusCode = response.getStatusCode();

            if (statusCode.equals(HttpStatus.OK)) {
                token = response.getBody().trim();
                log.info("\ttoken: {}", token);
            } else {
                log.info("\terror: {}", response.getBody());
                return null;
            }
        } catch (Exception e) {
            log.info("\texception: {}", e.getMessage());
            e.printStackTrace();
            return null;
        }

        return token;
    }


    private String forgetSecurityToken(String token) {

        ExtendableBean unityRequest = new ExtendableBean();
        unityRequest.getProperties().put("Token", token);
        unityRequest.getProperties().put("Appname", Consts.Config.APP_NAME);

        try {
            HttpEntity<ExtendableBean> request = new HttpEntity<>(unityRequest, headers);
            ResponseEntity<String> response =
                    restTemplate.exchange(
                            Consts.Config.RETIRE_TOKEN_URL, HttpMethod.POST,
                            request, String.class);

            HttpStatus statusCode = response.getStatusCode();

            if (statusCode.equals(HttpStatus.OK)) {
                log.info("\ttoken released");
            } else {
                log.info("\terror: {}", response.getBody());
                return null;
            }
        } catch (Exception e) {
            log.info("\texception: {}", e.getMessage());
            e.printStackTrace();
            return null;
        }

        return token;
    }


    /*
    HttpHeaders responseHeaders = response.getHeaders();
    MediaType contentType = responseHeaders.getContentType();
    Long contentLength = responseHeaders.getContentLength();
    Long responseDate = responseHeaders.getDate();
    log.debug("contentType\t:" + contentType);
    log.debug("contentLength\t:" + contentLength);
    log.debug("responseDate\t:" + responseDate);
    */

}
