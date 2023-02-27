package com.example.w23_g4_todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.w23_g4_todolist.service.FakeData;
import com.example.w23_g4_todolist.service.GlobalVar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GlobalVar.setDataMgr(new FakeData());

        Button btnShowTasks = findViewById(R.id.btnTasks);
        btnShowTasks.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, TasksActivity.class);
            intent.putExtra("listID", "1");
            startActivity(intent);
        });
    }
}