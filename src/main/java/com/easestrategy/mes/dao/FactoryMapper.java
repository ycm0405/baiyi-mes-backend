package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.Factory;
import org.springframework.stereotype.Repository;

@Repository
public interface FactoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Factory record);

    int insertSelective(Factory record);

    Factory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Factory record);

    int updateByPrimaryKey(Factory record);
}