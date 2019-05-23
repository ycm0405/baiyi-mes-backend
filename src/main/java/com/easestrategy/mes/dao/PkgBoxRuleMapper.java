package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.PkgBoxRule;

public interface PkgBoxRuleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PkgBoxRule record);

    int insertSelective(PkgBoxRule record);

    PkgBoxRule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PkgBoxRule record);

    int updateByPrimaryKey(PkgBoxRule record);
}