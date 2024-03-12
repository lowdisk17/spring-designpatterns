package com.designpattern.designpattern.service.filter;

public class Person {

  private String name;
  private String gender;

  public Person (String name, String gender) {
    this.name = name;
    this.gender = gender;
  }

  public String getName () {
    return this.name;
  }

  public void setName (String name) {
    this.name = name;
  }

  public String getGender () {
    return this.gender;
  }

  public void setGender (String gender) {
    this.gender = gender;
  }
  
}
