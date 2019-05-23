package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.ProdBarcodeInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdBarcodeInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProdBarcodeInfo record);

    int insertSelective(ProdBarcodeInfo record);

    ProdBarcodeInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProdBarcodeInfo record);

    int updateByPrimaryKey(ProdBarcodeInfo record);
}