package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.Materials;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Materials record);

    int insertSelective(Materials record);

    Materials selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Materials record);

    int updateByPrimaryKey(Materials record);
}