package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public Greeting handle() {
        return new Greeting("WebFlux");
    }
}
