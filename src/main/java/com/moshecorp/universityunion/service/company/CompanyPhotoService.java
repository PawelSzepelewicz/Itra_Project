package com.moshecorp.universityunion.service.company;

import com.moshecorp.universityunion.model.company.CompanyPhoto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CompanyPhotoService {

    List<CompanyPhoto> getAllByCompanyId(Long companyId);

    void sendPhotoToCloudStorage(MultipartFile file, Long companyId);

}
