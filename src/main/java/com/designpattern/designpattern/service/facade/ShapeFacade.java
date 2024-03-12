package com.designpattern.designpattern.service.facade;

public class ShapeFacade {

  private Shape shape;

  public ShapeFacade(Shape shape) {
    this.shape = shape;
  }

  public void executeShape() {
    this.shape.execute();
  }
  
}
