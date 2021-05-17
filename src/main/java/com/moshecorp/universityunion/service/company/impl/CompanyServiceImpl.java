package com.moshecorp.universityunion.service.company.impl;

import com.moshecorp.universityunion.model.AverageCompanyRating;
import com.moshecorp.universityunion.model.CompanyPreview;
import com.moshecorp.universityunion.model.company.Company;
import com.moshecorp.universityunion.repository.company.CompanyRepository;
import com.moshecorp.universityunion.repository.company.RatingRepository;
import com.moshecorp.universityunion.service.CompanyPreviewService;
import com.moshecorp.universityunion.service.company.CompanyPhotoService;
import com.moshecorp.universityunion.service.company.CompanyService;
import com.moshecorp.universityunion.utils.AverageRatingComparator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyRepository companyRepository;
    @Autowired
    RatingRepository ratingRepository;
    @Autowired
    CompanyPhotoService companyPhotoService;
    @Autowired
    CompanyPreviewService companyPreviewService;

    @Override
    public Company getById(Long id) {
        return companyRepository.getById(id);
    }

    @Override
    public List<Company> getAllByCategoryId(Long categoryId) {
        return companyRepository.getAllByCategoryId(categoryId);
    }

    @Override
    public Company saveNewCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public List<CompanyPreview> getTopFiveByRating() {
        List<Long> companyIdsList = companyRepository.getIdsList();
        List<AverageCompanyRating> acrList = new ArrayList<>();
        companyIdsList.forEach(cid -> {
            AverageCompanyRating acr = new AverageCompanyRating(cid, ratingRepository.getAverageRatingByCompanyId(cid));
            acrList.add(acr);
        });
        acrList.sort(new AverageRatingComparator());
        List<CompanyPreview> companyPreviews = new ArrayList<>();
        acrList.subList(0, Math.min(acrList.size(), 5)).forEach(acr -> {
            CompanyPreview cp = new CompanyPreview();
            Company company = companyRepository.getById(acr.getCompanyId());
            cp.setId(company.getId());
            cp.setAverageRating(acr.getAverageRating());
            cp.setTitle(company.getName());
            cp.setDescription(company.getDescription());
            cp.setPhotoUrl(companyPhotoService.getAllByCompanyId(company.getId()).get(0).getPhotoUrl());
            cp.setCurrentSum(company.getCurrentSum());
            cp.setTargetSum(company.getTargetSum());
            cp.setExpirationDate(company.getExpirationDate());
            companyPreviews.add(cp);
        });
        return companyPreviews;
    }

    @Override
    public List<CompanyPreview> getTopFiveByCreationDate() {
        List<Company> topCompanyList = companyRepository.getTopByCreationDate();
        List<CompanyPreview> companyPreviews = new ArrayList<>();
        topCompanyList.forEach(tcl -> {
            CompanyPreview cp = new CompanyPreview();
            cp.setId(tcl.getId());
            cp.setAverageRating(ratingRepository.getAverageRatingByCompanyId(tcl.getId()));
            cp.setTitle(tcl.getName());
            cp.setDescription(tcl.getDescription());
            cp.setPhotoUrl(companyPhotoService.getAllByCompanyId(tcl.getId()).get(0).getPhotoUrl());
            cp.setCurrentSum(tcl.getCurrentSum());
            cp.setTargetSum(tcl.getTargetSum());
            cp.setExpirationDate(tcl.getExpirationDate());
            companyPreviews.add(cp);
        });
        return companyPreviews;
    }

    @Override
    public List<CompanyPreview> getAllByUserId(Long userId) {
        List<Company> companyList = companyRepository.getAllByUserId(userId);
        List<CompanyPreview> companyPreviews = new ArrayList<>();
        companyList.forEach(cmp -> {
            CompanyPreview cp = companyPreviewService.getCompanyPreviewFromCompany(cmp);
            companyPreviews.add(cp);
        });
        return companyPreviews;
    }

}
