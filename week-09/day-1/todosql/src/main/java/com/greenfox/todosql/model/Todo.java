package com.greenfox.todosql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {

  @Id
  @GeneratedValue
  private long id;
  private String title;
  private boolean urgent;
  private boolean done;

  public Todo() {

  }
  public Todo(String title,boolean urgent) {
    this.title = title;
    this.urgent = urgent;
    this.done = false;
  }
  public Todo(String title,boolean done, boolean urgent) {
    this.title = title;
    this.done = done;
    this.urgent = urgent;
  }
  public long getId() {
    return id;
  }
  public String getTitle() {
    return title;
  }
  public boolean getUrgent() {
    return this.urgent;
  }
  public boolean getDone() {
    return this.done;
  }

  public void setId(long id) {
    this.id = id;
  }
  public void setDone(boolean done) {
    this.done = done;
  }
  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }
  public void setTitle(String title) { this.title = title; }

}

