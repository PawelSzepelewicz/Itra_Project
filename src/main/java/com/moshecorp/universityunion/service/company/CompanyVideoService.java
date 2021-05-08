package com.moshecorp.universityunion.service.company;

import com.moshecorp.universityunion.model.company.CompanyVideo;

import java.util.List;

public interface CompanyVideoService {

    List<CompanyVideo> getAllByCompanyId(Long id);
    CompanyVideo getById(Long id);

}
