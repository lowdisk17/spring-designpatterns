package com.designpattern.designpattern.service.abstractfactory;

public class ColorFactory extends AbstractFactory {

  @Override
  public Shape getShape(String shape) {
    return null;
  }

  @Override
  public Color getColor(String color) {
    switch (color) {
      case "blue": return new Blue();
      case "red": return new Red();
      default: return new Blue();
    }
  }
  
}
