package com.moshecorp.universityunion.controller;

import com.moshecorp.universityunion.service.company.CompanyPhotoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/company/photo")
@AllArgsConstructor
public class CompanyPhotoController {

    private final CompanyPhotoService service;

    @GetMapping("/send")
    public void getPhotoFromFront() {
        service.sendPhotoToCloudStorage();
    }
}
