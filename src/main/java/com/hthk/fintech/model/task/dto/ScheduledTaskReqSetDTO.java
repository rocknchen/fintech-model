package com.hthk.fintech.model.task.dto;

import java.util.List;

public class ScheduledTaskReqSetDTO {

    private List<ScheduledTaskReqDTO> taskList;

    public List<ScheduledTaskReqDTO> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<ScheduledTaskReqDTO> taskList) {
        this.taskList = taskList;
    }
}
