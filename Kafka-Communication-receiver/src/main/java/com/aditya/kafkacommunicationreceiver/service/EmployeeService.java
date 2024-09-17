package com.aditya.kafkacommunicationreceiver.service;

import com.aditya.kafkacommunicationreceiver.dto.Employee;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmployeeService {

    @KafkaListener(topics = "${employee-notification-topic}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(ConsumerRecord<Integer, Employee> employee){
        log.info("reading value from Partition : " + employee.partition());
//        log.info(employee.value().toString()); // we can uncomment this if we want print the message.
    }
}
