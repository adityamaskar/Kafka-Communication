package com.aditya.kafkacommunicationsender.service;

import com.aditya.kafkacommunicationsender.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    KafkaTemplate<Integer, Employee> kafkaTemplate;

    @Value("${employee-notification-topic}")
    String empNotificationTopic;
    public void sendBulkNotification(Employee employee) {

        for (int i = employee.getId() ; i < employee.getId() +100; i++) {
            kafkaTemplate.send(empNotificationTopic, i, employee);
        }
    }

    public void sendNotification(Employee employee) {
        kafkaTemplate.send(empNotificationTopic, employee.getId(), employee);
    }
}
