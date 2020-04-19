package com.assignment.datamodeling.service.impl;

import com.assignment.datamodeling.dto.ProjectQuaterlyCostDTO;
import com.assignment.datamodeling.dto.ProjectRevenueDTO;
import com.assignment.datamodeling.entity.ProjectQuaterlyCost;
import com.assignment.datamodeling.repository.ProjectQuaterlyRepository;
import com.assignment.datamodeling.repository.ProjectRevenueRepository;
import com.assignment.datamodeling.service.ProjectMetricsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectMetricsServiceImpl implements ProjectMetricsService {

    @Autowired
    ProjectQuaterlyRepository quaterlyRepository;

    @Autowired
    ProjectRevenueRepository projectRevenueRepository;

    @Override
    public List<ProjectQuaterlyCostDTO> getQuaterlyProjectEfforts() {
        List<ProjectQuaterlyCost> projectQuaterlyCosts = quaterlyRepository.findAll();
        return projectQuaterlyCosts.stream().map(ProjectQuaterlyCostDTO::new)
            .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public List<ProjectRevenueDTO> getQuaterlyProjectRevenue() {
        return  projectRevenueRepository.getProjectRevenue();
    }

}
