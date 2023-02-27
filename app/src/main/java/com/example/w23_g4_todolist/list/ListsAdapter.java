package com.example.w23_g4_todolist.list;

import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import com.example.w23_g4_todolist.R;
import com.example.w23_g4_todolist.vo.TListVO;
import com.example.w23_g4_todolist.vo.TaskVO;

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
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (view == null){
            view = LayoutInflater.from(viewGroup.getContext()).inflate(android.R.layout.simple_list_item_1, viewGroup, false);
        }

        

        return view;
    }
}
