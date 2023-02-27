package com.example.w23_g4_todolist.task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.w23_g4_todolist.R;
import com.example.w23_g4_todolist.service.GlobalVar;
import com.example.w23_g4_todolist.vo.TaskVO;

public class TaskModify extends AppCompatActivity {

    private TaskVO task;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_modify);

        String taskID = (String)savedInstanceState.get("taskID");
        task = GlobalVar.getDataMgr().getTask(taskID);

        // init ui

    }

    private void saveTask(){
        // update taskvo from ui

        GlobalVar.getDataMgr().saveTask(task);
    }
}