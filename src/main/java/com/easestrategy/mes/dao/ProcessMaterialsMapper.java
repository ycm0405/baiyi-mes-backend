package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.ProcessMaterials;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessMaterialsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProcessMaterials record);

    int insertSelective(ProcessMaterials record);

    ProcessMaterials selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProcessMaterials record);

    int updateByPrimaryKey(ProcessMaterials record);
}