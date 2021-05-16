package com.moshecorp.universityunion.service;

import com.moshecorp.universityunion.model.UiRating;
import com.moshecorp.universityunion.model.UserAndCompanyIds;

public interface UiRatingService {

    UiRating getRating(UserAndCompanyIds ids);  //utw
}
