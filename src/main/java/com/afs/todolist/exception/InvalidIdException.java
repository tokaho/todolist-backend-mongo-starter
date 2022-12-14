package com.afs.todolist.exception;

import java.text.MessageFormat;

public class InvalidIdException extends RuntimeException{

    public InvalidIdException(String id) {
        super(MessageFormat.format("todo id {0} is invalid", id));
    }
}
