package com.assignment.datamodeling.controller;

import com.assignment.datamodeling.dto.ProjectQuaterlyCostDTO;
import com.assignment.datamodeling.dto.ProjectRevenueDTO;
import com.assignment.datamodeling.service.ProjectMetricsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectMetricsController {

    @Autowired
    ProjectMetricsService projectMetricsService;

    @GetMapping("/efforts")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<ProjectQuaterlyCostDTO>> getQuaterlyProjectEfforts(){
        List<ProjectQuaterlyCostDTO> projectQuaterlyCostDTOS = projectMetricsService.getQuaterlyProjectEfforts();
        return ResponseEntity.ok().body(projectQuaterlyCostDTOS);
    }

    @GetMapping("/revenue")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<ProjectRevenueDTO>> getQuaterlyProjectRevenue(){
        List<ProjectRevenueDTO> projectQuterlyCostDTOS = projectMetricsService.getQuaterlyProjectRevenue();
        return ResponseEntity.ok().body(projectQuterlyCostDTOS);
    }
}
