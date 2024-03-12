package com.designpattern.designpattern.service.decoratorpattern;

public abstract class ShapeDecorator implements Shape {

  private Shape shape;
  private String color;

  public ShapeDecorator (Shape shape, String color) {
    this.shape = shape;
    this.color = color;
  }

  @Override
  public void execute() {
    shape.execute();
    System.out.println("Decorate it as " + color);
  }
  
}
