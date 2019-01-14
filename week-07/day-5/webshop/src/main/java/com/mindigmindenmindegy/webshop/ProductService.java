package com.mindigmindenmindegy.webshop;

import java.util.ArrayList;

public class ProductService {
  ArrayList<ShopItem> shopItemList;

  ProductService() {
    shopItemList = new ArrayList<>();
    shopItemList.add(new ShopItem("lapát", "szerszám", 0, 0));
    shopItemList.add(new ShopItem("alsó burkolat", "lapop alkatrész", 0, 0));
  }
}
