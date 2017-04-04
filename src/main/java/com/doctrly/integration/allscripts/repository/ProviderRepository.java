package com.doctrly.integration.allscripts.repository;

import com.doctrly.integration.allscripts.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

//@RepositoryRestResource(path = "provider")
public interface ProviderRepository extends JpaRepository<ProviderEntity, BigInteger> {

    ProviderEntity findById(BigInteger id);

    ProviderEntity findBySourceId(String sourceID);

    //@RestResource(path="findbyemail")
    //Iterable<ProviderEntity> findByEmailIgnoringCase(@Param("email") String email);

}




