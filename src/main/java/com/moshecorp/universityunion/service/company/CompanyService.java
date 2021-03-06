package com.moshecorp.universityunion.service.company;

import com.moshecorp.universityunion.model.CompanyPreview;
import com.moshecorp.universityunion.model.company.Company;

import java.util.List;

public interface CompanyService {

    Company getById(Long id);

    List<Company> getAllByCategoryId(Long categoryId);

    Company saveNewCompany(Company company);  // utw

    List<CompanyPreview> getTopFiveByRating();

    List<CompanyPreview> getTopFiveByCreationDate();

    List<CompanyPreview> getAllByUserId(Long userId); //utw

    List<CompanyPreview> getCompanyListByTagId(Long tagId);

}
