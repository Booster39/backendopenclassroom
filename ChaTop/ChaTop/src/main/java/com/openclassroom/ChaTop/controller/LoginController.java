package com.openclassroom.ChaTop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @GetMapping("/")
    public String sayHello() {
        return "Hello";
    }
    @GetMapping("/user")
    public String getUser() {
        return "Welcome User:";
    }
    @GetMapping("/admin")
    public String getAdmin() {
        return "Welcome Admin";
    }
}
