package com.moshecorp.universityunion.service.comments;

import com.moshecorp.universityunion.model.UserAndCommentIds;
import com.moshecorp.universityunion.model.comments.Likes;

import java.util.List;

public interface LikesService {

    Integer getCountOfLikesByCommentId(Long commentId);

    List<Long> getUserIdByCommentId(Long commentId);

    List<Likes> getListOfLikesByCommentId(Long commentId);

    void setLike(UserAndCommentIds ids); //utw

}
