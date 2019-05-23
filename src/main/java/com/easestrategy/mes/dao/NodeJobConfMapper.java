package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.NodeJobConf;

public interface NodeJobConfMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NodeJobConf record);

    int insertSelective(NodeJobConf record);

    NodeJobConf selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NodeJobConf record);

    int updateByPrimaryKey(NodeJobConf record);
}