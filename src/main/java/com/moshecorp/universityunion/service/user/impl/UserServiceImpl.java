package com.moshecorp.universityunion.service.user.impl;

import com.moshecorp.universityunion.repository.user.UserRepository;
import com.moshecorp.universityunion.service.user.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    UserRepository userRepository;

    @Override
    public List<String> getNameList() {
        return userRepository.getNameList();
    }

    @Override
    public String getUserNameById(Long id) {
        return userRepository.getNameById(id);
    }
}
