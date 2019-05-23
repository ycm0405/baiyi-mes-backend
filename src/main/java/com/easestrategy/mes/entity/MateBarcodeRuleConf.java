package com.easestrategy.mes.entity;

import java.util.Date;

public class MateBarcodeRuleConf {
    private Integer id;

    private String name;

    private String supplierPackage;

    private String barcodeconf;

    private Integer startloc;

    private Integer endloc;

    private String description;

    private Integer status;

    private Date createTime;

    private Date modifyTime;

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
        this.name = name == null ? null : name.trim();
    }

    public String getSupplierPackage() {
        return supplierPackage;
    }

    public void setSupplierPackage(String supplierPackage) {
        this.supplierPackage = supplierPackage == null ? null : supplierPackage.trim();
    }

    public String getBarcodeconf() {
        return barcodeconf;
    }

    public void setBarcodeconf(String barcodeconf) {
        this.barcodeconf = barcodeconf == null ? null : barcodeconf.trim();
    }

    public Integer getStartloc() {
        return startloc;
    }

    public void setStartloc(Integer startloc) {
        this.startloc = startloc;
    }

    public Integer getEndloc() {
        return endloc;
    }

    public void setEndloc(Integer endloc) {
        this.endloc = endloc;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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