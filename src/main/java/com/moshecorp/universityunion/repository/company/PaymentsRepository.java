package com.moshecorp.universityunion.repository.company;

import com.moshecorp.universityunion.model.company.Payments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Timestamp;
import java.util.List;

public interface PaymentsRepository extends JpaRepository<Payments, Long> {

    List<Payments> getAllByCompanyId(Long companyId);

    Payments getById(Long id);

    @Query(value = "select paymentDatetime from Payments where id = :id")
    Timestamp getPaymentDatetimeById(@Param("id") Long id);

    @Query(value = "select paymentSum from Payments where id = :id")
    Double getPaymentSumById(@Param("id") Long id);

}
