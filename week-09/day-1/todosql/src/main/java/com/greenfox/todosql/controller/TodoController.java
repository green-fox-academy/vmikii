package com.greenfox.todosql.controller;

import com.greenfox.todosql.model.Todo;
import com.greenfox.todosql.repository.TodoRepository;
import com.greenfox.todosql.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

  TodoService service;

  @Autowired
  public TodoController(TodoService service) {
    this.service = service;
  }

  @RequestMapping({"/", "/list"})
  public String list(@RequestParam(value = "isActive",required = false) boolean isActive, Model model) {
    model.addAttribute("todos", isActive
        ? service.getAll()
        : service.getActive());
    return "todolist";
  }
}
