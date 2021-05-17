package com.moshecorp.universityunion.service.user.impl;

import com.moshecorp.universityunion.enums.Roles;
import com.moshecorp.universityunion.model.UserRole;
import com.moshecorp.universityunion.model.user.UiSettings;
import com.moshecorp.universityunion.model.user.User;
import com.moshecorp.universityunion.repository.user.UiSettingsRepository;
import com.moshecorp.universityunion.repository.user.UserRepository;
import com.moshecorp.universityunion.service.user.UiSettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UiSettingsServiceImpl implements UiSettingsService {

    @Autowired
    UiSettingsRepository uiSettingsRepository;
    @Autowired
    UserRepository userRepository;

    @Override
    public UiSettings changeUiSettings(UiSettings uiSettings) {   //utw
        return uiSettingsRepository.save(uiSettings);
    }

    @Override
    public void changeRole(UserRole userRole) {
        UiSettings uiSettings = uiSettingsRepository.getByUserId(userRole.getUserId());
        uiSettings.setRole(getFromString(userRole.getRole()).name());
        uiSettingsRepository.save(uiSettings);
        User user = userRepository.getById(userRole.getUserId());
        user.setRole(userRole.getRole());
        userRepository.save(user);
    }

    private Roles getFromString(String role){
        switch(role){
            case "ADMIN" -> {
                return Roles.ADMIN;
            }
            case "ADMIN_BLOCKED" -> {
                return Roles.ADMIN_BLOCKED;
            }
            case "USER_BLOCKED" -> {
                return Roles.USER_BLOCKED;
            }
            default -> {
                return Roles.USER;
            }
        }
    }
}
