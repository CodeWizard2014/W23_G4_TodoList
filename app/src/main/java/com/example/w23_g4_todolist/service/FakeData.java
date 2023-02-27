package com.example.w23_g4_todolist.service;

import com.example.w23_g4_todolist.task.Task;
import com.example.w23_g4_todolist.vo.TListVO;
import com.example.w23_g4_todolist.vo.TaskVO;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class FakeData implements IDataManager {
    protected Map<String, TListVO> lists;
    protected Map<String, TaskVO> tasks;

    public FakeData() {
        lists = new HashMap<>();
        tasks = new HashMap<>();

        lists.put("1", new TListVO("1", "school"));
        lists.put("2", new TListVO("2", "work"));

        tasks.put("1", new TaskVO("1", "1", "test title1", true, new Date(), new String[]{"exam"}));
        tasks.put("2", new TaskVO("2", "1", "test title2", false, new Date(), new String[]{"asg"}));
        tasks.put("3", new TaskVO("3", "2", "test title3", true, new Date(), new String[]{"meeting"}));
        tasks.put("4", new TaskVO("4", "2", "test title4", false, new Date(), new String[]{"report"}));
    }

    @Override
    public List<TaskVO> getTasks(String listID) {
        List<TaskVO> ret = new ArrayList<TaskVO>();

        for(TaskVO task : tasks.values()){
            if(task.getId().equals(listID))
                ret.add(task);
        }

        return ret;
    }

    @Override
    public TaskVO getTask(String taskID){
        return tasks.get(taskID);
    }

    @Override
    public void saveTask(TaskVO task){
        tasks.put(task.getId(), task);
    }

    @Override
    public List<TListVO> getTLists() {
        return new ArrayList<>(lists.values());
    }

    @Override
    public TListVO getTList(String listID) {
        return lists.get(listID);
    }

    @Override
    public void saveTList(TListVO list) {
        lists.put(list.getId(), list);
    }


}
