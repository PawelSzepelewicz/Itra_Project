package com.moshecorp.universityunion.service.comments.impl;

import com.moshecorp.universityunion.model.comments.Comments;
import com.moshecorp.universityunion.repository.comments.LikesRepository;
import com.moshecorp.universityunion.service.comments.LikesService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LikesServiceImpl implements LikesService {

    LikesRepository likesRepository;

    @Override
    public Integer getCountOfLikesByCommentId(Long commentId) {
        return likesRepository.getCountOfLikesByCommentId(commentId);
    }

    @Override
    public List<Long> getUserIdByCommentId(Long commentId) {
        return likesRepository.getUserIdByCommentId(commentId);
    }
}
