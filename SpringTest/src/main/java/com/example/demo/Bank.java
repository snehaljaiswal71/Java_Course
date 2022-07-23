package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bank {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
        ApplicationContext app =new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee e=(Employee) app.getBean("ac");
        e.doWork();
  }

}
