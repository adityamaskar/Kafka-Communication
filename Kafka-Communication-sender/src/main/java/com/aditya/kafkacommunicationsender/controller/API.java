package com.aditya.kafkacommunicationsender.controller;

import com.aditya.kafkacommunicationsender.dto.Employee;
import com.aditya.kafkacommunicationsender.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
@Slf4j
public class API {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/send-bulk-notification")
    public void sendBulkNotification(@RequestBody Employee employee){
        log.info("Sending bulk messages");
        employeeService.sendBulkNotification(employee);
    }

    @PostMapping("/send-notification")
    public void sendEmployeeNotification(@RequestBody Employee employee){
        log.info("Sending message for " + employee.getName());
        employeeService.sendNotification(employee);
    }
}
