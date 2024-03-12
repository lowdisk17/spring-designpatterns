package com.designpattern.designpattern.service.prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class Prototype {

  public void execute () {
    System.out.println("Prototype Sample");
  }
  
}
