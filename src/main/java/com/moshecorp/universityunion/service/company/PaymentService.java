package com.moshecorp.universityunion.service.company;

import com.moshecorp.universityunion.model.comments.Comments;
import com.moshecorp.universityunion.model.company.Payments;

import java.sql.Timestamp;

public interface PaymentService {

    void setPaymentToDatabase(Payments payment);

//    Payments getPaymentsById(Long id);
//
//    Timestamp getPaymentDatetimeById(Long id);
//
//    Double getSumById(Long id);


}
