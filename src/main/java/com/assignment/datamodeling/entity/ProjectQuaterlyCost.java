package com.assignment.datamodeling.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "projectqrtcost")
public class ProjectQuaterlyCost implements Serializable {

    @Id
    private String id;

    private String name;
    private String role;
    private Long qurter;
    private BigDecimal hour;
    private BigDecimal cost;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Basic
    @Column(name = "qurter")
    public Long getQurter() {
        return qurter;
    }

    public void setQurter(Long qurter) {
        this.qurter = qurter;
    }

    @Basic
    @Column(name = "hour")
    public BigDecimal getHour() {
        return hour;
    }

    public void setHour(BigDecimal hour) {
        this.hour = hour;
    }

    @Basic
    @Column(name = "cost")
    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectQuaterlyCost that = (ProjectQuaterlyCost) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(role, that.role) &&
                Objects.equals(qurter, that.qurter) &&
                Objects.equals(hour, that.hour) &&
                Objects.equals(cost, that.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, role, qurter, hour, cost);
    }
}
