package com.moshecorp.universityunion.service.company.impl;

import com.moshecorp.universityunion.model.company.Company;
import com.moshecorp.universityunion.model.company.Payments;
import com.moshecorp.universityunion.repository.company.PaymentsRepository;
import com.moshecorp.universityunion.service.company.BonusOfferService;
import com.moshecorp.universityunion.service.company.CompanyService;
import com.moshecorp.universityunion.service.company.PaymentService;
import com.moshecorp.universityunion.service.user.UserBonusesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentsRepository paymentsRepository;
    @Autowired
    CompanyService companyService;
    @Autowired
    UserBonusesService userBonusesService;



    @Override
    public void donate(Payments payment) {  //utw
        Timestamp ts = Timestamp.from(Instant.now());
        payment.setPaymentDatetime(ts);
        paymentsRepository.save(payment);
        Company company = companyService.getById(payment.getCompanyId());
        company.setCurrentSum(company.getCurrentSum() + payment.getPaymentSum());
        userBonusesService.setUserBonusesToDbByPayment(payment);
    }

}
