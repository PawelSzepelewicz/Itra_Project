package com.moshecorp.universityunion.controller.company;

import com.moshecorp.universityunion.service.company.CompanyPhotoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Path;

@RestController()
@RequestMapping("/company/photo")
@AllArgsConstructor
public class CompanyPhotoController {

    private final CompanyPhotoService service;

//    @GetMapping("/send")
//    public void getPhotoFromFront() {
//        service.sendPhotoToCloudStorage();
//    }

    @PostMapping(value = "/save/{id}", consumes = "multipart/form-data") //utw
    public void saveCompanyPhoto(@RequestBody MultipartFile companyPhoto, @PathVariable("id") Long companyId) {
            service.sendPhotoToCloudStorage(companyPhoto, companyId);
//            companyPhoto.transferTo(Path.of("C:/Users/misha/OneDrive/resources/" + companyPhoto.getOriginalFilename()));
    }
}
