package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRESTController {
  @RequestMapping
  public Greetings greeting(@RequestParam(value="name") String name) {
    return new Greetings(1, "Hello, " + name);
  }
}
