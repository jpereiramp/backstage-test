package com.example.${{ values.microserviceName | lower | replace("-", "") }};

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from ${{ values.microserviceName }}!";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
