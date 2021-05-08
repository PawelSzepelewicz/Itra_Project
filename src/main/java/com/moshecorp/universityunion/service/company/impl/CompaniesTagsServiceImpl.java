package com.moshecorp.universityunion.service.company.impl;

import com.moshecorp.universityunion.model.company.CompanyTags;
import com.moshecorp.universityunion.repository.company.CompaniesTagsRepository;
import com.moshecorp.universityunion.service.company.CompaniesTagsService;

import java.util.List;

public class CompaniesTagsServiceImpl implements CompaniesTagsService {

    CompaniesTagsRepository companiesTagsRepository;

    @Override
    public List<CompanyTags> getAllByCompanyId(Long companyId) {
        return companiesTagsRepository.getAllByCompanyId(companyId);
    }

    @Override
    public void deleteCompanyTag(Long id) {

    }

    @Override
    public void setNewCompanyTag(String tag) {

    }
}
