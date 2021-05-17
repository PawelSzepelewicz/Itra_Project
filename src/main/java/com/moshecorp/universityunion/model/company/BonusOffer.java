package com.moshecorp.universityunion.model.company;

import com.moshecorp.universityunion.model.abstarct.AbstractEntity;
import lombok.Data;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.TermVector;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Indexed
@Table(name = "bonus_offer")
public class BonusOffer extends AbstractEntity {

    private Long companyId;
    @Field(termVector = TermVector.YES)
    private String title;
    @Field(termVector = TermVector.YES)
    private String description;
    @Column(name = "sum")
    private Double bonusSum;

}
