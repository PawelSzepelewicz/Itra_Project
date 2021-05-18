package com.moshecorp.universityunion.controller;

import com.moshecorp.universityunion.model.UiComment;
import com.moshecorp.universityunion.model.UserAndCompanyIds;
import com.moshecorp.universityunion.service.UiCommentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/company/comment")
@AllArgsConstructor
public class UiCommentController {

    @Autowired
    private final UiCommentService service;

    @GetMapping("/get")
    public List<UiComment> getUiCommentsList(@RequestBody UserAndCompanyIds ids) {
        return service.getUiCommentsList(ids);
    }
}

