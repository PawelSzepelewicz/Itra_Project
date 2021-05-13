package com.moshecorp.universityunion.controller.comments;

import com.moshecorp.universityunion.model.comments.Comments;
import com.moshecorp.universityunion.service.comments.CommentsService;
import com.moshecorp.universityunion.service.comments.impl.CommentsServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/comment")
@AllArgsConstructor
public class CommentsController {

    private final CommentsService service = new CommentsServiceImpl();

    @PostMapping("/set")
    public void test(@RequestBody Comments comments){
        service.setCommentToDatabase(comments);
    }

}
