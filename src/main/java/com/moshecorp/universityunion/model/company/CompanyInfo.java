package com.moshecorp.universityunion.model.company;

import com.moshecorp.universityunion.model.UiComment;
import com.moshecorp.universityunion.model.abstarct.AbstractEntity;
import com.moshecorp.universityunion.model.comments.Comments;
import com.moshecorp.universityunion.model.comments.Likes;
import com.moshecorp.universityunion.model.common.Tag;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class CompanyInfo extends AbstractEntity {

    private Company company;
    private List<CompanyPhoto> companyPhoto;
    private CompanyVideo companyVideo;
    private Double averageRating;
    private List<Tag> companyTags;
    private String categoryName;

}
