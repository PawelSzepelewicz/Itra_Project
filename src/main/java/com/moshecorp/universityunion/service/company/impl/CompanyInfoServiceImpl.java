package com.moshecorp.universityunion.service.company.impl;

import com.moshecorp.universityunion.model.UserAndCompanyIds;
import com.moshecorp.universityunion.model.company.CompanyInfo;
import com.moshecorp.universityunion.service.UiCommentService;
import com.moshecorp.universityunion.service.UiRatingService;
import com.moshecorp.universityunion.service.comments.CommentsService;
import com.moshecorp.universityunion.service.company.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyInfoServiceImpl implements CompanyInfoService {

    @Autowired
    CompanyService companyService;
    @Autowired
    CompanyPhotoService companyPhotoService;
    @Autowired
    CompanyVideoService companyVideoService;
    @Autowired
    CompaniesTagsService companiesTagsService;
    @Autowired
    CommentsService commentsService;
    @Autowired
    RatingService ratingService;
    @Autowired
    NewsService newsService;
    @Autowired
    BonusOfferService bonusOfferService;
    @Autowired
    UiCommentService uiCommentService;
    @Autowired
    UiRatingService uiRatingService;

    @Override
    public CompanyInfo getByIds(UserAndCompanyIds ids) {
        CompanyInfo companyInfo = new CompanyInfo();
        companyInfo.setCompany(companyService.getById(ids.getCompanyId()));
        companyInfo.setCompanyPhoto(companyPhotoService.getAllByCompanyId(ids.getCompanyId()));
        companyInfo.setCompanyVideo(companyVideoService.getByCompanyId(ids.getCompanyId()));
        companyInfo.setAverageRating(uiRatingService.getRating(ids).getAverageRating());
        companyInfo.setUiCommentsAndLikes(uiCommentService.getUiCommentsList(ids));
        companyInfo.setCompanyTags(companiesTagsService.getTagsByCompanyId(ids.getCompanyId()));


        return companyInfo;
    }

}
