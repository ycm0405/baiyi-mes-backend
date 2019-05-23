package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.Procurement;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcurementMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Procurement record);

    int insertSelective(Procurement record);

    Procurement selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Procurement record);

    int updateByPrimaryKey(Procurement record);
}