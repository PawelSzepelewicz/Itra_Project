package com.moshecorp.universityunion.service.impl;

import com.moshecorp.universityunion.model.company.CompanyVideo;
import com.moshecorp.universityunion.repository.company.CompanyVideoRepository;
import com.moshecorp.universityunion.service.CompanyVideoService;

import java.util.List;

public class CompanyVideoServiceImpl implements CompanyVideoService {

    CompanyVideoRepository companyVideoRepository;

    @Override
    public List<CompanyVideo> getAllByCompanyId(Long companyId) {
        return companyVideoRepository.getAllByCompanyId(companyId);
    }

    @Override
    public CompanyVideo getById(Long id){
       return companyVideoRepository.getById(id);
    }
}
