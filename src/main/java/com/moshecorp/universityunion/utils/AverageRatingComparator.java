package com.moshecorp.universityunion.utils;

import com.moshecorp.universityunion.model.AverageCompanyRating;

import java.util.Comparator;

public class AverageRatingComparator implements Comparator<AverageCompanyRating> {
    @Override
    public int compare(AverageCompanyRating o1, AverageCompanyRating o2) {
        return o2.getAverageRating().compareTo(o1.getAverageRating());
    }
}
