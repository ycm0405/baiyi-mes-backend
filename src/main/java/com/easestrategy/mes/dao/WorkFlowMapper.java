package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.WorkFlow;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkFlowMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkFlow record);

    int insertSelective(WorkFlow record);

    WorkFlow selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WorkFlow record);

    int updateByPrimaryKey(WorkFlow record);
}