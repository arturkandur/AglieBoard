package com.engagepoint.university.exam.repository;


import com.engagepoint.university.exam.entity.Task;
import com.engagepoint.university.exam.entity.TaskStatus;
import com.engagepoint.university.exam.entity.User;
import com.engagepoint.university.exam.util.TaskGenerator;
import com.engagepoint.university.exam.util.UserGenerator;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Startup
@Singleton
public class DataRepository implements Serializable{

    private List<User> userList = new ArrayList<User>();

    private List<Task> taskList = new ArrayList<Task>();

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
    public void initList(){
        List<Task> tempList = new ArrayList<Task>();
        userList = UserGenerator.getRandomUserList();

        Task task = TaskGenerator.genTask();
        task.setStatus(TaskStatus.DONE);
        task.setAssignee(userList.get(0));
        taskList.add(task);
        tempList.add(task);

        task = TaskGenerator.genTask();
        task.setStatus(TaskStatus.TODO);
        task.setAssignee(userList.get(0));
        taskList.add(task);
        tempList.add(task);

        task = TaskGenerator.genTask();
        task.setStatus(TaskStatus.DONE);
        task.setAssignee(userList.get(0));
        taskList.add(task);
        tempList.add(task);
        userList.get(0).setTaskList(tempList);

        tempList = new ArrayList<Task>();

        task = TaskGenerator.genTask();
        task.setStatus(TaskStatus.IN_PROGRESS);
        task.setAssignee(userList.get(1));
        taskList.add(task);
        tempList.add(task);

        task = TaskGenerator.genTask();
        task.setStatus(TaskStatus.IN_PROGRESS);
        task.setAssignee(userList.get(1));
        taskList.add(task);
        tempList.add(task);
        userList.get(1).setTaskList(tempList);

        tempList = new ArrayList<Task>();

        task = TaskGenerator.genTask();
        task.setStatus(TaskStatus.TODO);
        task.setAssignee(userList.get(2));
        taskList.add(task);
        tempList.add(task);

        task = TaskGenerator.genTask();
        task.setStatus(TaskStatus.DONE);
        task.setAssignee(userList.get(2));
        taskList.add(task);
        tempList.add(task);

        task = TaskGenerator.genTask();
        task.setStatus(TaskStatus.TODO);
        task.setAssignee(userList.get(2));
        taskList.add(task);
        tempList.add(task);
        userList.get(2).setTaskList(tempList);

    }

}
