package com.example.foodiehub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "✅ Spring Boot is !";
    }

    @GetMapping("/home")
    public String hello() {
        return "👋 Hello from Spring Boot!";
    }
}
