package com.example.w23_g4_todolist.task;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.example.w23_g4_todolist.R;
import com.example.w23_g4_todolist.service.GlobalVar;
import com.example.w23_g4_todolist.vo.TaskVO;

import java.util.List;

public class TaskListAdapter extends BaseAdapter{

    private List<TaskVO> tasks;

    public TaskListAdapter() {
    }

    public List<TaskVO> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskVO> tasks) {
        this.tasks = tasks;
    }

    @Override
    public int getCount() {
        return tasks.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_task, viewGroup, false);
        }

        TextView tvTitle = view.findViewById(R.id.tvTitle);
        CheckBox cbStatus = view.findViewById(R.id.cbStatus);

        TaskVO task = tasks.get(i);
        tvTitle.setText(task.getTitle());
        cbStatus.setChecked(task.getDone());

        cbStatus.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                task.setDone(b);
                GlobalVar.getDataMgr().saveTask(task);
            }
        });

        tvTitle.setOnClickListener(v->{
            Intent intent = new Intent(viewGroup.getContext(), TaskModify.class);
            intent.putExtra("taskID", task.getId());
            viewGroup.getContext().startActivity(intent);
        });

        return view;
    }
}
