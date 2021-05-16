package com.moshecorp.universityunion.model;

import lombok.Data;

import java.util.List;

@Data
public class CompanyIdAndTagsList {

    private Long companyId;
    private List<String> tagsList;

}
