package com.moshecorp.universityunion.repository.user;

import com.moshecorp.universityunion.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "select name from User")
    List<String> getNameList();

//    @Query(value = "select * from public.usr where public_id = :public_id", nativeQuery = true)
//    User getByPublicId(@Param("public_id") String publicId);
//
      @Query(value = "select name from User where id = :id")
      String getNameById(@Param("id") Long id);

}
