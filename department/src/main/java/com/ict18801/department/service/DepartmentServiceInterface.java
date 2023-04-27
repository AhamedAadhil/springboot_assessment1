package com.ict18801.department.service;

import com.ict18801.department.model.Department;

import java.util.List;

public interface DepartmentServiceInterface {
    Department getDepartmentById(Long departmentId);

    Department createDepartment(Department department);

    List<Department> getAllDepartment();
}
