package com.mindigmindenmindegy.webshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controllers {
  private ProductService productService;

  @Autowired
  public void setProductService(ProductService productService) {
    this.productService = productService;
  }

  @RequestMapping("/items")
  public String listShopItems(Model model) {
    model.addAttribute("items", productService.shopItemList);
    return "items";
  }
}
