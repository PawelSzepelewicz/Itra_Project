package com.moshecorp.universityunion.service;

import com.moshecorp.universityunion.model.company.CompanyTags;

import java.util.List;

public interface CompaniesTagsService {

    List<CompanyTags> getAllByCompanyId(Long companyId);

    void deleteCompanyTag(Long id);

    void setNewCompanyTag(String tag);


}
