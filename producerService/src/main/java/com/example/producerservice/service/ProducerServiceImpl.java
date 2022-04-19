package com.example.producerservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProducerServiceImpl implements ProducerService{

    @Value(value = "${spring.kafka.topic}")
    private String topicName;

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void sendMessage(@RequestBody String message) {
                kafkaTemplate.send(topicName, message);
    }
}
