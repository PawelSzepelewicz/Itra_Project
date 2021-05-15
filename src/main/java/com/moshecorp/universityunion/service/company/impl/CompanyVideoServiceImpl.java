package com.moshecorp.universityunion.service.company.impl;

import com.moshecorp.universityunion.model.company.CompanyVideo;
import com.moshecorp.universityunion.repository.company.CompanyVideoRepository;
import com.moshecorp.universityunion.service.company.CompanyVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyVideoServiceImpl implements CompanyVideoService {

    @Autowired
    CompanyVideoRepository companyVideoRepository;

    @Override
    public void saveNewCompanyVideo(CompanyVideo companyVideo) { //utw
        companyVideoRepository.save(companyVideo);
    }
}
