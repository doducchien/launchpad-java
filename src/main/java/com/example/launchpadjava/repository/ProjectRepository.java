package com.example.launchpadjava.repository;

import com.example.launchpadjava.entity.Project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, String>{
    
}
