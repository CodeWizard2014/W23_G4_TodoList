package com.example.w23_g4_todolist.service;

import com.example.w23_g4_todolist.vo.TaskListVO;
import com.example.w23_g4_todolist.vo.TaskVO;

import java.util.ArrayList;
import java.util.List;

public class DataManager implements IDataManager {
    private List<TaskListVO> tasklists;
    private List<TaskVO> tasks;

    public DataManager() {
        // read data into tasklists and tasks
        tasklists = new ArrayList<>();
        tasks = new ArrayList<>();
    }

    public List<TaskVO> getTasks(int listID) {
        return  new ArrayList<TaskVO>();
    }

    public TaskVO getTask(int taskID){
        return null;
    }

    public void saveTask(TaskVO task){

    }

    public List<TaskListVO> getTaskLists(){
        return new ArrayList<TaskListVO>();
    }

    public TaskListVO getTaskList(int tasklistID){
        return null;
    }

    public void saveTaskList(TaskListVO tasklist){

    }

}
