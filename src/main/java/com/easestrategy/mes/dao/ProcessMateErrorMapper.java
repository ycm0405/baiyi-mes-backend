package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.ProcessMateError;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessMateErrorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProcessMateError record);

    int insertSelective(ProcessMateError record);

    ProcessMateError selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProcessMateError record);

    int updateByPrimaryKey(ProcessMateError record);
}