package com.example.w23_g4_todolist.service;

import com.example.w23_g4_todolist.vo.TaskListVO;
import com.example.w23_g4_todolist.vo.TaskVO;

import java.util.List;

public interface IDataManager {
    List<TaskVO> getTasks(int listID);
    TaskVO getTask(int taskID);

    void saveTask(TaskVO task);

    List<TaskListVO> getTaskLists();

    TaskListVO getTaskList(int tasklistID);

    void saveTaskList(TaskListVO tasklist);
}
