package com.moshecorp.universityunion.service.company.impl;

import com.moshecorp.universityunion.model.company.Rating;
import com.moshecorp.universityunion.repository.company.RatingRepository;
import com.moshecorp.universityunion.service.company.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    RatingRepository ratingRepository;

    @Override
    public Rating getAverageRatingByCompanyId(Long companyId) {
        return ratingRepository.getAverageRatingByCompanyId(companyId);
    }

}
