package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.ProdBarcodeRule;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdBarcodeRuleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProdBarcodeRule record);

    int insertSelective(ProdBarcodeRule record);

    ProdBarcodeRule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProdBarcodeRule record);

    int updateByPrimaryKey(ProdBarcodeRule record);
}