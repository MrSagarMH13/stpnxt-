package com.assignment.datamodeling.repository;


import com.assignment.datamodeling.dto.ProjectRevenueDTO;

import java.util.List;

public interface ProjectRevenueRepository {

    List<ProjectRevenueDTO> getProjectRevenue();
}
