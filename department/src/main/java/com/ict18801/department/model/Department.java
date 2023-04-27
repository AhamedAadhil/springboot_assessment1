package com.ict18801.department.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentId;
    @Column
    private String departmentName;
    @Column
    private String managerId;
    @Column
    private String locationId;


}
