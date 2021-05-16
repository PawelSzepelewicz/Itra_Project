package com.moshecorp.universityunion.service.user;

import com.moshecorp.universityunion.model.user.UserPhoto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface UserPhotoService {

    void sendPhotoToCloudStorage(MultipartFile file, Long userId); //utw

    List<String> getPhotoUrlListByUserId(Long userId); //utw

}
