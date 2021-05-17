package com.moshecorp.universityunion.controller;

import com.moshecorp.universityunion.model.CompanyCreation;
import com.moshecorp.universityunion.model.UiComment;
import com.moshecorp.universityunion.model.UserAndCompanyIds;
import com.moshecorp.universityunion.model.common.Tag;
import com.moshecorp.universityunion.model.company.CompanyInfo;
import com.moshecorp.universityunion.service.company.CompanyInfoService;
import com.moshecorp.universityunion.service.company.impl.CompanyInfoServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController()
@RequestMapping("/company")
@AllArgsConstructor
public class CompanyInfoController {

    @Autowired
    private final CompanyInfoService service;

    @PostMapping("/getCompanyInfo")
    public CompanyInfo getCompanyInfo(@RequestBody UserAndCompanyIds ids) {  //utw
        return service.getByIds(ids);
    }
}
