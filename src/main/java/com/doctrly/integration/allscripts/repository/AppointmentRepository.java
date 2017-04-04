package com.doctrly.integration.allscripts.repository;

import com.doctrly.integration.allscripts.entity.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.math.BigInteger;
import java.sql.Timestamp;

public interface AppointmentRepository extends JpaRepository<AppointmentEntity, BigInteger> {

    AppointmentEntity findById(BigInteger id);

    AppointmentEntity findBySourceId(String sourceID);


    AppointmentEntity findAppointmentByIdAndPatientId(BigInteger id, BigInteger patientId);

    Page<AppointmentEntity> findAppointmentsByPatientId(BigInteger id, Pageable pageable);

    Page<AppointmentEntity> findAppointmentsByProviderId(BigInteger id, Pageable pageable);


    Page<AppointmentEntity> findByDeletedAtBetween(
            @Param("start") Timestamp start,
            @Param("end") Timestamp end,
            Pageable pageable
    );


}
