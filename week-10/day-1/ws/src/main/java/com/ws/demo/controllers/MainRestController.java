package com.ws.demo.controllers;

import com.ws.demo.model.ArrayHandler;
import com.ws.demo.model.ErrorHandler;
import com.ws.demo.model.NumberDoubler;
import com.ws.demo.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {

  @Autowired
  public RestService restService;

  @GetMapping("/doubling")
  public Object doDouble(@RequestParam("input") Integer input) {
    return restService.getNumberDoubler(input);
  }

  @GetMapping("/greeter")
    public Object greet(@RequestParam("name") String name, @RequestParam("title") String title) {
    return  restService.getGreeting(name, title);
  }

  @GetMapping("/appenda/{appendable}")
  public Object append(@PathVariable("appendable") String appendable) {
    return restService.getAppended(appendable);
  }

  @PostMapping("/arrays")
  public Object arrays(@RequestBody ArrayHandler arrayHandler) {
    return restService.getArrayOperationResult(arrayHandler);
  }
}
