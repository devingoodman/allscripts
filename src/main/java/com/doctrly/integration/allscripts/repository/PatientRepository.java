package com.doctrly.integration.allscripts.repository;

import com.doctrly.integration.allscripts.entity.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface PatientRepository extends JpaRepository<PatientEntity, BigInteger> {

    PatientEntity findById(BigInteger id);

    PatientEntity findBySourceId(String sourceID);


    Page<PatientEntity> findByGroupId(BigInteger group_id, Pageable pageable);

    Page<PatientEntity> findByProviderId(BigInteger provider_id, Pageable pageable);

}
