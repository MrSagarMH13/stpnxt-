package com.assignment.datamodeling.repository;

import com.assignment.datamodeling.entity.ProjectQuaterlyCost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProjectQuaterlyRepository extends JpaRepository<ProjectQuaterlyCost, String> {
}
