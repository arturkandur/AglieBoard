package com.engagepoint.university.exam.entity;

import java.util.ArrayList;
import java.util.List;

public class Task {
    public static final String STATUS_TODO = "TODO";
    public static final String STATUS_INPROGRESS = "INPROGRESS";
    public static final String STATUS_ON_QA = "ON QA";
    public static final String STATUS_DONE = "DONE";

    private String name;
    private String description;
    private String status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getAssignee() {
        return assignee;
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }

    public static List<String> getStatusList(){
        List<String> statusList = new ArrayList<String>();
        statusList.add(STATUS_TODO);
        statusList.add(STATUS_INPROGRESS);
        statusList.add(STATUS_ON_QA);
        statusList.add(STATUS_DONE);
        return statusList;
    }
}
