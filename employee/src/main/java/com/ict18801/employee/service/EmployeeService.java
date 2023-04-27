package com.ict18801.employee.service;

import com.ict18801.employee.model.Employee;
import com.ict18801.employee.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements EmployeeServiceInterface{
    EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long EmployeeId) {
        Optional<Employee> employee=employeeRepository.findById(EmployeeId);
        if(employee.isPresent()){
            return employee.get();
        }
        else {
            throw new RuntimeException("Employee not found for id: "+EmployeeId);
        }
    }
}
