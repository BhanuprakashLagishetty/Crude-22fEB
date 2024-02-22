package com.example.Crud.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int eid;

    private String ename;

    private String edesignation;

    private  String esalary;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "project_id")
    private Projects projects;
    @Embedded
    private Address address;


}
