package com.springapp.dependency.controller;

import com.springapp.dependency.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulUtilitiesController {
  UtilityService service;

  @Autowired
  UsefulUtilitiesController(UtilityService service) {
    this.service = service;
  }

  @GetMapping("/useful")
  public String links() {
    return "main";
  }

  @GetMapping("/useful/colored")
  public String randomBackgroundColor(Model model) {
    model.addAttribute("rndColor",service.randomColor());
    return "color";
  }
  @GetMapping("/useful/email")
  public String validateEmail(@RequestParam("email") String address, Model model) {
    model.addAttribute("text",
        service.validateEmail(address)
            ? address + " is a valid email address"
            : address + " is not a valid email address"
    );

    return "email";
  }
}
