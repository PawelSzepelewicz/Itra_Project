package com.moshecorp.universityunion.repository.user;

import com.moshecorp.universityunion.model.user.UserPhoto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPhotoRepository extends JpaRepository<UserPhoto, Long> {
}
