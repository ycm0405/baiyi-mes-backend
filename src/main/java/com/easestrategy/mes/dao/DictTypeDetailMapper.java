package com.easestrategy.mes.dao;

import com.easestrategy.mes.entity.DictTypeDetail;
import com.easestrategy.mes.model.DictTypeDetailModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DictTypeDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DictTypeDetail record);

    int insertSelective(DictTypeDetail record);

    DictTypeDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DictTypeDetail record);

    int updateByPrimaryKey(DictTypeDetail record);

    List<DictTypeDetailModel> selectBySearch(@Param("dictTypeId") int dictTypeId, @Param("name") String name,@Param("groupId") int groupId);
}