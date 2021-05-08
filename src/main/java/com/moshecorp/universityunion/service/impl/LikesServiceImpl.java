package com.moshecorp.universityunion.service.impl;

import com.moshecorp.universityunion.repository.comments.LikesRepository;
import com.moshecorp.universityunion.service.LikesService;

import java.util.List;

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
