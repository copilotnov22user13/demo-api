package com.spring.api.demoapi.repositories;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.spring.api.demoapi.models.Employee;

@Repository
public class EmployeeRepo {

    HashMap<Long, Employee> employees = new HashMap<>();

    public EmployeeRepo() {
        employees.put(1L, new Employee(1L, "John Doe", "john.doe@localhost", "IT"));
        employees.put(2L, new Employee(2L, "Jane Doe", "jane.doe@localhost", "HR"));
        employees.put(2L, new Employee(3L, "Jaya", "jaya.doe@localhost", "IT"));
        employees.put(2L, new Employee(4L, "Bangari", "bangari.doe@localhost", "HR"));
    }
    
    public HashMap<Long, Employee> getEmployees() {
        return employees;
    }

    public Employee getEmployee(Long id) {
        return employees.get(id);
    }
}
