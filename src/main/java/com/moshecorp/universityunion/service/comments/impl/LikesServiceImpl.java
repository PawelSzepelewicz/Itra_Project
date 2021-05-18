package com.moshecorp.universityunion.service.comments.impl;

import com.moshecorp.universityunion.model.UserAndCommentIds;
import com.moshecorp.universityunion.model.comments.Likes;
import com.moshecorp.universityunion.repository.comments.LikesRepository;
import com.moshecorp.universityunion.service.comments.LikesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LikesServiceImpl implements LikesService {

    @Autowired
    private LikesRepository likesRepository;

    @Override
    public Integer getCountOfLikesByCommentId(Long commentId) {
        return likesRepository.getCountOfLikesByCommentId(commentId);
    }

    @Override
    public List<Long> getUserIdByCommentId(Long commentId) {
        return likesRepository.getUserIdByCommentId(commentId);
    }

    @Override
    public List<Likes> getListOfLikesByCommentId(Long commentId) {
        return likesRepository.getAllByCommentId(commentId);
    }

    @Override
    public void setLike(UserAndCommentIds ids) { //utw
        likesRepository.save(new Likes(ids.getUserId(), ids.getCommentId()));
    }

    @Transactional
    @Override
    public void deleteLike(UserAndCommentIds ids) {
        likesRepository.deleteByCommentIdAndUserId(ids.getCommentId(), ids.getUserId());
    }
}
