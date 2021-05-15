package com.moshecorp.universityunion.service.company.impl;

import com.moshecorp.universityunion.model.company.CompanyTags;
import com.moshecorp.universityunion.repository.company.CompaniesTagsRepository;
import com.moshecorp.universityunion.service.company.CompaniesTagsService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompaniesTagsServiceImpl implements CompaniesTagsService {

    CompaniesTagsRepository companiesTagsRepository;

    @Override
    public List<Long> getCompanyIdById(Long id) {
        return companiesTagsRepository.getCompanyIdById(id);
    }

    @Override
    public void saveCompanyTagsList(List<CompanyTags> companyTagsList) { //utw
        companiesTagsRepository.saveAll(companyTagsList);
    }
}
