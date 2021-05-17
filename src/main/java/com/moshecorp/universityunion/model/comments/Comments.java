package com.moshecorp.universityunion.model.comments;

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
@Table(name = "comments")
public class Comments extends AbstractEntity {

    private Long userId;
    private Long companyId;
    private Timestamp commentsDatetime;
    @Field(termVector = TermVector.YES)
    private String text;

}
