package com.example.launchpadjava.controller;

import java.util.List;

import com.example.launchpadjava.dto.BaseResponse;
import com.example.launchpadjava.dto.request.ProjectRequest;
import com.example.launchpadjava.entity.Project;
import com.example.launchpadjava.service.ProjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/projects")
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    @PostMapping("")
    ResponseEntity<BaseResponse<Boolean>> createProject(@RequestBody ProjectRequest project){
        boolean result = projectService.createProject(project);
        BaseResponse<Boolean> baseResponse = new BaseResponse<Boolean>(true, "success", result);
        return ResponseEntity.status(HttpStatus.OK).body(baseResponse);
    }

    @GetMapping("")
    ResponseEntity<BaseResponse<List<Project>>> getProject(){
        List<Project> result = projectService.getProjects();
        BaseResponse<List<Project>> baseResponse = new BaseResponse<List<Project>>(true, "success", result);
        return ResponseEntity.status(HttpStatus.OK).body(baseResponse);
    }
}
