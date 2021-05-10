package com.moshecorp.universityunion.service.user;

import com.moshecorp.universityunion.model.user.UserPhoto;

public interface UserPhotoService {

    void saveNewPhotoFromGoogle(UserPhoto userPhoto);
}
