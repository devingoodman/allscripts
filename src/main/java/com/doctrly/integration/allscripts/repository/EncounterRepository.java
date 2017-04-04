package com.doctrly.integration.allscripts.repository;

import com.doctrly.integration.allscripts.entity.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface EncounterRepository extends JpaRepository<EncounterEntity, BigInteger> {

    EncounterEntity findById(BigInteger id);

    Page<EncounterEntity> findEncountersByPatientId(BigInteger patient_id, Pageable pageable);

}
