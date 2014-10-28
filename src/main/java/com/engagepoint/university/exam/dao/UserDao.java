package com.engagepoint.university.exam.dao;

import com.engagepoint.university.exam.entity.User;

import java.util.List;

/**
 * Created by arturkandur on 24.10.14.
 */
public interface UserDao{
    public void save(User user);
    public void update(User user);
    public void remove(User user);
    public List<User> getAll();
}
