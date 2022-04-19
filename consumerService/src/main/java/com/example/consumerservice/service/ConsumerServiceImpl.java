package com.example.consumerservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ConsumerServiceImpl implements ConsumerService{

    @KafkaListener(topics = "${spring.kafka.template.topic-name}")
    @Override
    public void receiveMessage(String message) {
        log.info(message);
    }
}
