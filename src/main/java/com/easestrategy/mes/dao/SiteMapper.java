package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.Site;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Site record);

    int insertSelective(Site record);

    Site selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Site record);

    int updateByPrimaryKey(Site record);
}