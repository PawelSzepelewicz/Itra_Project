package com.moshecorp.universityunion.controller.company;

import com.moshecorp.universityunion.model.company.CompanyPhoto;
import com.moshecorp.universityunion.model.company.CompanyVideo;
import com.moshecorp.universityunion.service.company.CompanyPhotoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

@RestController()
@RequestMapping("/company/photo")
@AllArgsConstructor
public class CompanyPhotoController {

    @Autowired
    private final CompanyPhotoService service;

    @PostMapping(value = "/save/{id}", consumes = "multipart/form-data") //utw
    public void saveCompanyPhoto(@RequestBody MultipartFile companyPhoto, @PathVariable("id") Long companyId) {
            service.sendPhotoToCloudStorage(companyPhoto, companyId);
    }

    @PostMapping("/getListById") //utw
    public List<String> getPhotoUrlListByCompanyId(@RequestBody Long companyId) {
        return service.getPhotoUrlListByCompanyId(companyId);
    }
}
