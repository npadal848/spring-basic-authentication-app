package com.np.poc.spring_basic_authentication_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
public class HelloController {

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name){
        return String.join(" ", "Hello!", name);
    }

}
