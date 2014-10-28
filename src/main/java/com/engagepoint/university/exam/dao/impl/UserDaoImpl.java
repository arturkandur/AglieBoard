package com.engagepoint.university.exam.dao.impl;

import com.engagepoint.university.exam.dao.UserDao;
import com.engagepoint.university.exam.entity.User;
import com.engagepoint.university.exam.repository.DataRepository;

import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

public class UserDaoImpl implements UserDao, Serializable {

    @Inject
    DataRepository dataRepository;

    public List<User> getAll() {
        return dataRepository.getUserList();
    }

    public void save(User user) {
        List<User> userList = dataRepository.getUserList();
        userList.add(user);
        dataRepository.setUserList(userList);

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void remove(User user) {

    }
}
