package com.programmer.foxclub.controller;

import com.programmer.foxclub.model.Fox;
import com.programmer.foxclub.model.Valley;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MainController {
  private Valley valley;

  public MainController() {
    valley = new Valley();
  }

  @GetMapping("/login")
  public String showLoginPage() {
    return "login";
  }

  @PostMapping("/login")
  public String search(@ModelAttribute("fox") String fox, Model model) {
    addItemToModel(model, valley.contains(fox));
    return "login";
  }

  private void addItemToModel(Model model, List<Fox> foxes) {
    try {
      model.addAttribute("currentFoxes" ,foxes);
    } catch (NullPointerException ex) {
      System.err.println(ex.getMessage());
      System.err.println(foxes);
    }
  }
}
