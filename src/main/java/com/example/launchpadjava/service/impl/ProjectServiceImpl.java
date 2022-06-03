package com.example.launchpadjava.service.impl;

import java.util.List;

import com.example.launchpadjava.dto.request.ProjectRequest;
import com.example.launchpadjava.entity.Project;
import com.example.launchpadjava.repository.ProjectRepository;
import com.example.launchpadjava.service.ProjectService;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService{
    @Autowired
    ProjectRepository projectRepository;

    private ModelMapper modelMapper = new ModelMapper(); 

    @Override
    public boolean createProject(ProjectRequest project) {

        Project newProject = modelMapper.map(project, Project.class);
        projectRepository.save(newProject);
        return true;
    }

    @Override
    public List<Project> getProjects() {
        return projectRepository.findAll();
    }
    
}
