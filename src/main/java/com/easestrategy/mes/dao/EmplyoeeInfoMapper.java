package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.EmplyoeeInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface EmplyoeeInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmplyoeeInfo record);

    int insertSelective(EmplyoeeInfo record);

    EmplyoeeInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmplyoeeInfo record);

    int updateByPrimaryKey(EmplyoeeInfo record);
}