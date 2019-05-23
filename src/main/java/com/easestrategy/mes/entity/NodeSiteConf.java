package com.easestrategy.mes.entity;

import java.util.Date;

public class NodeSiteConf {
    private Integer id;

    private Integer nodeId;

    private Boolean productDetect;

    private Boolean materialDetect;

    private Integer entryProductType;

    private Integer entryProduct;

    private Integer outProductType;

    private Integer ouProduct;

    private Integer status;

    private Date createTime;

    private Date modifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    public Boolean getProductDetect() {
        return productDetect;
    }

    public void setProductDetect(Boolean productDetect) {
        this.productDetect = productDetect;
    }

    public Boolean getMaterialDetect() {
        return materialDetect;
    }

    public void setMaterialDetect(Boolean materialDetect) {
        this.materialDetect = materialDetect;
    }

    public Integer getEntryProductType() {
        return entryProductType;
    }

    public void setEntryProductType(Integer entryProductType) {
        this.entryProductType = entryProductType;
    }

    public Integer getEntryProduct() {
        return entryProduct;
    }

    public void setEntryProduct(Integer entryProduct) {
        this.entryProduct = entryProduct;
    }

    public Integer getOutProductType() {
        return outProductType;
    }

    public void setOutProductType(Integer outProductType) {
        this.outProductType = outProductType;
    }

    public Integer getOuProduct() {
        return ouProduct;
    }

    public void setOuProduct(Integer ouProduct) {
        this.ouProduct = ouProduct;
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