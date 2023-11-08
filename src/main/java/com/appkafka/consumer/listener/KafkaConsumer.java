package com.appkafka.consumer.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class KafkaConsumer {
    
    @KafkaListener(topics = "topicoTeste", groupId = "group-1")
    public void consume(ConsumerRecord<String, String> message) {
        String payload = message.value();
        
        if (payload.contains("\"codMsg\":\"MSG003\"")) {
            log.info("\n\nMensagem consumida com sucesso: {} - Particao: {} |  Topico: {} ", 
                message.value(),
                message.partition(),
                message.topic() 
                + "\n");
        } else {
            log.info("Mensagem consumida, codigo da mensagem difere do esperado");
        }
    }

}
