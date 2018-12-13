package com.nemvagom.simba.model;

public class BankAccount {
  private String name;
  private double balance;
  private String animalType;
  private String currency;

  public BankAccount(String name, double balance, String animalType, String currency) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.currency = currency;
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

  public String getCurrency() {
    return this.currency;
  }
}
