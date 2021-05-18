package com.moshecorp.universityunion.controller.comments;

import com.moshecorp.universityunion.model.UiComment;
import com.moshecorp.universityunion.model.UserAndCompanyIds;
import com.moshecorp.universityunion.model.comments.Comments;
import com.moshecorp.universityunion.service.UiCommentService;
import com.moshecorp.universityunion.service.comments.CommentsService;
import com.moshecorp.universityunion.service.comments.impl.CommentsServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/comment")
@AllArgsConstructor
public class CommentsController {

    @Autowired
    private final CommentsService service;
    @Autowired
    private final UiCommentService serviceui;

    @PostMapping    //utw
    public void setNewComment(@RequestBody Comments comments){
        service.setCommentToDatabase(comments);
    }

    @GetMapping
    public List<UiComment> getUiCommentsList(@RequestBody UserAndCompanyIds ids) {
        return serviceui.getUiCommentsList(ids);
    }

}
