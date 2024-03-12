package com.designpattern.designpattern.service.composite;

import java.util.List;

public class Employee {

  private String name;
  private List<Employee> subordinates;

  public Employee (String name, List<Employee> subordinates) {
    this.name = name;
    this.subordinates = subordinates;
  }

  public String getName () {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addSubordinate(Employee e) {
    this.subordinates.add(e);
  }

  public List<Employee> getSubordinates() {
    return this.subordinates;
  }

  public String toString () {
    return "Employee name: " + getName();
  }
  
}
