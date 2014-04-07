package com.engagepoint.university.exam.controller;

import com.engagepoint.university.exam.dao.TaskDao;
import com.engagepoint.university.exam.dao.UserDao;
import com.engagepoint.university.exam.entity.Task;
import com.engagepoint.university.exam.entity.User;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class DashboardController implements Serializable {
    private List<User> userList;

    private Task newTask;

    private List<Task> taskList;

    @Inject
    private TaskDao taskDao;

    @Inject
    private UserDao userDao;

    @Inject
    private TaskController taskController;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    @PostConstruct
    public void init() {
        taskList = taskDao.getAll();
        userList = userDao.getAll();
    }

    public void refreshTable() {
        taskList = taskDao.getAll();
    }

    public Task getNewTask() {
        newTask = new Task();
        newTask.setStatus(Task.STATUS_TODO);
        newTask.setDescription("");
        newTask.setName("");

        return newTask;
    }



}
