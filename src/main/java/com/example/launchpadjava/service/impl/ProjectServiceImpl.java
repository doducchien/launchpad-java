package com.example.launchpadjava.service.impl;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.example.launchpadjava.dto.request.ProjectRequest;
import com.example.launchpadjava.entity.Pool;
import com.example.launchpadjava.entity.Project;
import com.example.launchpadjava.repository.ProjectRepository;
import com.example.launchpadjava.service.ProjectService;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService{
    @Autowired
    ProjectRepository projectRepository;

    private ModelMapper modelMapper = new ModelMapper(); 

    @Override
    public boolean createProject(ProjectRequest project) {
        
       Project newProject = new Project();
       newProject.setType(project.getType());
       newProject.setName(project.getName());
       newProject.setDescription(project.getDescription());
       newProject.setTokenType(project.getTokenType());
       newProject.setTokenSymbol(project.getTokenSymbol());
       newProject.setTokenAddress(project.getTokenAddress());
       newProject.setTokenVesting(project.getTokenVesting());
       newProject.setTokenListingDate(project.getTokenListingDate());
       newProject.setWebsiteLink(project.getWebsiteLink());
       newProject.setFundRaiseIn(project.getFundRaiseIn());
       newProject.setTotalNumberTokenRaise(project.getTotalNumberTokenRaise());
       newProject.setTargetTotalFundRaise(project.getTargetTotalFundRaise());
       newProject.setTotalFundRaise(project.getTotalFundRaise());
       newProject.setNftDistributionDate(project.getNftDistributionDate());

    //    Type poolsType = new TypeToken<List<Pool>>(){}.getClass();
       List<Pool> pools = new ArrayList<>();
       project.getPools().forEach(item->{
           Pool pool = new Pool();
            pool.setType(item.getType());
            pool.setStartTime(item.getStartTime());
            pool.setEndTime(item.getEndTime());
            pool.setPriceEachToken(item.getPriceEachToken());
            pool.setNumberTokenRaise(item.getNumberTokenRaise());
            pool.setFundRaise(item.getFundRaise());
            pool.setMaxAllocationPerWallet(item.getMaxAllocationPerWallet());
            pool.setProject(newProject);
            pools.add(pool);
       });
       newProject.setPools(pools);

    
        projectRepository.save(newProject);
        return true;
    }

    @Override
    public List<Project> getProjects() {
        return projectRepository.findAll();
    }
    
}
