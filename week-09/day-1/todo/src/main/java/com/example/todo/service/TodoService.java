package com.example.todo.service;

import com.example.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

  TodoRepository todoRepository;

  @Autowired
  public TodoService(TodoRepository repository) {
    this.todoRepository = repository;
  }
}
