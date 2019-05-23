package com.easestrategy.mes.entity;

import java.util.Date;

public class PkgBoxRule {
    private Integer id;

    private String packageNum;

    private Integer smallBagNum;

    private Integer middleBagNum;

    private Integer bigBagNum;

    private Integer status;

    private Date createTime;

    private Date modifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPackageNum() {
        return packageNum;
    }

    public void setPackageNum(String packageNum) {
        this.packageNum = packageNum == null ? null : packageNum.trim();
    }

    public Integer getSmallBagNum() {
        return smallBagNum;
    }

    public void setSmallBagNum(Integer smallBagNum) {
        this.smallBagNum = smallBagNum;
    }

    public Integer getMiddleBagNum() {
        return middleBagNum;
    }

    public void setMiddleBagNum(Integer middleBagNum) {
        this.middleBagNum = middleBagNum;
    }

    public Integer getBigBagNum() {
        return bigBagNum;
    }

    public void setBigBagNum(Integer bigBagNum) {
        this.bigBagNum = bigBagNum;
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