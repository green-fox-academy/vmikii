package com.greenfox.todosql.service;

import com.greenfox.todosql.model.Todo;
import com.greenfox.todosql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
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
  public void add(String title, boolean isUrgent) {
    repository.save(new Todo(title,isUrgent));
  }
  public void delete(long id) {
    repository.deleteById(id);
  }
  public Todo tempTodo(long id, String title, boolean isUrgent, boolean isDone) {
    Todo todo = new Todo(title, isUrgent, isDone);
    todo.setId(id);
    return todo;
  }
  public void updateTodo(long id, Todo todo) {
    repository.save(todo);
  }
  public Todo getById(long id) {
    return repository.findById(id).get();
  }
}
