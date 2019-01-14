package com.springapp.dependency.service;

import com.springapp.dependency.MyColor;
import org.springframework.stereotype.Service;


public class RedColor implements MyColor {
  @Override
  public String printColor() {
    return "red";
  }
}
