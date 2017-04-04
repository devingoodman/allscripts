package com.doctrly.integration.allscripts.repository;

import com.doctrly.integration.allscripts.entity.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface GroupRepository extends JpaRepository<GroupEntity, BigInteger> {

    GroupEntity findById(BigInteger id);

    GroupEntity findBySourceId(String id);

    Page<GroupEntity> findGroupsByOrganizationId(BigInteger id, Pageable pageable);

}
