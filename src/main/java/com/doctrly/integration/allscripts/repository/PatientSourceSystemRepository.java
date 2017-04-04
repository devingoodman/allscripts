package com.doctrly.integration.allscripts.repository;

import com.doctrly.integration.allscripts.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientSourceSystemRepository extends JpaRepository<PatientSourceSystemEntity, PatientSourceSystemEntityPK> {

    //PatientSourceSystemEntity findById(PatientSourceSystemEntityPK id);

    //PatientSourceSystemEntity findByPatientId(BigInteger patientId);

}
