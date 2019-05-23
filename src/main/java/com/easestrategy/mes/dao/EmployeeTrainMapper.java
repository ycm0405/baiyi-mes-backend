package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.EmployeeTrain;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeTrainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeTrain record);

    int insertSelective(EmployeeTrain record);

    EmployeeTrain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployeeTrain record);

    int updateByPrimaryKey(EmployeeTrain record);
}