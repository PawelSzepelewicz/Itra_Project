package com.moshecorp.universityunion.controller.company;

import com.moshecorp.universityunion.model.UiComment;
import com.moshecorp.universityunion.model.UserAndCompanyIds;
import com.moshecorp.universityunion.service.UiCommentService;
import com.moshecorp.universityunion.service.company.CompaniesTagsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/tags")
@AllArgsConstructor
public class CompaniesTagsController {
    @Autowired
    private final CompaniesTagsService service;

    @PostMapping("/getCompanyIdByTag")
    public List<Long> getCompanyIdById(@RequestBody Long id) {
        return service.getCompanyIdById(id);
    }
}
