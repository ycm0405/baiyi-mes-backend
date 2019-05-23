package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.Equipment;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Equipment record);

    int insertSelective(Equipment record);

    Equipment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Equipment record);

    int updateByPrimaryKey(Equipment record);
}