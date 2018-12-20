package com.com.reddit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Post {

  @Id
  @GeneratedValue
  private int id;
  private String text;
  private int rating;

  public Post() {
    this.rating = 1;
  }
  public Post(String text) {
    this.text = text;
    this.rating = 1;
  }

  public int getId() {
    return this.id;
  }
  public String getText() {
    return text;
  }

  public int getRating() {
    return rating;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }
}
