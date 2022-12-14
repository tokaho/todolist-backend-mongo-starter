package com.afs.todolist.controller.dto;

public class TodoUpdateRequest {
    private Boolean done;
    private String text;

    public TodoUpdateRequest() {
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
