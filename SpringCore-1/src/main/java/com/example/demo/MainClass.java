package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // IOC create / assimble  / dispose the bean
    ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
    Company cm=(Company) app.getBean("company");
    cm.register();
    
    Organaization org = (Organaization) app.getBean("org");
    org.register();
    
  }

}
