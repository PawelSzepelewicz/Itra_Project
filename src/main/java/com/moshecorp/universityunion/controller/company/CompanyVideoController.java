package com.moshecorp.universityunion.controller.company;

import com.moshecorp.universityunion.model.company.CompanyVideo;
import com.moshecorp.universityunion.service.company.CompanyVideoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/company/video")
@AllArgsConstructor
public class CompanyVideoController {

    @Autowired
    private final CompanyVideoService service;

    @PostMapping("/save")
    public void saveCompanyVideo(@RequestBody CompanyVideo companyVideo) { //utw
        service.saveCompanyVideo(companyVideo);
    }
}
