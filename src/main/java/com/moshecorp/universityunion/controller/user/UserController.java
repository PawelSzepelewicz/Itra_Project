package com.moshecorp.universityunion.controller.user;

import com.moshecorp.universityunion.model.Login;
import com.moshecorp.universityunion.model.UserRole;
import com.moshecorp.universityunion.model.user.UiSettings;
import com.moshecorp.universityunion.model.user.User;
import com.moshecorp.universityunion.service.user.UiSettingsService;
import com.moshecorp.universityunion.service.user.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/user")
@AllArgsConstructor

public class UserController {

    @Autowired
    private final UserService service;
    @Autowired
    private final UiSettingsService uiSettingsService;

    @PostMapping("/register")
    public UiSettings register(@RequestBody User user) {  //utw
        return service.register(user);
    }

    @PostMapping("/login")
    public UiSettings login(@RequestBody Login login) {  //utw
        return service.login(login);
    }

    @PostMapping("/block")
    public void block(@RequestBody Long userId) {
        service.block(userId);
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers() {  //utw
        return service.getAllUsers();
    }

    @PostMapping("/update")
    public void block(@RequestBody User user) {  //utw
        service.update(user);
    }

    @PostMapping("/change")
    public UiSettings changeUiSettings(@RequestBody UiSettings uiSettings) {  //utw
        return uiSettingsService.changeUiSettings(uiSettings);
    }

    @PostMapping("/getFullName")
    public String getFullName(@RequestBody Long id) {  //utw
        return service.getFullName(id);
    }

    @PostMapping("/changeRole")
    public void changeRole(@RequestBody UserRole userRole) {  //utw
        uiSettingsService.changeRole(userRole);
    }

}
