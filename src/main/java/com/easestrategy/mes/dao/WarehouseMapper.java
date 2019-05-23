package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.Warehouse;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Warehouse record);

    int insertSelective(Warehouse record);

    Warehouse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Warehouse record);

    int updateByPrimaryKey(Warehouse record);
}