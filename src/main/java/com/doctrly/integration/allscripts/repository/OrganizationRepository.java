package com.doctrly.integration.allscripts.repository;

import com.doctrly.integration.allscripts.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface OrganizationRepository extends JpaRepository<OrganizationEntity, BigInteger> {

    OrganizationEntity findById(BigInteger id);

}



