package com.moshecorp.universityunion.service;

import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LikesService {

    Integer getCountOfLikesByCommentId(Long commentId);

    List<Long> getUserIdByCommentId(Long commentId);
}
