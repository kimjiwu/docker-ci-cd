package com.example.dockercicd;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    public String hello() {
        return "hello";
    }
}
