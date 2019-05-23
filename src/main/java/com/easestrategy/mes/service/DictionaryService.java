package com.easestrategy.mes.service;

import com.easestrategy.mes.entity.DictType;
import com.easestrategy.mes.entity.DictTypeDetail;
import com.easestrategy.mes.model.DictTypeModel;
import com.easestrategy.mes.model.DictTypeDetailModel;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 字典服务类
 */
public interface DictionaryService {
    /**
     * 添加字典
     *
     * @param dictType 字典信息
     * @return
     */
    public boolean addDictType(DictType dictType);

    /**
     * 删除字典
     *
     * @param typeIds 字典id 集合
     * @return
     */
    public boolean delDictType(List<Integer> typeIds);

    /**
     * 修改字典
     *
     * @param dictType 字典信息
     * @return
     */
    public boolean updateDictType(DictType dictType);

    /**
     * 查询字典列表
     *
     * @param
     * @return
     */
    public PageInfo<DictTypeModel> getDictTypeList(String name, int pageId, int pageSize);


    /**
     * 根据id查询字典
     *
     * @param
     * @return
     */
    public DictType getDictTypeById(int id);


    /**
     * 添加字段
     *
     * @param id 字典id
     * @return
     */
    public boolean addDictDetail(DictTypeDetail dictDetail);


    /**
     * 修改字段
     * @param id 字段id
     * @return
     */
    public boolean updateDictDetail(DictTypeDetail dictDetail);

    /**
     * 查询字段
     * @param  id 字段id
     * @return DictTypeDetail
     *
     */
    public DictTypeDetail getDictDetailById(int id );


    /**
     * 查询字典列表
     *
     * @param
     * @return
     */
    public PageInfo<DictTypeDetailModel> getDictDetailList(int dictTypeId, String name,int groupId, int pageId, int pageSize);

}
