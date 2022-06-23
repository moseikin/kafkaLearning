package com.example.consumerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class TestController {

    @GetMapping(path = "/")
    public String consumerTest() {
        return "test consumer ok";
    }
}
