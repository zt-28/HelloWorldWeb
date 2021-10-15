package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/index")
    public String web() {
        String Result = "helloword Spring Boot！这是一个用Spring Boot开发的网站。";
        return Result;
    }


}
