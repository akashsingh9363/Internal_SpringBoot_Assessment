package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepo;

    // Create/Update
    public void saveEmployee(Employee employee) {
        employeeRepo.save(employee);
    }

    // Read All
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    // Read One
    public Employee getEmployeeById(Long id) {
        Optional<Employee> optional = employeeRepo.findById(id);
        return optional.orElse(null);
    }

    // Delete
    public void deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
    }
}
