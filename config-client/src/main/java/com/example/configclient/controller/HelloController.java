package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${nickName}")
    private String name;

    @RequestMapping("/hello")
    public String hello(){
        return "hello" +name;
    }
}
