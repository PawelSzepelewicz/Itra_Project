package com.moshecorp.universityunion.model;

import org.springframework.web.multipart.MultipartFile;

import java.sql.Timestamp;

public class NewsCreation {

    private Long id;
    private Long companyId;
    private String title;
    private String content;
    private Timestamp creationDatetime;
    private MultipartFile photoUrl;

}
