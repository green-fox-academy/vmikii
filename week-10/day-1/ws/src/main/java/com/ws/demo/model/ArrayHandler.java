package com.ws.demo.model;

import java.util.Arrays;

public class ArrayHandler {

  public String what;
  public int[] numbers;

  public ArrayHandler(String what, int[] numbers) {
    this.what = what;
    this.numbers = numbers;
  }

  public Integer sum() {
    int sum = 0;
    for (int i = 0; i < numbers.length; i ++) {
      sum += numbers[i];
    }
    return sum;
  }

  public Integer multiply() {
    int mult = 1;
    for (int i = 0; i < numbers.length; i++) {
      mult *= numbers[i];
    }
    return mult;
  }

  public Integer[] doubleElements() {
    Integer[] temp = new Integer[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      temp[i] = numbers[i] * 2;
    }
    return temp;
  }
}
