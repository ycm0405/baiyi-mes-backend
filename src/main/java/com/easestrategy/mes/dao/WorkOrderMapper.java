package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.WorkOrder;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkOrder record);

    int insertSelective(WorkOrder record);

    WorkOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WorkOrder record);

    int updateByPrimaryKey(WorkOrder record);
}