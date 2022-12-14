package com.afs.todolist.controller.dto;

public class TodoCreateRequest {
    private String text;

    public TodoCreateRequest() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
