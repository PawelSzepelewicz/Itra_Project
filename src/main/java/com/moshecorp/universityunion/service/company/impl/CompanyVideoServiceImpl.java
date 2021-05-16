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
    public String getVideoByCompanyId(Long companyId) {   //utw
        return companyVideoRepository.getVideoUrlByCompanyId(companyId);
    }

    @Override
    public void saveCompanyVideo(CompanyVideo companyVideo) { //utw
        companyVideoRepository.save(companyVideo);
    }
}
