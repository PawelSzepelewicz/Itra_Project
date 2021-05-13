package com.moshecorp.universityunion.controller.company;

import com.moshecorp.universityunion.model.company.Company;
import com.moshecorp.universityunion.model.company.Payments;
import com.moshecorp.universityunion.service.company.CompanyService;
import com.moshecorp.universityunion.service.company.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/company")
@AllArgsConstructor
public class PaymentController {
    @Autowired
    private final PaymentService service;

    @PostMapping("/setPaymentToDb")
    public void setPaymentToDatabase(@RequestBody Payments payment){
        service.setPaymentToDatabase(payment);
    }
}
