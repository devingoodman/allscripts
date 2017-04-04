package com.doctrly.integration.allscripts.repository;

import com.doctrly.integration.allscripts.entity.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface VitalRepository extends JpaRepository<VitalEntity, BigInteger> {

    VitalEntity findById(BigInteger id);

    Page<VitalEntity> findVitalsByEncounterId(BigInteger id, Pageable pageable);

}
