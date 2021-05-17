package com.moshecorp.universityunion.controller;

import com.moshecorp.universityunion.model.CompanyPreview;
import com.moshecorp.universityunion.utils.FullTextSearchService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController()
@RequestMapping("/")
@AllArgsConstructor
public class FullTextSearchController {
    @Autowired
    private final FullTextSearchService service;

    @PostMapping("/search")
    public Set<CompanyPreview> getCompanyInfo(@RequestBody String searchRequest) {  //utw
        return service.searchInfoBySearchText(searchRequest);
    }
}
