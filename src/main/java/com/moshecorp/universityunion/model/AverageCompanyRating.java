package com.moshecorp.universityunion.model;

import lombok.Data;

@Data
public class AverageCompanyRating {

    private Long companyId;
    private Double averageRating;

    public AverageCompanyRating(Long companyId, Double averageRating) {
        this.companyId = companyId;
        this.averageRating = averageRating;
    }
}
