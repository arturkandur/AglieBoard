package com.engagepoint.university.exam.dao;

import com.engagepoint.university.exam.entity.Task;

import java.util.List;

/**
 * Created by arturkandur on 24.10.14.
 */
public interface TaskDao {
    public void save(Task task);
    public void update(Task task);
    public List<Task> getAll();
}
