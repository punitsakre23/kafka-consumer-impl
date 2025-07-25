package com.comm.kafka.consumer.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "${kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void receiveMessage(ConsumerRecord<String, String> consumerRecord) {
        System.out.println("Received message: " + consumerRecord.value());
    }
}
