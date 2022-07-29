package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

  @Around("execution(* com.example.demo.Transactions.register(..))")
  public void logBefore(ProceedingJoinPoint abc) throws Throwable {

    System.out.println("log before is Account is getting created");
    System.out.println("******");

    abc.proceed();
    System.out.println("log AFTER is Account is CREATED");
    // System.out.println("Around after is running!");

    // System.out.println("******");
  }

  // @After("execution(* com.example.demo.Accountant.register(..))")
  public void logafter(JoinPoint joinPoint) throws Throwable {

    System.out.println("log AFTER is Account is CREATED");

  }

}
