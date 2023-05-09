package com.jen.springwebappjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    String home() {
        return "Hello, Olawale from tomcat server!";
    }
}
