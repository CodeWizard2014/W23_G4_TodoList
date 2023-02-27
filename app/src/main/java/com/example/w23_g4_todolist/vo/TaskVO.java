package com.example.w23_g4_todolist.vo;

import java.util.Date;

public class TaskVO {

    public TaskVO(String id, String listID, String title, Boolean done, Date due, String[] tags) {
        this.id = id;
        this.listID = listID;
        this.title = title;
        this.done = done;
        this.due = due;
        this.tags = tags;
    }

    private String id;

    private String listID;

    private String title;
    private Boolean done;
    private Date due;
    private String[] tags;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getListID() {
        return listID;
    }

    public void setListID(String listID) {
        this.listID = listID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public Date getDue() {
        return due;
    }

    public void setDue(Date due) {
        this.due = due;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}
