package com.afs.todolist.service;

import com.afs.todolist.controller.dto.TodoUpdateRequest;
import com.afs.todolist.entity.Todo;
import com.afs.todolist.exception.InvalidIdException;
import com.afs.todolist.repository.TodoRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import javax.xml.ws.http.HTTPException;
import java.util.List;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    private void validateObjectId(String id) {
        if (!ObjectId.isValid(id)) {
            throw new InvalidIdException(id);
        }
    }

    public Todo createTodo(Todo newTodoObj) {
        return todoRepository.save((newTodoObj));
    }

    public void deleteTodo(String id) {
        todoRepository.deleteById(id);
    }

    public Todo updateTodo(String id, TodoUpdateRequest todoUpdateRequest) {
        Todo existingTodo = todoRepository.findById(id).get();
        if (todoUpdateRequest.getDone() != null) {
            existingTodo.setDone(todoUpdateRequest.getDone());
        }
        if (todoUpdateRequest.getText() != null) {
            existingTodo.setText(todoUpdateRequest.getText());
        }
        return todoRepository.save(existingTodo);
    }


}
