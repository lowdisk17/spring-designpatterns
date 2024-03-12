package com.designpattern.designpattern.service.proxy;

public class RealFile implements File {

  private String name;

  public RealFile (String name) {
    this.name = name;
  }

  @Override
  public void preview() {
    System.out.println("Viewing filename : " + this.name);
  }
  
}
