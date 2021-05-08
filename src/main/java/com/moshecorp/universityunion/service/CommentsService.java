package com.moshecorp.universityunion.service;

import com.moshecorp.universityunion.model.comments.Comments;

import java.util.List;

public interface CommentsService {

    List<Comments> getByCompanyId(Long companyId);

}
