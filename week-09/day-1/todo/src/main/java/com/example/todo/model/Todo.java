package com.example.todo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

  @Id @GeneratedValue
  private long id;
  private String title;
  private boolean urgent;
  private boolean done;

  public Todo() {

  }

  public Todo(String title, boolean urgent) {
    this.title = title;
    this.urgent = urgent;
    this.done = false;
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public void setId(long id) {
    this.id = id;
  }
}
