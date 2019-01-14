package com.ws.demo.model;

public class NumberDoubler {
  public Integer received;
  public int result;

  public NumberDoubler(Integer received) {
    this.received = received;
    this.result = received * 2;
  }
}
