package com.example.w23_g4_todolist.service;

import com.example.w23_g4_todolist.vo.TListVO;
import com.example.w23_g4_todolist.vo.TaskVO;

import java.util.List;

public interface IDataManager {

    List<TaskVO> getTasks(String listID);

    TaskVO getTask(String taskID);

    void saveTask(TaskVO task);

    List<TListVO> getTLists();

    TListVO getTList(String listID);

    void saveTList(TListVO list);
}
