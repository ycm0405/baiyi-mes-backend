package com.easestrategy.mes.entity;

import java.util.Date;

public class ProcessBarcodeConf {
    private Integer id;

    private Integer lineId;

    private Boolean isPasteBarcode;

    private Integer pasteBarcodeType;

    private String propertyKey;

    private String propertyValue;

    private String packageRule;

    private Integer status;

    private Date createTime;

    private Date modifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public Boolean getIsPasteBarcode() {
        return isPasteBarcode;
    }

    public void setIsPasteBarcode(Boolean isPasteBarcode) {
        this.isPasteBarcode = isPasteBarcode;
    }

    public Integer getPasteBarcodeType() {
        return pasteBarcodeType;
    }

    public void setPasteBarcodeType(Integer pasteBarcodeType) {
        this.pasteBarcodeType = pasteBarcodeType;
    }

    public String getPropertyKey() {
        return propertyKey;
    }

    public void setPropertyKey(String propertyKey) {
        this.propertyKey = propertyKey == null ? null : propertyKey.trim();
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue == null ? null : propertyValue.trim();
    }

    public String getPackageRule() {
        return packageRule;
    }

    public void setPackageRule(String packageRule) {
        this.packageRule = packageRule == null ? null : packageRule.trim();
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