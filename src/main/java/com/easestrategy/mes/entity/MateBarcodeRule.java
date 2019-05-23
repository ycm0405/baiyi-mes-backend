package com.easestrategy.mes.entity;

import java.util.Date;

public class MateBarcodeRule {
    private Integer id;

    private String supplierPackage;

    private Integer num;

    private Integer status;

    private Date createTime;

    private Date modifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSupplierPackage() {
        return supplierPackage;
    }

    public void setSupplierPackage(String supplierPackage) {
        this.supplierPackage = supplierPackage == null ? null : supplierPackage.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
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
}