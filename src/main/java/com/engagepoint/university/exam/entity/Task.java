package com.engagepoint.university.exam.entity;

import java.util.ArrayList;
import java.util.List;

public class Task {

    private String name;
    private String description;
    private TaskStatus status;
    private User assignee;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public User getAssignee() {
        return assignee;
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }

    public static List<TaskStatus> getStatusList(){
        List<TaskStatus> statusList = new ArrayList<TaskStatus>();
        statusList.add(TaskStatus.TODO);
        statusList.add(TaskStatus.IN_PROGRESS);
        statusList.add(TaskStatus.ON_QA);
        statusList.add(TaskStatus.DONE);
        return statusList;
    }
}

