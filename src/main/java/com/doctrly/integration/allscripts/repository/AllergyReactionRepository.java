package com.doctrly.integration.allscripts.repository;

import com.doctrly.integration.allscripts.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface AllergyReactionRepository extends JpaRepository<AllergyReactionEntity, BigInteger> {

    AllergyReactionEntity findById(BigInteger id);

}
