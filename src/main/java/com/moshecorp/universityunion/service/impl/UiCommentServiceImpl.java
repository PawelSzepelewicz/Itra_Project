package com.moshecorp.universityunion.service.impl;

import com.moshecorp.universityunion.model.UiComment;
import com.moshecorp.universityunion.model.UserAndCompanyIds;
import com.moshecorp.universityunion.model.comments.Comments;
import com.moshecorp.universityunion.model.comments.Likes;
import com.moshecorp.universityunion.repository.comments.CommentsRepository;
import com.moshecorp.universityunion.repository.comments.LikesRepository;
import com.moshecorp.universityunion.service.UiCommentService;
import com.moshecorp.universityunion.service.comments.CommentsService;
import com.moshecorp.universityunion.service.comments.LikesService;
import com.moshecorp.universityunion.service.comments.impl.CommentsServiceImpl;
import com.moshecorp.universityunion.service.comments.impl.LikesServiceImpl;
import com.moshecorp.universityunion.service.user.UserService;
import com.moshecorp.universityunion.service.user.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class UiCommentServiceImpl implements UiCommentService {

    @Autowired
    CommentsService commentsService;
    @Autowired
    UserService userService;
    @Autowired
    LikesService likesService;

    @Override
    public List<UiComment> getUiCommentsList(UserAndCompanyIds ids) {

        List<UiComment> uiCommentList = new ArrayList<>();
        List<Comments> commentsList = commentsService.getByCompanyId(ids.getCompanyId());
        commentsList.forEach(comment -> {
            UiComment uiComment = new UiComment();
            uiComment.setId(comment.getId());
            uiComment.setContent(comment.getText());
            uiComment.setAuthorName(userService.getUserNameById(comment.getUserId()));
            uiComment.setCreationDatetime(comment.getCommentsDatetime());
            List<Likes> likesList = likesService.getListOfLikesByCommentId(comment.getId());
            uiComment.setLikesCount(likesList.size());
            uiComment.setLiked(likesList.stream().anyMatch(ll -> ll.getUserId().equals(ids.getUserId())));
            uiCommentList.add(uiComment);
        });
        return uiCommentList;
    }
}
