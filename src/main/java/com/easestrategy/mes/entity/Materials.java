package com.easestrategy.mes.entity;

import java.util.Date;

public class Materials {
    private Integer id;

    private Integer name;

    private String model;

    private String category;

    private String companyMaterialsNum;

    private Integer factoryId;

    private String brand;

    private String supplierMaterialsNum;

    private String batchNum;

    private String supplier;

    private Integer inventoryPosition;

    private String measureUnit;

    private Integer status;

    private Date createTime;

    private Date modifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getCompanyMaterialsNum() {
        return companyMaterialsNum;
    }

    public void setCompanyMaterialsNum(String companyMaterialsNum) {
        this.companyMaterialsNum = companyMaterialsNum == null ? null : companyMaterialsNum.trim();
    }

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getSupplierMaterialsNum() {
        return supplierMaterialsNum;
    }

    public void setSupplierMaterialsNum(String supplierMaterialsNum) {
        this.supplierMaterialsNum = supplierMaterialsNum == null ? null : supplierMaterialsNum.trim();
    }

    public String getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(String batchNum) {
        this.batchNum = batchNum == null ? null : batchNum.trim();
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public Integer getInventoryPosition() {
        return inventoryPosition;
    }

    public void setInventoryPosition(Integer inventoryPosition) {
        this.inventoryPosition = inventoryPosition;
    }

    public String getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit == null ? null : measureUnit.trim();
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