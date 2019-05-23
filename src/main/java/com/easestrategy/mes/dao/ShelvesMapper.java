package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.Shelves;
import org.springframework.stereotype.Repository;

@Repository
public interface ShelvesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shelves record);

    int insertSelective(Shelves record);

    Shelves selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shelves record);

    int updateByPrimaryKey(Shelves record);
}