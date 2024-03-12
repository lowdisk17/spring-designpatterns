package com.designpattern.designpattern.service.builder;

public class ShapeObject {

  private String name;

  public ShapeObject (String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName () {
    return this.name;
  }
  
}
