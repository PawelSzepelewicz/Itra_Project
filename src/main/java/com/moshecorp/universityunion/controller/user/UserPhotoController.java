package com.moshecorp.universityunion.controller.user;

import com.moshecorp.universityunion.model.user.UserPhoto;
import com.moshecorp.universityunion.service.user.UserPhotoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController()
@RequestMapping("/user/photo")
@AllArgsConstructor
public class UserPhotoController {

    @Autowired
    private final UserPhotoService service;

    @PostMapping(value = "/save/{id}", consumes = "multipart/form-data") //utw
    public void saveUserPhoto(@RequestBody MultipartFile userPhoto, @PathVariable("id") Long companyId) {
        service.sendPhotoToCloudStorage(userPhoto, companyId);
    }

    @PostMapping("/getListById") //utw
    public List<String> getPhotoListByUserId(@RequestBody Long userId) {
        return service.getPhotoUrlListByUserId(userId);
    }


}
