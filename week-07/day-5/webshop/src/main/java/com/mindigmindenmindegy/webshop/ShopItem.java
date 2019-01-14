package com.mindigmindenmindegy.webshop;

public class ShopItem {
  private String name;
  private String description;
  private int price;
  private int quantityOfStock;

  ShopItem(String name, String description, int price, int quantityOfStock) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
  }

  public String getName() {
    return this.name;
  }

  public String getDescription() {
    return description;
  }

  public int getPrice() {
    return  price;
  }

  public int getQuantityOfStock() {
    return quantityOfStock;
  }
}
