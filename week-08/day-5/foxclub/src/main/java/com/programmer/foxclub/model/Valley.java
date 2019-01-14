package com.programmer.foxclub.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Valley {
  private List<Fox> foxes;

  public Valley() {
    foxes = new ArrayList<>();
  }
  public List<Fox> listFoxes() {
    return this.foxes;
  }
  public void addFox(Fox newFox) {
    if (newFox != null) {
      foxes.add(newFox);
    }
  }
  public Fox searchFox(Fox foxToSearch) throws Exception {
    if (this.foxes.contains(foxToSearch)) {
      for(Fox fox : foxes) {
        if(fox == foxToSearch) {
          return fox;
        }
      }
    }
    throw new Exception();
  }
  public boolean contains(String foxName) {
    for (Fox fox : foxes) {
      if (fox.getName().equals(foxName)) {
        return true;
      }
    }
    return false;
  }
}
