package com.example.todo.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private boolean urgent;
  private boolean done;

  public Todo() {

  }

  public Todo(long id, String title, boolean urgent) {
    this.id = id;
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
}
