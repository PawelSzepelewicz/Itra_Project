package com.moshecorp.universityunion.service.user.impl;

import com.cloudinary.Cloudinary;
import com.moshecorp.universityunion.model.user.UserPhoto;
import com.moshecorp.universityunion.repository.user.UserPhotoRepository;
import com.moshecorp.universityunion.service.user.UserPhotoService;
import com.moshecorp.universityunion.utils.CloudinaryCredentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static java.lang.String.format;

@Service
public class UserPhotoServiceImpl implements UserPhotoService {

    @Autowired
    UserPhotoRepository userPhotoRepository;

    public void sendPhotoToCloudStorage(MultipartFile file, Long userId) { //utw
        Cloudinary cloudinary = new Cloudinary(new CloudinaryCredentials().getCloudinaryCredentials());
        try {
            Map resultUrl = cloudinary.uploader().upload(file.getBytes(),
                    Map.of("public_id", format("user/user_%s/%s", userId, file.getOriginalFilename())));
            userPhotoRepository.save(new UserPhoto(userId, resultUrl.get("secure_url").toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<String> getPhotoUrlListByUserId(Long userId) { //utw
        return userPhotoRepository.getPhotoUslListByUserId(userId);
    }
}
