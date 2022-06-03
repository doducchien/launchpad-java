package com.example.launchpadjava.service;

import java.util.List;

import com.example.launchpadjava.dto.request.ProjectRequest;
import com.example.launchpadjava.entity.Project;

public interface ProjectService {
    boolean createProject(ProjectRequest project);
    List<Project> getProjects();
}
