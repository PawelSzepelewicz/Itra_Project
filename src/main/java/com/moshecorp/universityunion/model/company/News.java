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
@Table(name = "news")
public class News extends AbstractEntity {

    private Long companyId;
    @Field(termVector = TermVector.YES)
    private String title;
    @Field(termVector = TermVector.YES)
    private String content;
    private Timestamp creationDatetime;
    private String photoUrl;

}
