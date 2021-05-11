package com.moshecorp.universityunion.service.user;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

    String getUserNameById(Long id);
}
