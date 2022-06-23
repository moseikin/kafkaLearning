package com.example.producerservice.controller;

import com.example.producerservice.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/")
@RequiredArgsConstructor
public class ProducerController {

    private final ProducerService producerService;

    @GetMapping(path = "/")
    public String testProducer() {
        return "test producer controller ok";
    }

    @PostMapping(path = "/send")
    public void send(@RequestBody String message) {
        producerService.sendMessage(message);
    }
}
