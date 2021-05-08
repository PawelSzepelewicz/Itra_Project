package com.moshecorp.universityunion.service.company.impl;

import com.moshecorp.universityunion.model.company.Payments;
import com.moshecorp.universityunion.repository.company.PaymentsRepository;
import com.moshecorp.universityunion.service.company.PaymentService;

import java.sql.Timestamp;

public class PaymentServiceImpl implements PaymentService {

    PaymentsRepository paymentsRepository;

    @Override
    public Payments getPaymentsById(Long id) {
        return paymentsRepository.getById(id);
    }

    @Override
    public Timestamp getPaymentDatetimeById(Long id) {
        return paymentsRepository.getPaymentDatetimeById(id);
    }

    @Override
    public Double getSumById(Long id) {
        return paymentsRepository.getPaymentSumById(id);
    }
}
