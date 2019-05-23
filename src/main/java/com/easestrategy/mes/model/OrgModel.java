package com.easestrategy.mes.model;

import com.easestrategy.mes.entity.Factory;
import com.easestrategy.mes.entity.Workshop;

import java.util.Date;

public class OrgModel {

    private Integer id;

    private String name;

    private String code;

    private String addr;

    private String postcode;

    private String manager;

    private String contact;

    private Integer factoryOrder;

    private String remark;

    private Integer status;

    private Date createTime;

    private Date modifyTime;

    private Integer factoryId;

    private Integer workshopOrder;

    private Integer wareHouseId;

    private Integer lineOrder;

    private Integer areaId;

    private Integer siteOrder;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Integer getFactoryOrder() {
        return factoryOrder;
    }

    public void setFactoryOrder(Integer factoryOrder) {
        this.factoryOrder = factoryOrder;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }

    public Integer getWorkshopOrder() {
        return workshopOrder;
    }

    public void setWorkshopOrder(Integer workshopOrder) {
        this.workshopOrder = workshopOrder;
    }

    public Integer getWareHouseId() {
        return wareHouseId;
    }

    public void setWareHouseId(Integer wareHouseId) {
        this.wareHouseId = wareHouseId;
    }

    public Integer getLineOrder() {
        return lineOrder;
    }

    public void setLineOrder(Integer lineOrder) {
        this.lineOrder = lineOrder;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getSiteOrder() {
        return siteOrder;
    }

    public void setSiteOrder(Integer siteOrder) {
        this.siteOrder = siteOrder;
    }


    public Factory transToFactory(){
        Factory factory = new Factory();
        factory.setAddr(this.addr);
        factory.setCode(this.code);
        factory.setContact(this.contact);
        factory.setCreateTime(this.createTime);
        factory.setFactoryOrder(this.factoryOrder);
        factory.setId(this.id);
        factory.setManager(this.manager);
        factory.setModifyTime(this.modifyTime);
        factory.setName(this.name);
        factory.setPostcode(this.postcode);
        factory.setRemark(this.remark);
        factory.setStatus(this.status);
        return factory;
    }

    public Workshop transToWorkshop(){
        Workshop workshop = new Workshop();
        workshop.setAddr(this.addr);
        workshop.setCode(this.code);
        workshop.setContact(this.contact);
        workshop.setCreateTime(this.createTime);
        workshop.setWorkshopOrder(this.workshopOrder);
        workshop.setId(this.id);
        workshop.setManager(this.manager);
        workshop.setModifyTime(this.modifyTime);
        workshop.setName(this.name);
        workshop.setWorkshopOrder(this.workshopOrder);
        workshop.setRemark(this.remark);
        workshop.setStatus(this.status);
        return workshop;
    }

    public Workshop transTo(){
        Workshop workshop = new Workshop();
        workshop.setAddr(this.addr);
        workshop.setCode(this.code);
        workshop.setContact(this.contact);
        workshop.setCreateTime(this.createTime);
        workshop.setWorkshopOrder(this.workshopOrder);
        workshop.setId(this.id);
        workshop.setManager(this.manager);
        workshop.setModifyTime(this.modifyTime);
        workshop.setName(this.name);
        workshop.setWorkshopOrder(this.workshopOrder);
        workshop.setRemark(this.remark);
        workshop.setStatus(this.status);
        return workshop;
    }






}
