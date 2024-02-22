package com.example.Crud.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Projects {

    @Id
    @GeneratedValue
    private int projectId;
    private String ProjectName;
    private String submitionDate;
    @OneToOne(mappedBy = "projects")
    private Employee employee;
}
