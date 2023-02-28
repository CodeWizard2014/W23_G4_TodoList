package com.example.w23_g4_todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.w23_g4_todolist.service.GlobalVar;
import com.example.w23_g4_todolist.vo.TListVO;

import java.util.List;

public class AddListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_list);

        Button btnCancel = findViewById(R.id.btnNewListCancel);
        btnCancel.setOnClickListener(view -> {
            Intent intent = new Intent(AddListActivity.this, MainActivity.class);
            startActivity(intent);
        });

        Button btnOk = findViewById(R.id.btnNewListOk);
        btnOk.setOnClickListener(view -> {

            TextView listName = findViewById(R.id.tvNewListNameValue);
            if (listName.getText().toString().isEmpty()) {
                Toast.makeText(this,
                        "Name cannot be empty",
                        Toast.LENGTH_SHORT).show();
            } else {
                GlobalVar.getDataMgr().getTLists().size();
                TListVO item = new TListVO(
                        String.valueOf(GlobalVar.getDataMgr().getTLists().size() + 1),
                        listName.getText().toString()
                );
                GlobalVar.getDataMgr().saveTList(item);

                Intent intent = new Intent(AddListActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
                recreate();
            }
        });
    }
}