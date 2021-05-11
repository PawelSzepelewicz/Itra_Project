package com.moshecorp.universityunion.controller;

import com.moshecorp.universityunion.model.UiComment;
import com.moshecorp.universityunion.model.UserAndCompanyIds;
import com.moshecorp.universityunion.repository.comments.CommentsRepository;
import com.moshecorp.universityunion.repository.comments.LikesRepository;
import com.moshecorp.universityunion.repository.user.UserRepository;
import com.moshecorp.universityunion.service.UiCommentService;
import com.moshecorp.universityunion.service.UiCommentServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/company/comment")
@AllArgsConstructor
public class UiCommentController {
    private final UiCommentService service;

    @PostMapping("/get")
    public List<UiComment> getUiCommentsList(@RequestBody UserAndCompanyIds ids) {
        return service.getUiCommentsList(ids);
    }
}

