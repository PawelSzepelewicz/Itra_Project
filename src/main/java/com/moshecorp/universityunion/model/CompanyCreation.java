package com.moshecorp.universityunion.model;

import lombok.Data;

@Data
public class CompanyCreation {

    private Long userId;
    private String name;
    private Long categoryId;
    private String expirationDate;
    private Double targetSum;
    private String description;

}
