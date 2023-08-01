package com.hthk.fintech.model.event;

import com.hthk.fintech.enumration.EventProcessStatusEnum;

import java.util.List;

public class EngineCriteria {

    private String name;

    private List<EventProcessStatusEnum> statusList;

    public EngineCriteria() {
    }

    public EngineCriteria(String name, List<EventProcessStatusEnum> statusList) {
        this.name = name;
        this.statusList = statusList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<EventProcessStatusEnum> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<EventProcessStatusEnum> statusList) {
        this.statusList = statusList;
    }
}
