package com.ict18801.department.controller;

import com.ict18801.department.model.Department;
import com.ict18801.department.service.DepartmentServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    DepartmentServiceInterface departmentServiceInterface;

    public DepartmentController(DepartmentServiceInterface departmentServiceInterface) {
        this.departmentServiceInterface = departmentServiceInterface;
    }

    //REST API for get a department by id
    //http://localhost:8080/department/1
    @GetMapping("/department/{departmentId}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable("departmentId") Long departmentId) {
        return new ResponseEntity<Department>(departmentServiceInterface.getDepartmentById(departmentId), HttpStatus.OK);
    }

    //REST API for create a department
    //http://localhost:8080/department
    @PostMapping("/department")
    public ResponseEntity<Department> createDepartment(@RequestBody Department department) {
        return new ResponseEntity<Department>(departmentServiceInterface.createDepartment(department), HttpStatus.CREATED);
    }

    //REST API for get all department
    //http://localhost:8080/department/getAll
    @GetMapping("/department/getAll")
    public List<Department> getAllDepartment() {
        return departmentServiceInterface.getAllDepartment();
    }

}
