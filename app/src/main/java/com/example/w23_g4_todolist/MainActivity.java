package com.example.w23_g4_todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.w23_g4_todolist.list.ListsAdapter;
import com.example.w23_g4_todolist.service.FakeData;
import com.example.w23_g4_todolist.service.GlobalVar;
import com.example.w23_g4_todolist.vo.TListVO;
import com.example.w23_g4_todolist.vo.TaskVO;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GlobalVar.setDataMgr(new FakeData());

        ListView listMyLists = findViewById(R.id.listMyLists);
        ListsAdapter adapter = new ListsAdapter();
        adapter.setLists(GlobalVar.getDataMgr().getTLists());
        listMyLists.setAdapter(adapter);

        Button btnAddList = findViewById(R.id.btnAddList);
        btnAddList.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, AddListActivity.class);
            startActivity(intent);
        });
    }
}