package com.moshecorp.universityunion.service.comments.impl;

import com.moshecorp.universityunion.model.comments.Comments;
import com.moshecorp.universityunion.repository.comments.CommentsRepository;
import com.moshecorp.universityunion.service.comments.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

@Service
public class CommentsServiceImpl implements CommentsService {

    @Autowired
    private CommentsRepository commentsRepository;

    @Override
    public void setCommentToDatabase(Comments comments) {   //utw
        Timestamp ts = Timestamp.from(Instant.now());
        comments.setCommentsDatetime(ts);
        commentsRepository.save(comments);
    }

    @Override
    public List<Comments> getByCompanyId(Long companyId) {  //utw
        return commentsRepository.getByCompanyIdOrderByCommentsDatetimeDesc(companyId);
    }

}
