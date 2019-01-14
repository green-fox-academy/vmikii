package com.example.todo.controller;

import com.example.todo.model.Todo;
import com.example.todo.repository.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {

  TodoRepository repository;

  public TodoController(TodoRepository repository) {
    this.repository = repository;
  }

  @RequestMapping({"/", "/list"})
  public String list(Model model) {

    model.addAttribute("todos", repository.findAll());
    return "todolist";
  }
}
