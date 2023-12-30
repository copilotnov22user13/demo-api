package com.spring.api.demoapi.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.api.demoapi.models.Employee;
import com.spring.api.demoapi.repositories.EmployeeRepo;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeRepo employeeRepo;

    
    // get employee by id from employee repository

    @GetMapping("/employees")
    public HashMap<Long, Employee> employees() {
        return employeeRepo.getEmployees();
    }

    @GetMapping("/employee/{id}")
    public Employee employee(@PathVariable("id") Long id) {
        return employeeRepo.getEmployee(id);
    }








    
}
