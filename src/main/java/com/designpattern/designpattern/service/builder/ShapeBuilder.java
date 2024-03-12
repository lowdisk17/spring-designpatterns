package com.designpattern.designpattern.service.builder;

public final class ShapeBuilder {

  private Color color;
  private ShapeObject shape;

  public ShapeBuilder color(Color color) {
    this.color = color;
    return this;
  }

  public ShapeBuilder shape(ShapeObject shape) {
    this.shape = shape;
    return this;
  }

  public void execute () {
    System.out.println("This is shape: " + this.shape.getName());
    System.out.println("This is color: " + this.color.getName());
  }
  
}
