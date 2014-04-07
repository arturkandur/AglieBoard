package com.engagepoint.university.exam.dao;

import com.engagepoint.university.exam.entity.Task;
import com.engagepoint.university.exam.entity.User;
import com.engagepoint.university.exam.repository.DataRepository;

import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

public class UserDao implements Serializable {

    @Inject
    DataRepository dataRepository;

    public List<User> getAll(){
        return dataRepository.getUserList();
    }


}
