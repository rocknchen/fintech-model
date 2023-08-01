package com.hthk.fintech.model.task.dto;

import com.hthk.fintech.enumration.TaskTypeEnum;

import java.util.List;

public class ScheduledTaskReqDTO {

    private TaskTypeEnum type;

    private String cronExpression;

    private String taskId;

    private List<String> taskIdList;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public TaskTypeEnum getType() {
        return type;
    }

    public void setType(TaskTypeEnum type) {
        this.type = type;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public List<String> getTaskIdList() {
        return taskIdList;
    }

    public void setTaskIdList(List<String> taskIdList) {
        this.taskIdList = taskIdList;
    }

}
