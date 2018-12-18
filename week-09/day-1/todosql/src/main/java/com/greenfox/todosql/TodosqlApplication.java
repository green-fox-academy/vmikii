package com.greenfox.todosql;

import com.greenfox.todosql.model.Todo;
import com.greenfox.todosql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodosqlApplication implements CommandLineRunner {

  TodoRepository todoRepository;

  @Autowired
  public TodosqlApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(TodosqlApplication.class, args);
  }
  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("sfas", false, true));
    todoRepository.save(new Todo("tgrg", false, true));
    todoRepository.save(new Todo("kbssr", false, false));
    todoRepository.save(new Todo("kbk", false, false));
    todoRepository.save(new Todo("nznzk", false, false));
    todoRepository.save(new Todo("vbncv", false, true));
    todoRepository.save(new Todo("ksdt", false, true));
    todoRepository.save(new Todo("kek", true,true));
  }

}

