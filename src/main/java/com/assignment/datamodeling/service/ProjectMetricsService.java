package com.assignment.datamodeling.service;

import com.assignment.datamodeling.dto.ProjectQuaterlyCostDTO;
import com.assignment.datamodeling.dto.ProjectRevenueDTO;

import java.util.List;

public interface ProjectMetricsService {

    List<ProjectQuaterlyCostDTO> getQuaterlyProjectEfforts();

    List<ProjectRevenueDTO> getQuaterlyProjectRevenue();
}
