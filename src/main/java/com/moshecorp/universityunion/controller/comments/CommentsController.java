package com.moshecorp.universityunion.controller.comments;

import com.moshecorp.universityunion.model.UiComment;
import com.moshecorp.universityunion.model.comments.Comments;
import com.moshecorp.universityunion.service.comments.CommentsService;
import com.moshecorp.universityunion.service.comments.impl.CommentsServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/comment")
@AllArgsConstructor
public class CommentsController {

    @Autowired
    private final CommentsService service;

    @PostMapping("/set")     //utw
    public List<UiComment> setNewComment(@RequestBody Comments comments){
        return service.setCommentToDatabase(comments);
    }

}
