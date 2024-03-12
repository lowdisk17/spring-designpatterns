package com.designpattern.designpattern.service.abstractfactory;

public class ShapeFactory extends AbstractFactory {

  @Override
  public Shape getShape(String shape) {
    switch (shape) {
      case "circle": return new Circle();
      case "triangle": return new Triangle();
      default: return new Circle();
    }
  }

  @Override
  public Color getColor(String color) {
    return null;
  }
  
}
