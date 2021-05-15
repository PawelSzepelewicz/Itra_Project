package com.moshecorp.universityunion.service.impl;

import com.moshecorp.universityunion.model.CompanyCreation;
import com.moshecorp.universityunion.model.company.Company;
import com.moshecorp.universityunion.service.CompanyCreationService;
import com.moshecorp.universityunion.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;

@Service
public class CompanyCreationServiceImpl implements CompanyCreationService {

    @Autowired
    CompanyService companyService;

    @Override
    public Long createCompany(CompanyCreation companyCreation) { //utw
        Company newCompany = new Company();
        newCompany.setUserId(companyCreation.getUserId());
        newCompany.setName(companyCreation.getName());
        newCompany.setCategoryId(companyCreation.getCategoryId());
        Timestamp ts = Timestamp.from(Instant.now());
        newCompany.setCreationDate(ts);
        newCompany.setExpirationDate(new Timestamp(Long.parseLong(companyCreation.getExpirationDate())));
        return companyService.saveNewCompany(newCompany).getId();
    }
}
