package com.example.Crud.Repository;

import com.example.Crud.Model.Projects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Projects, Integer> {

}
