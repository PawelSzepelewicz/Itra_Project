package com.moshecorp.universityunion.service.impl;

import com.moshecorp.universityunion.model.CompanyPreview;
import com.moshecorp.universityunion.model.company.Company;
import com.moshecorp.universityunion.model.company.CompanyPhoto;
import com.moshecorp.universityunion.service.CompanyPreviewService;
import com.moshecorp.universityunion.service.company.CompanyPhotoService;
import com.moshecorp.universityunion.service.company.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyPreviewServiceImpl implements CompanyPreviewService {

    @Autowired
    private RatingService ratingService;
    @Autowired
    private CompanyPhotoService companyPhotoService;

    @Override
    public CompanyPreview getCompanyPreviewFromCompany(Company company) {
        CompanyPreview cp = new CompanyPreview();
        cp.setId(company.getId());
        cp.setAverageRating(ratingService.getAverageRatingByCompanyId(company.getId()));
        cp.setTitle(company.getName());
        cp.setDescription(company.getDescription());
        List<CompanyPhoto> photoList = companyPhotoService.getAllByCompanyId(company.getId());
        String photoUrl = photoList.size() == 0 ? null: photoList.get(0).getPhotoUrl();
        cp.setPhotoUrl(photoUrl);
        cp.setCurrentSum(company.getCurrentSum());
        cp.setTargetSum(company.getTargetSum());
        cp.setExpirationDate(company.getExpirationDate());
        return cp;
    }
}
