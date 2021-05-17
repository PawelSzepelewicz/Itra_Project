package com.moshecorp.universityunion.service;

import com.moshecorp.universityunion.model.CompanyPreview;
import com.moshecorp.universityunion.model.company.Company;

public interface CompanyPreviewService {

    CompanyPreview getCompanyPreviewFromCompany(Company company);
}
