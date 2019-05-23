package com.easestrategy.mes.entity;

import java.util.Date;

public class MateBarcodeInfo {
    private Integer id;

    private Integer supplierPackage;

    private String supplierBarcode;

    private Integer barcodeRuleId;

    private Integer status;

    private Date createTime;

    private Date modifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSupplierPackage() {
        return supplierPackage;
    }

    public void setSupplierPackage(Integer supplierPackage) {
        this.supplierPackage = supplierPackage;
    }

    public String getSupplierBarcode() {
        return supplierBarcode;
    }

    public void setSupplierBarcode(String supplierBarcode) {
        this.supplierBarcode = supplierBarcode == null ? null : supplierBarcode.trim();
    }

    public Integer getBarcodeRuleId() {
        return barcodeRuleId;
    }

    public void setBarcodeRuleId(Integer barcodeRuleId) {
        this.barcodeRuleId = barcodeRuleId;
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