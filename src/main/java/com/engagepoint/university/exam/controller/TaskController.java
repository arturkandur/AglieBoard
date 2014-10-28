package com.engagepoint.university.exam.controller;

import com.engagepoint.university.exam.dao.TaskDao;
import com.engagepoint.university.exam.dao.UserDao;
import com.engagepoint.university.exam.entity.Task;
import com.engagepoint.university.exam.entity.TaskStatus;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class TaskController implements Serializable {

    private Task currentTask;

    private List<TaskStatus> statusList;

    @Inject
    private UserDao userDao;

    @Inject
    private TaskDao taskDao;

    public Task getCurrentTask() {
        return currentTask;
    }

    public void setCurrentTask(Task currentTask) {
        this.currentTask = currentTask;
    }

    public List<TaskStatus> getStatusList() {
        return statusList;
    }

    @PostConstruct
    public void init() {
        statusList = Task.getStatusList();
    }

    public void submit() {
        taskDao.update(currentTask);
    }

    public void addTask() {
        taskDao.save(currentTask);
    }


}
