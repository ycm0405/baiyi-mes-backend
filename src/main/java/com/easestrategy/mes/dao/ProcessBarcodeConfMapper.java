package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.ProcessBarcodeConf;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessBarcodeConfMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProcessBarcodeConf record);

    int insertSelective(ProcessBarcodeConf record);

    ProcessBarcodeConf selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProcessBarcodeConf record);

    int updateByPrimaryKey(ProcessBarcodeConf record);
}