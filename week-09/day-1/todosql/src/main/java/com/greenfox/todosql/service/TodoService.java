package com.greenfox.todosql.service;

import com.greenfox.todosql.model.Todo;
import com.greenfox.todosql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {

  private TodoRepository repository;

  @Autowired
  public TodoService(TodoRepository repository) {
    this.repository = repository;
  }
  public List<Todo> getActive() {
    List<Todo> todos = new ArrayList<>();
    repository.findAll().forEach(todos :: add);
    return todos.stream()
        .filter(todo -> !todo.getDone())
        .collect(Collectors.toList()
    );
  }
  public List<Todo> getAll() {
    List<Todo> todos = new ArrayList<>();
    repository.findAll().forEach(todos :: add);
    return todos;
  }
  public void add(String todo) {
    repository.save(new Todo(todo,false));
  }
  public void delete(long id) {
    repository.deleteById(id);
  }
}
