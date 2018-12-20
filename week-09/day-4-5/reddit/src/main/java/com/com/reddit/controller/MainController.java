package com.com.reddit.controller;

import com.com.reddit.model.Post;
import com.com.reddit.service.RedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @Autowired
  RedditService service;

  @GetMapping("/")
  public String list(Model model) {
    model.addAttribute("posts", service.listAllPosts());
    return "main";
  }

  @GetMapping("/submit")
  public String submit(Model model) {
    model.addAttribute("newPost", new Post());
    return "submit";
  }

  @PostMapping(value = "/submit")
  public String submit(@ModelAttribute(value = "newPost") Post newPost) {
    service.addPost(newPost);
    return "redirect:/";
  }

}
