package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.ProcessError;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessErrorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProcessError record);

    int insertSelective(ProcessError record);

    ProcessError selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProcessError record);

    int updateByPrimaryKey(ProcessError record);
}