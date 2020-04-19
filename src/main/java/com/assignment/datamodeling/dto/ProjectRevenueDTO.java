package com.assignment.datamodeling.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProjectRevenueDTO implements Serializable {

    private String projectName;
    private int quarter;
    private BigDecimal revenue;
    private BigDecimal cost;
    private BigDecimal profitMargin;

    public ProjectRevenueDTO(Object[] projectRevenue) {
        this.projectName = projectRevenue[0].toString();
        this.quarter = Integer.parseInt(projectRevenue[1].toString());
        this.revenue = new BigDecimal(projectRevenue[2].toString()).setScale(2);
        this.cost = new BigDecimal(projectRevenue[3].toString()).setScale(2);
        this.profitMargin = new BigDecimal(projectRevenue[4].toString()).setScale(2);
    }
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getQuarter() {
        return quarter;
    }

    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    public BigDecimal getRevenue() {
        return revenue;
    }

    public void setRevenue(BigDecimal revenue) {
        this.revenue = revenue;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getProfitMargin() {
        return profitMargin;
    }

    public void setProfitMargin(BigDecimal profitMargin) {
        this.profitMargin = profitMargin;
    }
}
