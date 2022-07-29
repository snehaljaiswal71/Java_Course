package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Transactions implements Employee {

  @Override
  public void register() {
    // TODO Auto-generated method stub
    System.out.println("Transactions of employees ....");
  }

}
