package com.demo_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {
    @GetMapping("/hello")
    public String hello(){
        return "Hello Shivang";
    }
}
