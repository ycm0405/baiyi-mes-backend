package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.WorkFlowEdge;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkFlowEdgeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkFlowEdge record);

    int insertSelective(WorkFlowEdge record);

    WorkFlowEdge selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WorkFlowEdge record);

    int updateByPrimaryKey(WorkFlowEdge record);
}