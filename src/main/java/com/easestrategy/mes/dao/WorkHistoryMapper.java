package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.WorkHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkHistory record);

    int insertSelective(WorkHistory record);

    WorkHistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WorkHistory record);

    int updateByPrimaryKey(WorkHistory record);
}