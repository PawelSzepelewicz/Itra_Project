package com.moshecorp.universityunion.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class CompanyPreview {

    private Long id;
    private String title;
    private String description;
    private String photoUrl;
    private Double currentSum;
    private Double targetSum;
    private Timestamp expirationDate;
    private Double averageRating;

}
