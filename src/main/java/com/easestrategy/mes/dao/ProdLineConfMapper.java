package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.ProdLineConf;

public interface ProdLineConfMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProdLineConf record);

    int insertSelective(ProdLineConf record);

    ProdLineConf selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProdLineConf record);

    int updateByPrimaryKey(ProdLineConf record);
}