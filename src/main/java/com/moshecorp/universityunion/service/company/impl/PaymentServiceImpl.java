package com.moshecorp.universityunion.service.company.impl;

import com.moshecorp.universityunion.model.comments.Comments;
import com.moshecorp.universityunion.model.company.Payments;
import com.moshecorp.universityunion.repository.company.PaymentsRepository;
import com.moshecorp.universityunion.service.company.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentsRepository paymentsRepository;

    @Override
    public void setPaymentToDatabase(Payments payment) {
        Timestamp ts = Timestamp.from(Instant.now());
        payment.setPaymentDatetime(ts);
        paymentsRepository.save(payment);
    }

//    @Override
//    public Payments getPaymentsById(Long id) {
//        return paymentsRepository.getById(id);
//    }
//
//    @Override
//    public Timestamp getPaymentDatetimeById(Long id) {
//        return paymentsRepository.getPaymentDatetimeById(id);
//    }
//
//    @Override
//    public Double getSumById(Long id) {
//        return paymentsRepository.getPaymentSumById(id);
//    }
}
