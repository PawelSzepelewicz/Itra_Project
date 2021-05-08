package com.moshecorp.universityunion.model.company;

import com.moshecorp.universityunion.model.abstarct.AbstractEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "rating")
public class Rating extends AbstractEntity {

    private Long userId;
    private Long companyId;
    private int ratingValue;

}
