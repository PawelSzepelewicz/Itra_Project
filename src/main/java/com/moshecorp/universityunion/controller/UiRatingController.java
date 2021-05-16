package com.moshecorp.universityunion.controller;

import com.moshecorp.universityunion.model.UiComment;
import com.moshecorp.universityunion.model.UiRating;
import com.moshecorp.universityunion.model.UserAndCompanyIds;
import com.moshecorp.universityunion.model.user.User;
import com.moshecorp.universityunion.service.UiCommentService;
import com.moshecorp.universityunion.service.UiRatingService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/company/rating")
@AllArgsConstructor
public class UiRatingController {

    @Autowired
    private final UiRatingService service;

    @PostMapping("/get")
    public UiRating getCompanyRating(@RequestBody UserAndCompanyIds ids) {   //utw
        return service.getRating(ids);
    }

}
