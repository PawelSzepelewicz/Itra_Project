package com.moshecorp.universityunion.service.company.impl;

import com.moshecorp.universityunion.model.company.Rating;
import com.moshecorp.universityunion.repository.company.RatingRepository;
import com.moshecorp.universityunion.service.company.RatingService;

public class RatingServiceImpl implements RatingService {

    RatingRepository ratingRepository;

    @Override
    public Rating getAverageRatingByCompanyId(Long companyId) {
        return ratingRepository.getAverageRatingByCompanyId(companyId);
    }

}
