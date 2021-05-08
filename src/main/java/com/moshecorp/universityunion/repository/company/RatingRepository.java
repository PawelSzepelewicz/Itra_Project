package com.moshecorp.universityunion.repository.company;

import com.moshecorp.universityunion.model.company.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RatingRepository extends JpaRepository<Rating, Long> {

    @Query(value = "select avg(ratingValue) from Rating where companyId = :companyId")
    Rating getAverageRatingByCompanyId(@Param("companyId") Long companyId);

}
