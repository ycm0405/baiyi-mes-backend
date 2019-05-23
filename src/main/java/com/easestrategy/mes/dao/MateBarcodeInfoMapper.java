package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.MateBarcodeInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface MateBarcodeInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MateBarcodeInfo record);

    int insertSelective(MateBarcodeInfo record);

    MateBarcodeInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MateBarcodeInfo record);

    int updateByPrimaryKey(MateBarcodeInfo record);
}