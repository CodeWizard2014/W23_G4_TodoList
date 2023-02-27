package com.example.w23_g4_todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.w23_g4_todolist.service.FakeData;
import com.example.w23_g4_todolist.service.GlobalVar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GlobalVar.setDataMgr(new FakeData());
    }
}