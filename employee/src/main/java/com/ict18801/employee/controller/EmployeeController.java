package com.ict18801.employee.controller;

import com.ict18801.employee.model.Employee;
import com.ict18801.employee.service.EmployeeServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    EmployeeServiceInterface employeeServiceInterface;

    public EmployeeController(EmployeeServiceInterface employeeServiceInterface) {
        this.employeeServiceInterface = employeeServiceInterface;
    }

    //REST API for get a employee by id
    //http://localhost:8080/employee/1
    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long EmployeeId) {
        return new ResponseEntity<Employee>(employeeServiceInterface.getEmployeeById(EmployeeId), HttpStatus.OK);
    }

    //REST API for get all employee
    //http://localhost:8080/employee/getAll
    @GetMapping("/employee/getAll")
    public List<Employee> getAllEmployee() {
        return employeeServiceInterface.getAllEmployee();
    }

    //REST API for create a employee
    //http://localhost:8080/employee
    @PostMapping("/employee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<Employee>(employeeServiceInterface.createEmployee(employee), HttpStatus.CREATED);
    }

}
