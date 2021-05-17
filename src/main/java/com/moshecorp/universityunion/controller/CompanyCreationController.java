package com.moshecorp.universityunion.controller;

import com.moshecorp.universityunion.model.CompanyCreation;
import com.moshecorp.universityunion.service.CompanyCreationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/company")
@AllArgsConstructor
public class CompanyCreationController {

    @Autowired
    CompanyCreationService companyCreationService;

    @PostMapping("/create")
    public Long create(@RequestBody CompanyCreation companyCreation) {  //utw
        return companyCreationService.createCompany(companyCreation);
    }
}
