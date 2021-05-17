package com.moshecorp.universityunion.repository.comments;

import com.moshecorp.universityunion.model.comments.Likes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LikesRepository extends JpaRepository<Likes, Long> {

    @Query(value = "select count(id) from Likes where commentId = :commentId")
    Integer getCountOfLikesByCommentId(@Param("commentId") Long commentId);

    @Query(value = "select userId from Likes where commentId = :commentId")
    List<Long> getUserIdByCommentId(@Param("commentId") Long commentId);

    List<Likes> getAllByCommentId(Long commentId);

    void deleteByCommentIdAndUserId(Long commentId, Long userId);
}
