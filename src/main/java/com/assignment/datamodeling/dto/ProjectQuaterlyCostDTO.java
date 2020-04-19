package com.assignment.datamodeling.dto;

import com.assignment.datamodeling.entity.ProjectQuaterlyCost;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProjectQuaterlyCostDTO implements Serializable {

    private String name;
    private String role;
    private Long qurter;
    private BigDecimal hour;
    private BigDecimal cost;

    public ProjectQuaterlyCostDTO(ProjectQuaterlyCost projectQuaterlyCost) {
        this.name = projectQuaterlyCost.getName();
        this.role = projectQuaterlyCost.getRole();
        this.qurter = projectQuaterlyCost.getQurter();
        this.hour = projectQuaterlyCost.getHour();
        this.cost = projectQuaterlyCost.getCost();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getQurter() {
        return qurter;
    }

    public void setQurter(Long qurter) {
        this.qurter = qurter;
    }

    public BigDecimal getHour() {
        return hour;
    }

    public void setHour(BigDecimal hour) {
        this.hour = hour;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
}
