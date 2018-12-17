package com.example.todo;

import com.example.todo.model.Todo;
import com.example.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

  @Autowired
  TodoRepository todoRepository;

  public static void main(String[] args) {
    SpringApplication.run(TodoApplication.class, args);
  }
  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("sfas", true));
    todoRepository.save(new Todo("tgrg", false));
    todoRepository.save(new Todo("kbk", true));
  }
}

