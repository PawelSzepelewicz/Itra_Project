package com.moshecorp.universityunion.model.company;

import com.moshecorp.universityunion.model.abstarct.AbstractEntity;
import com.moshecorp.universityunion.model.comments.Comments;
import com.moshecorp.universityunion.model.comments.Likes;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class CompanyInfo extends AbstractEntity {

    Company company;
    List<CompanyPhoto> companyPhoto;
    List<CompanyVideo> companyVideo;
    List<CompanyTags> companyTags;
    Map<Comments, Integer> commentsAndLikes;
    Likes likes;
    Rating rating;
    List<News> news;
    List<BonusOffer> bonusOffers;

}
