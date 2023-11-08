package com.appkafka.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProducerService {
    
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String topic, String message){
        log.info("\n\nMensagem enviada com sucesso -> {}", message + "\n");
        this.kafkaTemplate.send(topic, message);
    }

}
