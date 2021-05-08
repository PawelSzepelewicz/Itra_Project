package com.moshecorp.universityunion.service.company.impl;

import com.moshecorp.universityunion.model.comments.Comments;
import com.moshecorp.universityunion.model.company.CompanyInfo;
import com.moshecorp.universityunion.service.comments.CommentsService;
import com.moshecorp.universityunion.service.comments.LikesService;
import com.moshecorp.universityunion.service.company.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompanyInfoServiceImpl implements CompanyInfoService {

    CompanyService companyService;
    CompanyPhotoService companyPhotoService;
    CompanyVideoService companyVideoService;
    CompaniesTagsService companiesTagsService;
    LikesService likesService;
    CommentsService commentsService;
    RatingService ratingService;
    NewsService newsService;
    BonusOfferService bonusOfferService;

    public CompanyInfo getByCompanyId(Long companyId) {
        CompanyInfo companyInfo = new CompanyInfo();
        companyInfo.setCompany(companyService.getById(companyId));
        companyInfo.setCompanyPhoto(companyPhotoService.getAllByCompanyId(companyId));
        companyInfo.setCompanyVideo(companyVideoService.getAllByCompanyId(companyId));
        companyInfo.setCompanyTags(companiesTagsService.getAllByCompanyId(companyId));
        companyInfo.setNews(newsService.getAllByCompanyId(companyId));
        companyInfo.setRating(ratingService.getAverageRatingByCompanyId(companyId));
        List<Comments> commentsList = commentsService.getByCompanyId(companyId);
        Map<Comments, Integer> commentsAndLikes = new HashMap<>();
        commentsList.forEach(comment -> {
            Integer countOfLikes= likesService.getCountOfLikesByCommentId(comment.getId());
            commentsAndLikes.put(comment, countOfLikes);
        });
        companyInfo.setBonusOffers(bonusOfferService.getAllByCompanyId(companyId));
        return companyInfo;
    }

}
