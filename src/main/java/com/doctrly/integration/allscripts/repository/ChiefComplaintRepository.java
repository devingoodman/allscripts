package com.doctrly.integration.allscripts.repository;

import com.doctrly.integration.allscripts.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.List;

public interface ChiefComplaintRepository extends JpaRepository<ChiefComplaintEntity, BigInteger> {

    ChiefComplaintEntity findById(BigInteger id);

    List<ChiefComplaintEntity> findChiefComplaintsByAppointmentId(BigInteger appointmentId);

}
