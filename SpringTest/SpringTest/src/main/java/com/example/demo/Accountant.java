package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Accountant implements Employee{
  
  



  public void register() {
    // db logic crated stored in the dbs
    System.out.println("Audit the accounts...");
  }
}