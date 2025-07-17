package com.example.foodiehub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "✅ Spring Boot is working!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "👋 Hello from Spring Boot!";
    }
}

