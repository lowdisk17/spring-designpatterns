package com.designpattern.designpattern.service.factory;

public class ShapeFactory {

  public static Shape getShape (String shape) {
    switch (shape) {
      case "circle" : return new Circle();
      case "triangle" : return new Triangle();
      default: return new Circle();
    }
  }
  
}
