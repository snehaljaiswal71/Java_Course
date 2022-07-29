package com.example.demo;

import org.springframework.stereotype.Component;


@Component
public class Manager implements Employee{
  
  public void register() {
    
    System.out.println("Manage the branch office");
  }
}
