package com.moshecorp.universityunion.service;

import com.moshecorp.universityunion.model.company.Payments;

import java.sql.Timestamp;

public interface PaymentService {

    Payments getPaymentsById(Long id);

    Timestamp getPaymentDatetimeById(Long id);

    Double getSumById(Long id);
}
