package com.moshecorp.universityunion.repository.user;

import com.moshecorp.universityunion.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "select firstName from User where id = :id")  //utw
    String getFirstNameById(Long id);

    User getByEmailAndPassword(String email, String password);

    User getById(Long id);

}
