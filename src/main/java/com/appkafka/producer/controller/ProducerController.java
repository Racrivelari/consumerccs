package com.appkafka.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.appkafka.dto.SpbdocDTO;
import com.appkafka.producer.service.ProducerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class ProducerController {

    @Autowired
    ProducerService producerService;

    @Autowired
    private ObjectMapper objectMapper; 

    private String topic = "topicoTeste";

    @PostMapping("send-message")
    public ResponseEntity<String> postMessage(@RequestBody SpbdocDTO dto) throws JsonProcessingException{
        String message = objectMapper.writeValueAsString(dto);
        producerService.sendMessage(topic, message);
        return ResponseEntity.status(HttpStatus.OK).body("Mensagem enviada com sucesso");
    }
}
