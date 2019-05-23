package com.easestrategy.mes.entity;

import java.util.Date;

public class Procurement {
    private Integer id;

    private Integer equipmentId;

    private Integer emplyoeeId;

    private String supplier;

    private String supplyAddress;

    private String supplierLiaison;

    private String liaisonsTel;

    private String liaisonsMail;

    private String purchasePrice;

    private Integer status;

    private Date createTime;

    private Date modifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    public Integer getEmplyoeeId() {
        return emplyoeeId;
    }

    public void setEmplyoeeId(Integer emplyoeeId) {
        this.emplyoeeId = emplyoeeId;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public String getSupplyAddress() {
        return supplyAddress;
    }

    public void setSupplyAddress(String supplyAddress) {
        this.supplyAddress = supplyAddress == null ? null : supplyAddress.trim();
    }

    public String getSupplierLiaison() {
        return supplierLiaison;
    }

    public void setSupplierLiaison(String supplierLiaison) {
        this.supplierLiaison = supplierLiaison == null ? null : supplierLiaison.trim();
    }

    public String getLiaisonsTel() {
        return liaisonsTel;
    }

    public void setLiaisonsTel(String liaisonsTel) {
        this.liaisonsTel = liaisonsTel == null ? null : liaisonsTel.trim();
    }

    public String getLiaisonsMail() {
        return liaisonsMail;
    }

    public void setLiaisonsMail(String liaisonsMail) {
        this.liaisonsMail = liaisonsMail == null ? null : liaisonsMail.trim();
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice == null ? null : purchasePrice.trim();
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