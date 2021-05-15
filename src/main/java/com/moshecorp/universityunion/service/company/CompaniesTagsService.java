package com.moshecorp.universityunion.service.company;

import com.moshecorp.universityunion.model.company.CompanyTags;

import java.util.List;

public interface CompaniesTagsService {

    List<Long> getCompanyIdById(Long id);

    void saveCompanyTagsList(List<CompanyTags> companyTagsList); //utw

}
