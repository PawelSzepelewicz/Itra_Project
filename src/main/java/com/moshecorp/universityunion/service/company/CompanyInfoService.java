package com.moshecorp.universityunion.service.company;

import com.moshecorp.universityunion.model.company.CompanyInfo;
import org.springframework.stereotype.Service;

@Service
public interface CompanyInfoService {

     CompanyInfo getByCompanyId(Long companyId);

}
