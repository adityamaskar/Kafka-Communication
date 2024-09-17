package com.aditya.kafkacommunicationreceiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaCommunicationReceiverApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaCommunicationReceiverApplication.class, args);
    }

}
