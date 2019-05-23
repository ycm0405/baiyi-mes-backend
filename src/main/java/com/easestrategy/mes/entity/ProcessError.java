package com.easestrategy.mes.entity;

import java.util.Date;

public class ProcessError {
    private Integer id;

    private Integer lineId;

    private Integer prodErrorType;

    private String prodErrorCode;

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

    public Integer getProdErrorType() {
        return prodErrorType;
    }

    public void setProdErrorType(Integer prodErrorType) {
        this.prodErrorType = prodErrorType;
    }

    public String getProdErrorCode() {
        return prodErrorCode;
    }

    public void setProdErrorCode(String prodErrorCode) {
        this.prodErrorCode = prodErrorCode == null ? null : prodErrorCode.trim();
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