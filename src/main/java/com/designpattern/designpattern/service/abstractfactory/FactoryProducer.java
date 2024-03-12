package com.designpattern.designpattern.service.abstractfactory;

public class FactoryProducer {

  public static AbstractFactory getFactory (String factoryName) {
    switch (factoryName) {
      case "color": return new ColorFactory();
      case "shape": return new ShapeFactory();
      default: return new ColorFactory();
    }
  } 
  
}
