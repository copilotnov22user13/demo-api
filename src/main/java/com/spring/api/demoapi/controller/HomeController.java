package com.spring.api.demoapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.api.demoapi.models.Employee;
import com.spring.api.demoapi.repositories.EmployeeRepo;

@RestController
public class HomeController {

    @Autowired
    EmployeeRepo employeeRepo;

    @GetMapping("/")
    public String home() {
        return "Welcome to Spring Boot";
    }

    // create list of employees
// get employee by id from employee repository

    @GetMapping("/employees")
    public List<Employee> employees() {
        List<Employee> employees = new ArrayList<>();
        employeeRepo.getEmployees().forEach((k, v) -> employees.add(v));
        return employees;
    }

    @GetMapping("/employee")
    public Employee employee(Long id) {
        return employeeRepo.getEmployee(id);
    }
   

}
