package com.designpattern.designpattern.service.decoratorpattern;

public class RedShapeDecorator extends ShapeDecorator {

  public RedShapeDecorator(Shape shape) {
    super(shape, "red");
  }
  
}
