package com.openclassroom.ChaTop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class LoginController {
    @GetMapping("/user")
    public String getUser() {
        return "Welcome User:";
    }
    @GetMapping("/admin")
    public String getAdmin() {
        return "Welcome Admin";
    }
}
