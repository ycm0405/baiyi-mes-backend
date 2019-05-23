package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.Workshop;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkshopMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Workshop record);

    int insertSelective(Workshop record);

    Workshop selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Workshop record);

    int updateByPrimaryKey(Workshop record);
}