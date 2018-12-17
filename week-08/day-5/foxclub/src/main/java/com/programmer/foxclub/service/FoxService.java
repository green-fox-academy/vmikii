package com.programmer.foxclub.service;

import com.programmer.foxclub.model.Valley;
import org.springframework.stereotype.Service;

@Service
public class FoxService {

  public String search(String search, Valley valley) {
    if (valley.contains(search)) {
      return "search";
    }
    return "login";

  }
}
