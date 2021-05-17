package com.moshecorp.universityunion.service.company;

import com.moshecorp.universityunion.model.UserAndCompanyIds;
import com.moshecorp.universityunion.model.company.CompanyInfo;


public interface CompanyInfoService {

  CompanyInfo getByIds(UserAndCompanyIds ids);

}
