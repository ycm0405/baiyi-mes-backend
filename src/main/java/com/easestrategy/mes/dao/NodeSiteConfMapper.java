package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.NodeSiteConf;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeSiteConfMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NodeSiteConf record);

    int insertSelective(NodeSiteConf record);

    NodeSiteConf selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NodeSiteConf record);

    int updateByPrimaryKey(NodeSiteConf record);
}