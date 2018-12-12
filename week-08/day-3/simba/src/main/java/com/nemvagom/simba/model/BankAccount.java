package com.nemvagom.simba.model;

public class BankAccount {
  private String name;
  private double balance;
  private String animalType;

  public BankAccount(String name, double balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }

  public String getName() {
    return this.name;
  }

  public double getBalance() {
    return this.balance;
  }

  public String getAnimalType() {
    return this.animalType;
  }

}
