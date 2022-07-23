package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.Engine;

public class Vehicle {

  public static void main(String[] args) {

  //  Engine eng = new Engine();
  //  Tyres tyr = new Tyres();
  //  eng.engineToyota();
  //  tyr.carTyres();
    // IOC -- Creat an Instance/ object , assemble it ,and destroy it
     //DI Dependacy Injection
    ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
    Engine en=(Engine)app.getBean("engine");   // call bean  using ioc  
    en.engineToyota();                          // create bean and specifiy class path in xml 
    
    Tyres ty=(Tyres) app.getBean("tyre");
    ty.carTyres();
    
  }

}
