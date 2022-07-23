package com.example.demo;

public class Accountant implements Employee{
  
  
  private String names;
  
  

  public Accountant(String names) {
    super();
    this.names = names;
  }


  public void doWork() {
    
    System.out.println("Audit the accounts..." + names);
  }
}