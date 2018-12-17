package com.example.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @RequestMapping({"/", "/list"})
  @ResponseBody
  public String list() {
    return "This is my first Todo";
  }
}
