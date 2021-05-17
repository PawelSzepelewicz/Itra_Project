package com.moshecorp.universityunion.model.company;

import com.moshecorp.universityunion.model.abstarct.AbstractEntity;

import lombok.Data;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.TermVector;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity
@Indexed
@Table(name = "company")
public class Company extends AbstractEntity {

    private Long userId;
    @Field(termVector = TermVector.YES)
    private String name;
    private Long categoryId;
    private Timestamp creationDate;
    private Timestamp expirationDate;
    private Double targetSum;
    private Double currentSum;
    @Field(termVector = TermVector.YES)
    private String description;
    
}
