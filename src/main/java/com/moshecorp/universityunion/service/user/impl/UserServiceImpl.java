package com.moshecorp.universityunion.service.user.impl;

import com.moshecorp.universityunion.repository.user.UserRepository;
import com.moshecorp.universityunion.service.user.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    UserRepository userRepository;

    @Override
    public String getUserNameById(Long id) {
        return userRepository.getNameById(id);
    }
}
