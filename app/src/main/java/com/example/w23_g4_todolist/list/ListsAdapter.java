package com.example.w23_g4_todolist.list;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.w23_g4_todolist.R;
import com.example.w23_g4_todolist.TasksActivity;
import com.example.w23_g4_todolist.vo.TListVO;

import java.util.List;

public class ListsAdapter extends BaseAdapter {

    List<TListVO> lists;

    public ListsAdapter() {
    }

    public List<TListVO> getLists() {
        return lists;
    }

    public void setLists(List<TListVO> lists) {
        this.lists = lists;
    }

    @Override
    public int getCount() {
        return lists.size();
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
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_listitem, viewGroup, false);
        }

        TListVO listItem = lists.get(i);
        TextView tvListItem = view.findViewById(R.id.tvListItem);
        tvListItem.setText(listItem.getName());

        tvListItem.setOnClickListener(v -> {
            Intent intent = new Intent(viewGroup.getContext(), TasksActivity.class);
            intent.putExtra("listID", listItem.getId());
            viewGroup.getContext().startActivity(intent);
        });

        return view;
    }
}
