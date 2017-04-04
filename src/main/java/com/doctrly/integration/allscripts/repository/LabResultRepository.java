package com.doctrly.integration.allscripts.repository;

import com.doctrly.integration.allscripts.entity.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface LabResultRepository extends JpaRepository<LabResultEntity, BigInteger> {

    LabResultEntity findById(BigInteger id);

    Page<LabResultEntity> findLabResultsByEncounterId(BigInteger id, Pageable pageable);

    Page<LabResultEntity> findLabResultsByPatientId(BigInteger id, Pageable pageable);

}
