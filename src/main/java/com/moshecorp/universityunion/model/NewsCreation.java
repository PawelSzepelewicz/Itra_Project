package com.moshecorp.universityunion.model;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.sql.Timestamp;
@Data
public class NewsCreation {

    private Long id;
    private Long companyId;
    private String title;
    private String content;
    private Timestamp creationDatetime;
    private MultipartFile photoUrl;

}
