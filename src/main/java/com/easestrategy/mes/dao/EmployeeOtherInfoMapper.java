package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.EmployeeOtherInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeOtherInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeOtherInfo record);

    int insertSelective(EmployeeOtherInfo record);

    EmployeeOtherInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployeeOtherInfo record);

    int updateByPrimaryKey(EmployeeOtherInfo record);
}