package com.rheetham.springboot.demo.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRest {
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/forward")
    public String sayHi() {
        return "Hi!";
    }
}
