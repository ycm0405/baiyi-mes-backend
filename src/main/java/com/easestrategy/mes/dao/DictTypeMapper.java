package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.DictType;
import com.easestrategy.mes.model.DictTypeModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DictTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DictType record);

    int insertSelective(DictType record);

    DictType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DictType record);

    int updateByPrimaryKey(DictType record);

    List<DictTypeModel> selectByName(@Param("name") String name);

}