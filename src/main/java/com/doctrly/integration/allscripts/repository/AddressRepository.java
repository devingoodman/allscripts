package com.doctrly.integration.allscripts.repository;

import com.doctrly.integration.allscripts.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface AddressRepository extends JpaRepository<AddressEntity, BigInteger> {

    AddressEntity findById(BigInteger id);

}
