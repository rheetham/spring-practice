package com.rheetham.springboot.demo.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerDemo {

    @GetMapping("/")
    public String greeting() {
        return "Hello World!";
    }
}
