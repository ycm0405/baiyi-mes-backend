package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.MateBarcodeRuleConf;

public interface MateBarcodeRuleConfMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MateBarcodeRuleConf record);

    int insertSelective(MateBarcodeRuleConf record);

    MateBarcodeRuleConf selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MateBarcodeRuleConf record);

    int updateByPrimaryKey(MateBarcodeRuleConf record);
}