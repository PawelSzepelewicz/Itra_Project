package com.moshecorp.universityunion.service.impl;

import com.moshecorp.universityunion.model.UiRating;
import com.moshecorp.universityunion.model.UserAndCompanyIds;
import com.moshecorp.universityunion.service.UiRatingService;
import com.moshecorp.universityunion.service.company.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UiRatingServiceImpl implements UiRatingService {

    @Autowired
    RatingService ratingService;

    @Override
    public UiRating getRating(UserAndCompanyIds ids) {  //utw
        Double averageRating = ratingService.getAverageRatingByCompanyId(ids.getCompanyId());
        boolean isRated = ratingService.getByCompanyIdAndUserId(ids.getCompanyId(), ids.getUserId()) == null;
        return new UiRating(averageRating, isRated);
    }
}
