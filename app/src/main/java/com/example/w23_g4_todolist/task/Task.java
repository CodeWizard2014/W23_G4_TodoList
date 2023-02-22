package com.example.w23_g4_todolist.task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.w23_g4_todolist.R;

public class Task extends AppCompatActivity {

    TextView tvTitle = null;
    CheckBox cbStatus = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        tvTitle = findViewById(R.id.tvTitle);
        cbStatus = findViewById(R.id.cbStatus);
    }


}