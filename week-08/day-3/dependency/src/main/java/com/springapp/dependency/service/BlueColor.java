package com.springapp.dependency.service;

import com.springapp.dependency.MyColor;
import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor {
  @Override
  public String printColor() {
    return "blue";
  }
}
