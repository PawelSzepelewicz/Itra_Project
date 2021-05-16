package com.moshecorp.universityunion.controller.company;

import com.moshecorp.universityunion.model.CompanyIdAndTagsList;
import com.moshecorp.universityunion.model.company.CompanyTags;
import com.moshecorp.universityunion.service.company.CompaniesTagsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/company/tags")
@AllArgsConstructor
public class CompaniesTagsController {
    @Autowired
    private final CompaniesTagsService service;

    @PostMapping("/getCompanyIdByTag")
    public List<Long> getCompanyIdByTagId(@RequestBody Long id) {
        return service.getCompanyIdById(id);
    }

//    @PostMapping("/save")
//    public void saveCompanyTags(@RequestBody List<CompanyTags> companyTagsList) { //utw
//        service.saveCompanyTagsList(companyTagsList);
//    }

    @PostMapping("/save")
    void saveTagsList(@RequestBody CompanyIdAndTagsList companyIdAndTagsList){   // утверждено
       service.saveTagsList(companyIdAndTagsList);
    }
}
