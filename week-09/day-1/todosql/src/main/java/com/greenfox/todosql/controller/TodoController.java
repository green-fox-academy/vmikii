package com.greenfox.todosql.controller;

import com.greenfox.todosql.repository.TodoRepository;
import com.greenfox.todosql.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

  TodoService service;

  public TodoController(TodoService service) {
    this.service = service;
  }

  @RequestMapping({"/", "/list"})
  public String list(@RequestParam(value = "isActive",required = false) String isActive, Model model) {
    if (isActive.equals("false")) {
      model.addAttribute("todos", service.getRepository().findAll());
    } else {
      model.addAttribute("todos",service.getNotDoneTodos());
    }
    return "todolist";
  }
}
