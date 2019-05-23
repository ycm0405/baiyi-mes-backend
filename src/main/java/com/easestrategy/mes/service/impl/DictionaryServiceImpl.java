package com.easestrategy.mes.service.impl;

import com.easestrategy.mes.dao.DictTypeMapper;
import com.easestrategy.mes.dao.DictTypeDetailMapper;
import com.easestrategy.mes.entity.DictType;
import com.easestrategy.mes.entity.DictTypeDetail;
import com.easestrategy.mes.model.DictTypeDetailModel;
import com.easestrategy.mes.model.DictTypeModel;
import com.easestrategy.mes.service.DictionaryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service(value = "dictionaryService")
public class DictionaryServiceImpl implements DictionaryService {
    @Autowired
    DictTypeMapper dictTypeMapper;
    @Autowired
    DictTypeDetailMapper dictTypeDetailMapper;

    @Override
    public boolean addDictType(DictType dictType) {
        int i = dictTypeMapper.insert(dictType);
        return i>0?true:false;
    }

    @Override
    public boolean delDictType(List<Integer> typeIds) {
        return false;
    }

    @Override
    public boolean updateDictType(DictType dictType) {
        int i = dictTypeMapper.updateByPrimaryKey(dictType);
        return i>0?true:false;
    }

    @Override
    public PageInfo<DictTypeModel> getDictTypeList(String name, int pageId, int pageSize) {
        PageHelper.startPage(pageId, pageSize);
        List<DictTypeModel> dictType = dictTypeMapper.selectByName(name);
        PageInfo<DictTypeModel>result = new PageInfo<>(dictType);
        return result;
    }

    @Override
    public DictType getDictTypeById(int id) {
        DictType dicttype = dictTypeMapper.selectByPrimaryKey(id);
        return dicttype;
    }
    @Override
    public boolean addDictDetail(DictTypeDetail dictDetail){
        int i = dictTypeDetailMapper.insert(dictDetail);
        return i>0?true:false;
    }
    @Override
    public  boolean updateDictDetail(DictTypeDetail dictDetail){
        int i= dictTypeDetailMapper.updateByPrimaryKey(dictDetail);
        return i>0?true:false;
    }
    @Override
    public DictTypeDetail getDictDetailById(int id){
        DictTypeDetail dictDetail = dictTypeDetailMapper.selectByPrimaryKey(id);
        return dictDetail;
    }
    @Override
    public PageInfo<DictTypeDetailModel> getDictDetailList(int dictTypeId,String name, int groupId, int pageId, int pageSize){
        PageHelper.startPage(pageId, pageSize);
        List<DictTypeDetailModel> dictDetai = dictTypeDetailMapper.selectBySearch(dictTypeId,name,groupId);
        PageInfo<DictTypeDetailModel>result = new PageInfo<>(dictDetai);
        return result;
    }

}
