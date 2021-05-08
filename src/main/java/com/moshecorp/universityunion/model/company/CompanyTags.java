package com.moshecorp.universityunion.model.company;

import com.moshecorp.universityunion.model.abstarct.AbstractEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "companies_tags")

public class CompanyTags extends AbstractEntity{

    private Long companyId;
    private Long tagId;

}

