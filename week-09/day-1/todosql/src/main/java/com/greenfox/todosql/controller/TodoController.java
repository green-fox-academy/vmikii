package com.greenfox.todosql.controller;

import com.greenfox.todosql.model.Todo;
import com.greenfox.todosql.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping("/add")
  public String add() {
    return "addtodo";
  }

  @PostMapping("/add")
  public String add(String todo, boolean isUrgent) {
    service.add(todo, isUrgent);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/delete")
  public String delete(@PathVariable("id") long id) {
    service.delete(id);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/edit")
  public String edit(@PathVariable("id") long id, Model model) {
    model.addAttribute("todo", service.getById(id));
    return "edittodo";
  }

//  @PostMapping("/{id}/edit")
//  public String edit(@PathVariable("id") long id, String title, boolean isUrgent, boolean isDone) {
//    service.updateTodo(id,service.tempTodo(id, title, isUrgent, isDone));
//    return "redirect:/todo/list";
//  }

  @PostMapping("/{id}/edit")
  public String edit(@ModelAttribute Todo todo) {
    service.addTodo(todo);
    return "redirect:/todo/list";
  }
}
