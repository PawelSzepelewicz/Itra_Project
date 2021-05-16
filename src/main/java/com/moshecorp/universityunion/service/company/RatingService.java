package com.moshecorp.universityunion.service.company;

import com.moshecorp.universityunion.model.company.Rating;

public interface RatingService {

    Double getAverageRatingByCompanyId(Long companyId);  //utw

    Rating getByCompanyIdAndUserId(Long companyId, Long userId);  //utw

    void saveRatingToDB(Rating rating);  //utw

}
