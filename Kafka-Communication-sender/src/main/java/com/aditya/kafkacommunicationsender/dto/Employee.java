package com.aditya.kafkacommunicationsender.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {

    private Integer id;

    private String name;

    private Long age;

    private String position;
}
