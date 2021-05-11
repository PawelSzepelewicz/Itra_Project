package com.moshecorp.universityunion.service.user.impl;

import com.moshecorp.universityunion.repository.user.UserRepository;
import com.moshecorp.universityunion.service.user.UserService;

public class UserServiceImpl implements UserService{

    UserRepository userRepository;

    @Override
    public String getUserNameById(Long id) {
        return userRepository.getNameById(id);
    }
}
