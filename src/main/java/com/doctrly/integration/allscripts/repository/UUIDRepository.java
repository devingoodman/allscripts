package com.doctrly.integration.allscripts.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.math.BigInteger;


@Repository
@Transactional(readOnly = true)
public class UUIDRepository {

    @PersistenceContext
    EntityManager entityManager;


    public BigInteger generateID() {

        Query query = entityManager.createNativeQuery("SELECT UUID_SHORT() AS uuid_short");
        BigInteger id = (BigInteger) query.getSingleResult();
        return id;

    }

}