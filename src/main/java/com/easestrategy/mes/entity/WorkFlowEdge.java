package com.easestrategy.mes.entity;

import java.util.Date;

public class WorkFlowEdge {
    private Integer id;

    private Integer 节点id;

    private String source;

    private String target;

    private String labeltext;

    private Integer status;

    private Date createTime;

    private Date modifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer get节点id() {
        return 节点id;
    }

    public void set节点id(Integer 节点id) {
        this.节点id = 节点id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    public String getLabeltext() {
        return labeltext;
    }

    public void setLabeltext(String labeltext) {
        this.labeltext = labeltext == null ? null : labeltext.trim();
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