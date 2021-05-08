package com.moshecorp.universityunion.service.company;

import com.moshecorp.universityunion.model.company.Rating;

public interface RatingService {

    Rating getAverageRatingByCompanyId(Long companyId);

}
