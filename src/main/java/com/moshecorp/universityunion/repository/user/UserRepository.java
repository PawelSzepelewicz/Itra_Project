package com.moshecorp.universityunion.repository.user;

import com.moshecorp.universityunion.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
