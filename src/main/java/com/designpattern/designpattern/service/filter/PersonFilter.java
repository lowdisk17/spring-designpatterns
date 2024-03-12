package com.designpattern.designpattern.service.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PersonFilter {

  private ArrayList<Person> ret;
  private Predicate<Person> male = (item) -> "male".equals(item.getGender());
  private Predicate<Person> female = (item) -> "female".equals(item.getGender());

  public ArrayList<Person> maleFilter (List<Person> list) {
    ret = new ArrayList<>();
    for (Person person : list) {
      if (male.test(person)) {
        ret.add(person);
      }
    }
    return ret;
  }

  public ArrayList<Person> femaleFilter (List<Person> list) {
    ret = new ArrayList<>();
    for (Person person : list) {
      if (female.test(person)) {
        ret.add(person);
      }
    }
    return ret;
  }
  
}
