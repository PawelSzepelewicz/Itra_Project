package com.moshecorp.universityunion.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/")
@AllArgsConstructor
public class MainController {

    @GetMapping("/logout_suc")
    public String getPhotoFromFront() {
        return "You are successfully logout";
    }

    @GetMapping("")
    public String mainMethod() {
        return "Some info here at main page";
    }
}
