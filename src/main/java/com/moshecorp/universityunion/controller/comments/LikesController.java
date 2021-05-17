package com.moshecorp.universityunion.controller.comments;

import com.moshecorp.universityunion.model.UserAndCommentIds;
import com.moshecorp.universityunion.service.comments.LikesService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/comment/like")
@AllArgsConstructor
public class LikesController {
    @Autowired
    private final LikesService service;

    @PostMapping("/set")
    public void setNewLike(@RequestBody UserAndCommentIds ids) {//utw
        service.setLike(ids);
    }

    @PostMapping("/delete")
    public void deleteLike(@RequestBody UserAndCommentIds ids) {//utw
        service.deleteLike(ids);
    }
}
