package com.moshecorp.universityunion.controller.company;

import com.moshecorp.universityunion.model.company.CompanyPhoto;
import com.moshecorp.universityunion.service.company.CompanyPhotoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/company/photo")
@AllArgsConstructor
public class CompanyPhotoController {

    private final CompanyPhotoService service;

//    @GetMapping("/send")
//    public void getPhotoFromFront() {
//        service.sendPhotoToCloudStorage();
//    }

    @PostMapping("/send")
    public void saveCompanyPhotos(@RequestBody List<CompanyPhoto> companyPhotoList){
        service.saveCompanyPhotos(companyPhotoList);
    }
}
