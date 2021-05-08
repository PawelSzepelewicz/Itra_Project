package com.moshecorp.universityunion.service.company;

import com.moshecorp.universityunion.model.company.CompanyPhoto;

import java.util.List;

public interface CompanyPhotoService {

    List<CompanyPhoto> getAllByCompanyId(Long companyId);

    void sendPhotoToCloudStorage();

}
