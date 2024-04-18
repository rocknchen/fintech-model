package com.hthk.fintech.model.file;

/**
 * @Author: Rock CHEN
 * @Date: 2024/4/18 15:29
 */
public class MonitorInfo {

    private String id;

    private AccessItemTypeEnum type;

    private String referenceId;

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
