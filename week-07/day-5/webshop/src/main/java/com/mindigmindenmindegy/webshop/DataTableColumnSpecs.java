package com.mindigmindenmindegy.webshop;

import javax.servlet.http.HttpServletRequest;

public class DataTableColumnSpecs {
  private int index;
  private String data;
  private String name;
  private String search;

  public DataTableColumnSpecs(HttpServletRequest request, int i) {
    this.setIndex(i);
    prepareColumnSpecs(request, i);
  }

  private void prepareColumnSpecs(HttpServletRequest request, int i) {
    this.setData(request.getParameter("columns[" + i + "][data]"));
    this.setName(request.getParameter("columns[" + i + "][name]"));
    this.setSearch(request.getParameter("columns[" + i + "][search][value]"));
  }

  private void setIndex(int index) {
    this.index = index;
  }
  private void setData(String data) {
    this.data = data;
  }
  private void setName(String name) {
    this.name = name;
  }
  private void setSearch(String search) {
    this.search = search;
  }
}
