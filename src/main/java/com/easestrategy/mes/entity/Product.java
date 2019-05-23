package com.easestrategy.mes.entity;

import java.util.Date;

public class Product {
    private Integer id;

    private String productName;

    private String productModel;

    private String productMaterialsNum;

    private String productVersion;

    private Integer barcodeRuleId;

    private Integer productType;

    private Integer status;

    private Date createTime;

    private Date modifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel == null ? null : productModel.trim();
    }

    public String getProductMaterialsNum() {
        return productMaterialsNum;
    }

    public void setProductMaterialsNum(String productMaterialsNum) {
        this.productMaterialsNum = productMaterialsNum == null ? null : productMaterialsNum.trim();
    }

    public String getProductVersion() {
        return productVersion;
    }

    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion == null ? null : productVersion.trim();
    }

    public Integer getBarcodeRuleId() {
        return barcodeRuleId;
    }

    public void setBarcodeRuleId(Integer barcodeRuleId) {
        this.barcodeRuleId = barcodeRuleId;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
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