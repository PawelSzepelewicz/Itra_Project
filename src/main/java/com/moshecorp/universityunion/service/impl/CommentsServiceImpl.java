package com.moshecorp.universityunion.service.impl;

import com.moshecorp.universityunion.model.comments.Comments;
import com.moshecorp.universityunion.repository.comments.CommentsRepository;
import com.moshecorp.universityunion.service.CommentsService;

import java.util.List;

public class CommentsServiceImpl implements CommentsService {

    CommentsRepository commentsRepository;

    @Override
    public List<Comments> getByCompanyId(Long companyId) {
        return commentsRepository.getByCompanyId(companyId);
    }

}
