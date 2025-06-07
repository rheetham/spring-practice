package com.rheetham.springboot.demo.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerDemo {

    @GetMapping("/")
    public String greeting() {
        return "Hello World!";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "This will be a dashboard";
    }

    @GetMapping("/cart")
    public String cart() {
        return "This will be cart";
    }
}
