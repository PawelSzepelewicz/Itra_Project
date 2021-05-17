package com.moshecorp.universityunion.service.user.impl;

import com.moshecorp.universityunion.enums.Language;
import com.moshecorp.universityunion.enums.Roles;
import com.moshecorp.universityunion.enums.Theme;
import com.moshecorp.universityunion.model.Login;
import com.moshecorp.universityunion.model.user.UiSettings;
import com.moshecorp.universityunion.model.user.User;
import com.moshecorp.universityunion.repository.user.UiSettingsRepository;
import com.moshecorp.universityunion.repository.user.UserRepository;
import com.moshecorp.universityunion.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    UiSettingsRepository uiSettingsRepository;


    @Override
    public String getUserFirstNameById(Long id) {   //utw
        return userRepository.getFirstNameById(id);
    }

    @Override
    public UiSettings register(User user) { //utw
        user.setRole(Roles.USER.name());
        user = userRepository.save(user);
        return uiSettingsRepository.save(new UiSettings(user.getId(), Language.RU.name(), Theme.LIGHT.name(), user.getRole()));
    }

    @Override
    public UiSettings login(Login login) {  //utw
        User user = userRepository.getByEmailAndPassword(login.getEmail(), login.getPassword());
        if(user.getRole() == Roles.USER_BLOCKED.name() && user.getRole() == Roles.USER_BLOCKED.name()) {
            return null;
        }else{
        return uiSettingsRepository.getByUserId(user.getId());
        }
    }

    @Override
    public void block(Long userId) {  //utw
        User user = userRepository.getById(userId);
        user.setRole(Roles.USER_BLOCKED.name());
        userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {  //utw
        return userRepository.findAll();
    }

    @Override
    public User update(User user) {  //utw
        return userRepository.save(user);
    }

    @Override
    public String getFullName(Long id) {  //utw
        return userRepository.getById(id).getFirstName() + " " + userRepository.getById(id).getLastName();
    }
}
