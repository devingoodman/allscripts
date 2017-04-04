package com.doctrly.integration.allscripts.repository;

import com.doctrly.integration.allscripts.entity.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface LocationRepository extends JpaRepository<LocationEntity, BigInteger> {

    LocationEntity findById(BigInteger id);

    LocationEntity findBySourceId(String sourceID);

    Page<LocationEntity> findByGroupId(BigInteger group_id, Pageable pageable);


}
