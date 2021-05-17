package com.moshecorp.universityunion.service.comments.impl;

import com.moshecorp.universityunion.model.UiComment;
import com.moshecorp.universityunion.model.UserAndCompanyIds;
import com.moshecorp.universityunion.model.comments.Comments;
import com.moshecorp.universityunion.repository.comments.CommentsRepository;
import com.moshecorp.universityunion.repository.comments.LikesRepository;
import com.moshecorp.universityunion.service.UiCommentService;
import com.moshecorp.universityunion.service.comments.CommentsService;
import com.moshecorp.universityunion.service.comments.LikesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class CommentsServiceImpl implements CommentsService {

    @Autowired
    private CommentsRepository commentsRepository;
    @Autowired
    private LikesService likesService;
    @Autowired
    private UiCommentService uiCommentService;

    @Override
    public List<UiComment> setCommentToDatabase(Comments comments) {   //utw
        Timestamp ts = Timestamp.from(Instant.now());
        comments.setCommentsDatetime(ts);
        commentsRepository.save(comments);
        return uiCommentService.getUiCommentsList(new UserAndCompanyIds(comments.getUserId(), comments.getCompanyId()));
    }

    @Override
    public List<Comments> getByCompanyId(Long companyId) {  //utw
        return commentsRepository.getByCompanyIdOrderByCommentsDatetimeDesc(companyId);
    }

}
