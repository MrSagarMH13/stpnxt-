package com.assignment.datamodeling.service.impl;

import com.assignment.datamodeling.dto.ProjectRevenueDTO;
import com.assignment.datamodeling.repository.ProjectRevenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectRevenueServiceImpl implements ProjectRevenueRepository{

    @Autowired
    private EntityManager em;

    @Override
    public List<ProjectRevenueDTO> getProjectRevenue() {
        Query query = em.createNativeQuery("select data.Name as projectName, data.Qurter as quarter," +
            " rev.Revenue as revenue,data.cost as cost,(Rev.revenue-Data.cost) as profitMargin" +
            " from ProjectQrtCost data left join (select project_name," +
            " case" +
            " when month(date) between 1 and 3 then 1" +
            " when month(date) between 4 and 6 then 2" +
            " when month(date) between 7 and 9 then 3" +
            " when month(date) between 10 and 12 then 4" +
            " end " +
            " qurter,revenue from revenue) rev on data.name=rev.project_name and data.qurter=rev.qurter");
        return  mapProjectRevenueDTO(query.getResultList());
    }

    private List<ProjectRevenueDTO> mapProjectRevenueDTO(List<Object[]> resultList) {
       return  resultList.stream().map(ProjectRevenueDTO::new)
           .collect(Collectors.toCollection(ArrayList::new));
    }
}
