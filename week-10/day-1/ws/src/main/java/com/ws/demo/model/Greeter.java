package com.ws.demo.model;

public class Greeting {

  public String welcome_message;

  public  Greeting(String name, String title) {
    this.welcome_message = "Oh, hi there" + name + ", my dear" + title + "!";
  }
}
