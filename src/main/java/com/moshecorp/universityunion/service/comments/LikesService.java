package com.moshecorp.universityunion.service.comments;

import com.moshecorp.universityunion.model.comments.Likes;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LikesService {

    Integer getCountOfLikesByCommentId(Long commentId);

    List<Long> getUserIdByCommentId(Long commentId);

    List<Likes> getListOfLikesByCommentId(Long commentId);

}
