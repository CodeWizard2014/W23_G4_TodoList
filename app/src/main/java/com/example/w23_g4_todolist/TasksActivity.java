package com.example.w23_g4_todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.w23_g4_todolist.service.GlobalVar;
import com.example.w23_g4_todolist.task.TaskListAdapter;
import com.example.w23_g4_todolist.vo.TaskVO;

import java.util.List;

public class TasksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);

        String listID = getIntent().getStringExtra("listID");
        List<TaskVO> tasks = GlobalVar.getDataMgr().getTasks(listID);

        ListView lv = findViewById(R.id.lvTasks);
        TaskListAdapter adapter = new TaskListAdapter();
        adapter.setTasks(tasks);
        lv.setAdapter(adapter);
    }
}