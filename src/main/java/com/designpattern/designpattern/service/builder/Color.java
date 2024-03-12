package com.designpattern.designpattern.service.builder;

public class Color {

  private String name;

  public Color (String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName () {
    return this.name;
  }
  
}
