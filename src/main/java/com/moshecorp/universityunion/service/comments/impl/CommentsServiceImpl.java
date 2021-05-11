package com.moshecorp.universityunion.service.comments.impl;

import com.moshecorp.universityunion.model.comments.Comments;
import com.moshecorp.universityunion.repository.comments.CommentsRepository;
import com.moshecorp.universityunion.repository.comments.LikesRepository;
import com.moshecorp.universityunion.service.comments.CommentsService;
import com.moshecorp.universityunion.service.comments.LikesService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommentsServiceImpl implements CommentsService {

    CommentsRepository commentsRepository;
    private final LikesService likesService = new LikesServiceImpl();


    @Override
    public List<Comments> getByCompanyId(Long companyId) {
        return commentsRepository.getByCompanyId(companyId);
    }

    @Override
    public Map<Comments, Integer> getCommentsAndLikesByCompanyId(Long companyId) {
        List<Comments> commentsList = commentsRepository.getByCompanyId(companyId);
        Map<Comments, Integer> commentsAndLikes = new HashMap<>();
        commentsList.forEach(comment -> {
            Integer countOfLikes= likesService.getCountOfLikesByCommentId(comment.getId());
            commentsAndLikes.put(comment, countOfLikes);
        });
        return commentsAndLikes;
    }

}
