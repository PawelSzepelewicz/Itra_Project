package com.moshecorp.universityunion.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserAndCompanyIds {

    Long userId;
    Long companyId;
}
