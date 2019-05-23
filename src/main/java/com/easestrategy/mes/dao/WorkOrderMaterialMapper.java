package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.WorkOrderMaterial;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkOrderMaterialMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkOrderMaterial record);

    int insertSelective(WorkOrderMaterial record);

    WorkOrderMaterial selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WorkOrderMaterial record);

    int updateByPrimaryKey(WorkOrderMaterial record);
}