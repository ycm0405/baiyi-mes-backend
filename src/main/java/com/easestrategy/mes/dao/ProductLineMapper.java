package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.ProductLine;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductLineMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductLine record);

    int insertSelective(ProductLine record);

    ProductLine selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductLine record);

    int updateByPrimaryKey(ProductLine record);
}