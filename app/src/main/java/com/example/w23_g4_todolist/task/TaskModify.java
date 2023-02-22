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

        int taskID = (int)savedInstanceState.get("taskID");
        task = GlobalVar.getDataMgr().getTask(taskID);


    }

    private void saveTask(){
        TaskVO task = null;
        GlobalVar.getDataMgr().saveTask(task);
    }
}