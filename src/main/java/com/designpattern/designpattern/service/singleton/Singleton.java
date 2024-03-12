package com.designpattern.designpattern.service.singleton;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class Singleton {

  public void execute () {
    System.out.println("Singleton Sample");
  }

}
