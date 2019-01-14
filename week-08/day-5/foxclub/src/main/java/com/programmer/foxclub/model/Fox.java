package com.programmer.foxclub.model;

import java.util.ArrayList;
import java.util.List;

public class Fox {

  private String name;
  private String food;
  private String drink;
  private List<String> tricks = new ArrayList<>();

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
