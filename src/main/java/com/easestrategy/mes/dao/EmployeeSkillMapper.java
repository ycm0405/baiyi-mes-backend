package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.EmployeeSkill;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeSkillMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeSkill record);

    int insertSelective(EmployeeSkill record);

    EmployeeSkill selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployeeSkill record);

    int updateByPrimaryKey(EmployeeSkill record);
}