package com.doctrly.integration.allscripts.repository;

import com.doctrly.integration.allscripts.entity.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface DiagnosisRepository extends JpaRepository<DiagnosisEntity, BigInteger> {

    DiagnosisEntity findById(BigInteger id);

    DiagnosisEntity findDiagnosisByIdAndEncounterId(BigInteger id, BigInteger encounterId);

    Page<DiagnosisEntity> findDiagnosisByEncounterId(BigInteger id, Pageable pageable);

}
