package com.doctrly.integration.allscripts.repository;

import com.doctrly.integration.allscripts.entity.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface MedicationRepository extends JpaRepository<MedicationEntity, BigInteger> {

    MedicationEntity findById(BigInteger id);

    Page<MedicationEntity> findMedicationsByPatientId(BigInteger id, Pageable pageable);

    Page<MedicationEntity> findMedicationsByEncounterId(BigInteger id, Pageable pageable);

}
