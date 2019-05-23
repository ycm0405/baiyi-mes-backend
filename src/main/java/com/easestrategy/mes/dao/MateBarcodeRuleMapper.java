package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.MateBarcodeRule;
import org.springframework.stereotype.Repository;

@Repository
public interface MateBarcodeRuleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MateBarcodeRule record);

    int insertSelective(MateBarcodeRule record);

    MateBarcodeRule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MateBarcodeRule record);

    int updateByPrimaryKey(MateBarcodeRule record);
}