package com.moshecorp.universityunion.service.user.impl;

import com.cloudinary.Cloudinary;
import com.moshecorp.universityunion.model.user.UserPhoto;
import com.moshecorp.universityunion.repository.user.UserPhotoRepository;
import com.moshecorp.universityunion.service.user.UserPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static java.lang.String.format;
@Service
public class UserPhotoServiceImpl implements UserPhotoService {

    @Autowired
    private UserPhotoRepository repository;

    public UserPhotoServiceImpl(UserPhotoRepository repository) {
        this.repository = repository;
    }

    public void saveNewPhotoFromGoogle(UserPhoto userPhoto) {
        savePhotoToCloudStorage(userPhoto);
    }

    private UserPhoto savePhotoToCloudStorage(UserPhoto userPhoto) {
        Map<String, String> credentials = new HashMap<>();
        credentials.put("cloud_name", "itracourse");
        credentials.put("api_key", "852218272247124");
        credentials.put("api_secret", "2MPV2kthcxl9bbVpf_ExI6G-Vj4");

        Cloudinary cloudinary = new Cloudinary(credentials);
        try {
            Integer countOfPhoto;
            try {
                countOfPhoto = repository.getAllByUserId(userPhoto.getUserId()).size();
            } catch (NullPointerException ne) {
                countOfPhoto = 0;
            }
            Map resultUrl = cloudinary.uploader().upload(userPhoto.getPhotoUrl(),
                    Map.of("public_id",
                            format("%s/%s",
                                    userPhoto.getUserId(),
                                    countOfPhoto + 1)
                    )
            );
            userPhoto.setPhotoUrl((String) resultUrl.get("secure_url"));

        } catch (IOException e) {
            e.printStackTrace();
        }
        repository.save(userPhoto);

        return userPhoto;
    }
}
