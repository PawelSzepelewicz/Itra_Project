package com.moshecorp.universityunion.model.company;

import com.moshecorp.universityunion.model.abstarct.AbstractEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "bonus_offer")
public class BonusOffer extends AbstractEntity {

    private Long companyId;
    private String title;
    private String description;
    @Column(name = "sum")
    private Double bonusSum;

}
