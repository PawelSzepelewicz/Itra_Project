package com.moshecorp.universityunion.service.comments;

import com.moshecorp.universityunion.model.comments.Comments;
import com.moshecorp.universityunion.model.company.CompanyInfo;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

public interface CommentsService {

    void setCommentToDatabase(Comments comments);

    List<Comments> getByCompanyId(Long companyId);

   // Map<Comments, Integer> getCommentsAndLikesByCompanyId(Long companyId);

    //void setCommentToBD(Long userId, Long companyId, String text, Timestamp datetime);

}
