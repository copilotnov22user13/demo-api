package com.spring.api.demoapi.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
// class Employee with properties id, name, email, and department
public class Employee {
    private Long id;
    private String name;
    private String email;
    private String department;
}
