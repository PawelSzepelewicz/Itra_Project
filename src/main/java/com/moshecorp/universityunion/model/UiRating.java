package com.moshecorp.universityunion.model;

import lombok.Data;

@Data
public class UiRating {

    private Double averageRating;
    private boolean isRated;

    public UiRating(Double averageRating, boolean isRated) {
        this.averageRating = averageRating;
        this.isRated = isRated;
    }
}
