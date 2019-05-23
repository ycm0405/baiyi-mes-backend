package com.easestrategy.mes.controller;

import com.easestrategy.mes.entity.DictType;
import com.easestrategy.mes.entity.DictTypeDetail;
import com.easestrategy.mes.exceptions.BussinessException;
import com.easestrategy.mes.exceptions.CommonExceptionCode;
import com.easestrategy.mes.model.DictTypeDetailModel;
import com.easestrategy.mes.model.DictTypeModel;
import com.easestrategy.mes.model.OpResult;
import com.easestrategy.mes.model.ResultUtil;
import com.easestrategy.mes.service.DictionaryService;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DictController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    DictionaryService dictionaryService;

    /**
     * @param dictType
     * @return 是否添加成功
     */
    @RequestMapping(value = "/base/dict-type/", method = RequestMethod.PUT)
    public OpResult addDictType(@RequestBody DictType dictType) {
        logger.debug("添加字典...");
        if (dictType == null) {
            logger.error("添加字典不能为空");
            throw new BussinessException(CommonExceptionCode.ILLEGAL_PARA.value(), "字典不能为空");
        }
        dictType.setStatus(1);
        boolean result = dictionaryService.addDictType(dictType);

        if (result) {
            logger.debug("添加字典成功...");
        }
        return ResultUtil.success(result);

    }

    /**
     * @param dictType
     * @param id 字典id
     * @return 是否修改成功
     */
    @RequestMapping(value = "/base/dict-type/{id}/", method = RequestMethod.PATCH)
    public OpResult updateDictType(@PathVariable int id, @RequestBody DictType dictType) {
        logger.debug("修改字典...");
        dictType.setId(id);
        dictType.setStatus(1);
        boolean result = dictionaryService.updateDictType(dictType);
        return ResultUtil.success(result);
    }

    /**
     * @param id 字典id
     * @return 是否删除成功
     */
    @RequestMapping(value = "/base/dict-type/{id}/", method = RequestMethod.DELETE)
    public OpResult deleteDictType(@PathVariable int id) {
        logger.debug("删除字典... id:" + id);
        DictType dictType = dictionaryService.getDictTypeById(id);
        dictType.setStatus(0);
        boolean result = dictionaryService.updateDictType(dictType);
        return ResultUtil.success(result);
    }


    /**
     * 批量删除
     */

    @RequestMapping(value="/base/dict-types/", method = RequestMethod.DELETE)

    public OpResult deleteDictTypes(@RequestBody Map<String,int[]> ids){
        int[] idlist =ids.get("ids");
        logger.debug("删除字典... ids:" + idlist);

        int count =0;
        String res="";
        for(int i = 0;i<idlist.length;i++){
            DictType dictType = dictionaryService.getDictTypeById(idlist[i]);

            if(dictType!=null&&dictType.getCode()!="system"){
                dictType.setStatus(0);
                boolean result = dictionaryService.updateDictType(dictType);
                if(result){
                    count++;
                    res+=dictType.getId()+",";
                }
            }

        }
        return ResultUtil.success("共成功删除"+count+"条数据:"+res);
    }
    /**
     * @param id 字典id
     * @return 单个字典数据
     */
    @RequestMapping(value = "/base/dict-type/{id}/", method = RequestMethod.GET)
    public OpResult getDictTypeById(@PathVariable int id) {
        logger.debug("查询单个字典... id:" + id);
        DictType dictType = dictionaryService.getDictTypeById(id);
        return ResultUtil.success(dictType);
    }

    /**
     * @param name
     * @param pageId
     * @param pageSize
     * @return 查询字典列表
     */
    @RequestMapping(value = "/base/dict-types/", method = RequestMethod.GET)
    public OpResult getDictTypes(
            @RequestParam(defaultValue = "") String name,
            @RequestParam(defaultValue = "1") int pageId,
            @RequestParam(defaultValue = "10") int pageSize
    ) {
        logger.debug("查询单个字典... id:" + name);
        if (StringUtils.isEmpty(name)) {
            name = null;
        }
        PageInfo<DictTypeModel> dictTypeList = dictionaryService.getDictTypeList(name, pageId, pageSize);

        HashMap<String, Object> data = new HashMap<>();
        data.put("dictTypeList", dictTypeList.getList());
        data.put("pageNum", dictTypeList.getPageNum());
        data.put("total", dictTypeList.getTotal());
        data.put("pageSize", dictTypeList.getPageSize());
        data.put("pages", dictTypeList.getPages());

        return ResultUtil.success(data);
    }


    /**
     * 添加字段
     * @param dictDetail
     * @param id 字典id
     * @return 是否添加成功
     */
    @RequestMapping(value = "/base/dict-type/{id}/dict-detail/", method = RequestMethod.PUT)

    public OpResult addDictDetail(@PathVariable int id, @RequestBody DictTypeDetail dictDetail) {

        logger.debug("添加字段...");
        dictDetail.setDictType(id);
        dictDetail.setStatus(1);
        DictType dictType = dictionaryService.getDictTypeById(id);

        if (dictType.getId() != id) {
            logger.error("字段相关字典不存在");
            throw new BussinessException(CommonExceptionCode.ILLEGAL_PARA.value(), "相关字典不存在");
        }

        boolean result = dictionaryService.addDictDetail(dictDetail);
        return ResultUtil.success(result);
    }

    /**
     * 修改字段
     * @param dictDetail
     * @param id 字段id
     * @return 是否修改成功
     */
    @RequestMapping(value = "/base/dict-detail/{id}/", method = RequestMethod.PATCH)
    public OpResult updateDictDetail(@PathVariable int id, @RequestBody DictTypeDetail dictDetail) {
        logger.debug("修改字段..." + id);
        DictTypeDetail _dictDetail = dictionaryService.getDictDetailById(id);
        dictDetail.setId(id);
        dictDetail.setStatus(1);
        dictDetail.setDictType(_dictDetail.getDictType());
        boolean result = dictionaryService.updateDictDetail(dictDetail);
        return ResultUtil.success(result);
    }

    /**
     * 批量删除字段
     */
    @RequestMapping(value="/base/dict-details/", method = RequestMethod.DELETE)

    public OpResult deleteDictDetails(@RequestBody Map<String,int[]> ids){
        int[] idlist =ids.get("ids");
        int count =0;
        String res="";
        logger.debug("删除字段... ids:" + idlist);
        for(int i = 0;i<idlist.length;i++){
            DictTypeDetail dictDetail = dictionaryService.getDictDetailById(idlist[i]);
            dictDetail.setStatus(0);
            boolean result = dictionaryService.updateDictDetail(dictDetail);
            if(result){
                count++;
                res+=dictDetail.getId()+",";
            }
        }

        return ResultUtil.success("共成功删除"+count+"条数据:"+res);
    }


    /**
     * 删除字段
     * @param id 字典id
     * @return 是否删除成功
     */
    @RequestMapping(value = "/base/dict-detail/{id}/", method = RequestMethod.DELETE)
    public OpResult deleteDictDetail(@PathVariable int id) {
        logger.debug("删除字段... id:" + id);
        DictTypeDetail dictDetail = dictionaryService.getDictDetailById(id);
        dictDetail.setId(id);
        dictDetail.setStatus(0);
        boolean result = dictionaryService.updateDictDetail(dictDetail);
        return ResultUtil.success(result);
    }


    /**
     * 单个字段数据查询
     *
     * @param id 字典id
     * @return 单个字段数据
     */
    @RequestMapping(value = "/base/dict-type/{id}/dict-detail/", method = RequestMethod.GET)
    public OpResult getDictDetailById(@PathVariable int id) {
        logger.debug("查询单个字段... id:" + id);
        DictTypeDetail dictDetail = dictionaryService.getDictDetailById(id);
        return ResultUtil.success(dictDetail);
    }


    /**
     * 查询字段列表
     * @param name
     * @param id
     * @param groupId
     * @param pageId
     * @param pageSize
     */
    @RequestMapping(value = "/base/dict-type/{id}/dict-details/", method = RequestMethod.GET)
    public OpResult getDictDetails(
            @PathVariable int id,
            @RequestParam(defaultValue = "") String name,
            @RequestParam(defaultValue = "0") int groupId,
            @RequestParam(defaultValue = "1") int pageId,
            @RequestParam(defaultValue = "10") int pageSize
    ) {
        logger.debug("查询字段列表:" + name);
        if (StringUtils.isEmpty(name)) {
            name = null;
        }
        PageInfo<DictTypeDetailModel> dictDetailList = dictionaryService.getDictDetailList(id, name, groupId, pageId, pageSize);
        HashMap<String, Object> data = new HashMap<>();
        data.put("dictDetailList", dictDetailList.getList());
        data.put("pageNum", dictDetailList.getPageNum());
        data.put("total", dictDetailList.getTotal());
        data.put("pageSize", dictDetailList.getPageSize());
        data.put("pages", dictDetailList.getPages());
        return ResultUtil.success(data);
    }

}


