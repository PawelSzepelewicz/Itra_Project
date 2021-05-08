package com.moshecorp.universityunion.model.company;

import com.moshecorp.universityunion.model.abstarct.AbstractEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "news")
public class News extends AbstractEntity {

    private Long companyId;
    private String title;
    private String content;
    private Timestamp creationDatetime;
    private String photoUrl;

}
