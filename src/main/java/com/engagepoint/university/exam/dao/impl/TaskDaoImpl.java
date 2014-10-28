package com.engagepoint.university.exam.dao.impl;

import com.engagepoint.university.exam.dao.TaskDao;
import com.engagepoint.university.exam.entity.Task;
import com.engagepoint.university.exam.entity.User;
import com.engagepoint.university.exam.repository.DataRepository;

import javax.inject.Inject;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public class TaskDaoImpl implements TaskDao, Serializable {

    @Inject
    DataRepository dataRepository;

    public List<Task> getAll(){
        return dataRepository.getTaskList();
    }

    public void save(Task task){
        List<Task> taskList = dataRepository.getTaskList();
        taskList.add(task);
        dataRepository.setTaskList(taskList);

        for(User user : dataRepository.getUserList()){
            if(user == task.getAssignee()){
                user.getTaskList().add(task);
            }
        }
    }

    public void update(Task task){
        for(User user : dataRepository.getUserList()){
            for(Iterator<Task> it = user.getTaskList().iterator(); it.hasNext();){
                Task tempTask = it.next();
                if(tempTask.getName().equalsIgnoreCase(task.getName())){
                    it.remove();
                }
            }

        }

        for(User user : dataRepository.getUserList()){
            if(user == task.getAssignee()){
                user.getTaskList().add(task);
            }
        }

    }


}
