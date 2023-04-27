package com.ict18801.employee.service;

import com.ict18801.employee.model.Employee;

import java.util.List;

public interface EmployeeServiceInterface {
    List<Employee> getAllEmployee();
    Employee createEmployee(Employee employee);
    Employee getEmployeeById(Long EmployeeId);
}
