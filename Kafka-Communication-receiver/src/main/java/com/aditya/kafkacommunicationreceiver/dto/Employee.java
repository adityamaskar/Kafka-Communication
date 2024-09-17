package com.aditya.kafkacommunicationreceiver.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {

    private Integer id;

    private String name;

    private Long age;

    private String position;
}
