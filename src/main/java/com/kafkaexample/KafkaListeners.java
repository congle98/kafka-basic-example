package com.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "congdeptrai",groupId = "groupId")
    void listeners(String data){
        System.out.println(data);
    }
}
