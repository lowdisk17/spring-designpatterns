package com.designpattern.designpattern.controller;

import org.springframework.web.bind.annotation.RestController;

import com.designpattern.designpattern.service.abstractfactory.AbstractFactory;
import com.designpattern.designpattern.service.abstractfactory.FactoryProducer;
import com.designpattern.designpattern.service.abstractfactory.Triangle;
import com.designpattern.designpattern.service.adapter.Device;
import com.designpattern.designpattern.service.builder.Color;
import com.designpattern.designpattern.service.builder.ShapeBuilder;
import com.designpattern.designpattern.service.builder.ShapeObject;
import com.designpattern.designpattern.service.composite.Employee;
import com.designpattern.designpattern.service.decoratorpattern.Circle;
import com.designpattern.designpattern.service.decoratorpattern.RedShapeDecorator;
import com.designpattern.designpattern.service.facade.Rectangle;
import com.designpattern.designpattern.service.facade.ShapeFacade;
import com.designpattern.designpattern.service.factory.Shape;
import com.designpattern.designpattern.service.factory.ShapeFactory;
import com.designpattern.designpattern.service.filter.Person;
import com.designpattern.designpattern.service.filter.PersonFilter;
import com.designpattern.designpattern.service.prototype.Prototype;
import com.designpattern.designpattern.service.proxy.ProxyFile;
import com.designpattern.designpattern.service.singleton.Singleton;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MainController {

  @Autowired
  private Singleton singleton;

  @Autowired
  private Prototype prototype;

  @GetMapping("singleton")
  public String getSingleton() {
    singleton.execute();
    return "Success";
  }

  @GetMapping("prototype")
  public String getPrototype() {
    prototype.execute();
    return "Success";
  }

  @GetMapping("factory")
  public String getFactory() {
    Shape shape = ShapeFactory.getShape("triangle");
    shape.execute();
    return "Success";
  }

  @GetMapping("abstractfactory")
  public String getAbstractFactory() {
    AbstractFactory factory = FactoryProducer.getFactory("shape");
    Triangle shape = (Triangle) factory.getShape("triangle");
    shape.execute();
    return "Success";
  }

  @GetMapping("builder")
  public String getBuilder() {
    ShapeObject shape = new ShapeObject("square");
    Color color = new Color("green");
    ShapeBuilder builder = new ShapeBuilder();
    builder.color(color).shape(shape).execute();
    return "Success";
  }

  @GetMapping("composite")
  public String getComposite() {
    Employee employee1 = new Employee("Employee 1", null);
    Employee employee2 = new Employee("Employee 2", null);
    List<Employee> subs = new ArrayList<>();
    subs.add(employee1);
    subs.add(employee2);
    Employee manager = new Employee("Manager", subs);
    for (Employee e: manager.getSubordinates()) {
      System.out.println(e.toString());
    }
    return "Success";
  }

  @GetMapping("decorator")
  public String getDecorator() {
    RedShapeDecorator decorator = new RedShapeDecorator(new Circle());
    decorator.execute();
    return "Success";
  }

  @GetMapping("facade")
  public String getFacade() {
    ShapeFacade facade = new ShapeFacade(new Rectangle());
    facade.executeShape();
    return "Success";
  }

  @GetMapping("filter")
  public String getFilter() {
    Person p1 = new Person("Person 1", "male");
    Person p2 = new Person("Person 2", "male");
    Person p3 = new Person("Person 3", "female");
    List<Person> list = new ArrayList<>();
    list.add(p1);
    list.add(p2);
    list.add(p3);
    PersonFilter filter = new PersonFilter();
    for (Person person : filter.femaleFilter(list)) {
      System.out.println("This is female person: " + person.getName());
    }
    for (Person person : filter.maleFilter(list)) {
      System.out.println("This is male person: " + person.getName());
    }
    return "Success";
  }

  @GetMapping("proxy")
  public String getProxy() {
    ProxyFile pf = new ProxyFile("Sample.jpg");
    pf.preview();
    return "Success";
  }

  @GetMapping("adapter")
  public String getAdapter() {
    Device device = new Device("hello.mp3");
    device.play();
    return "Success";
  }
  
  
}
