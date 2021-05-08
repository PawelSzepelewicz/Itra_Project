package com.moshecorp.universityunion.model.comments;

import com.moshecorp.universityunion.model.abstarct.AbstractEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "comments")
public class Comments extends AbstractEntity {

    private Long userId;
    private Long companyId;
    private Timestamp commentsDatetime;
    private String text;

}
