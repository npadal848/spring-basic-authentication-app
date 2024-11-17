package com.np.poc.spring_basic_authentication_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
public class SecurityController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "This is Public endpoint";
    }

    @GetMapping("/admin")
    public String adminEndpoint() {
        return "This is Admin endpoint";
    }

    @GetMapping("/user")
    public String userEndpoint() {
        return "This is User endpoint";
    }
}
