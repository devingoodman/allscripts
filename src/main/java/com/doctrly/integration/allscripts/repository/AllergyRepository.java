package com.doctrly.integration.allscripts.repository;

import com.doctrly.integration.allscripts.entity.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface AllergyRepository extends JpaRepository<AllergyEntity, BigInteger> {

    AllergyEntity findById(BigInteger id);

    Page<AllergyEntity> findAllergiesByPatientId(BigInteger id, Pageable pageable);

    Page<AllergyEntity> findAllergiesByEncounterId(BigInteger id, Pageable pageable);

}
