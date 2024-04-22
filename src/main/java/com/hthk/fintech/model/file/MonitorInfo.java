package com.hthk.fintech.model.file;

import java.util.List;

/**
 * @Author: Rock CHEN
 * @Date: 2024/4/18 15:29
 */
public class MonitorInfo {

    private String id;

    private AccessItemTypeEnum type;

    private String referenceId;

    private String triggerExpression;

    private List<String> receiveList;

    private List<String> ccList;

    //    private List<?> handlerList;

    public List<String> getReceiveList() {
        return receiveList;
    }

    public void setReceiveList(List<String> receiveList) {
        this.receiveList = receiveList;
    }

    public List<String> getCcList() {
        return ccList;
    }

    public void setCcList(List<String> ccList) {
        this.ccList = ccList;
    }

    public String getTriggerExpression() {
        return triggerExpression;
    }

    public void setTriggerExpression(String triggerExpression) {
        this.triggerExpression = triggerExpression;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AccessItemTypeEnum getType() {
        return type;
    }

    public void setType(AccessItemTypeEnum type) {
        this.type = type;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }
}
