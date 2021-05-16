package com.moshecorp.universityunion.repository.user;

import com.moshecorp.universityunion.model.user.UserPhoto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserPhotoRepository extends JpaRepository<UserPhoto, Long> {

    @Query(value = "select photoUrl from UserPhoto where userId = :userId")
    List<String> getPhotoUslListByUserId(@Param("userId") Long userId);            //utw
}
