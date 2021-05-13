package com.moshecorp.universityunion.controller.user;

import com.moshecorp.universityunion.service.user.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/user")
@AllArgsConstructor

public class UserController {

    @Autowired
    private final UserService service;

    @PostMapping("/getNameList")
    public List<String> getNameList() {
        return service.getNameList();
    }
}
