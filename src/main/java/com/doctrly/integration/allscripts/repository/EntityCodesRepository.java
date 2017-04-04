package com.doctrly.integration.allscripts.repository;

import com.doctrly.integration.allscripts.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.math.BigInteger;
import java.util.List;

public interface EntityCodesRepository extends JpaRepository<EntityCodesEntity, BigInteger> {

    EntityCodesEntity findById(BigInteger id);

    List<EntityCodesEntity>
        findEntityCodesByEntityIdAndEntityTypeAndStatus(BigInteger entityId, String entityType, Byte status);

    @Modifying
    @Query(
            "UPDATE EntityCodesEntity ec SET ec.status = 0 " +
            "WHERE ec.entityId = ?1 AND ec.entityType = ?2 AND ec.status = ?3")
    int setAsDeletedFor(BigInteger entityId, String entityType, Byte status);

}
