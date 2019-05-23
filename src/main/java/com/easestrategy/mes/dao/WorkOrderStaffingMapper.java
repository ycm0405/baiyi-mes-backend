package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.WorkOrderStaffing;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkOrderStaffingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkOrderStaffing record);

    int insertSelective(WorkOrderStaffing record);

    WorkOrderStaffing selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WorkOrderStaffing record);

    int updateByPrimaryKey(WorkOrderStaffing record);
}