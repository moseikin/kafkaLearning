package com.example.producerservice.controller;

import com.example.producerservice.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
@RequiredArgsConstructor
public class ProducerController {

    private final ProducerService producerService;

    @PostMapping(path = "/send")
    public void send(@RequestBody String message){
        producerService.sendMessage(message);
    }
}
