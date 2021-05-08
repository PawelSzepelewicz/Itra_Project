package com.moshecorp.universityunion.service.comments;

import com.moshecorp.universityunion.model.comments.Comments;
import com.moshecorp.universityunion.model.company.CompanyInfo;

import java.util.List;
import java.util.Map;

public interface CommentsService {

    List<Comments> getByCompanyId(Long companyId);

    Map<Comments, Integer> getCommentsAndLikesByCompanyId(Long companyId);

}
