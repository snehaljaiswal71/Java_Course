package com.onlinetutorialspoint.spring.boot;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import com.onlinetutorialspoint.bean.LoginBean;

@Aspect
@Component
public class LoggingAspect {

  @Before("execution(* com.onlinetutorialspoint.spring.boot.LoginController.print(..))")
  public void logBefore(JoinPoint abc) throws Throwable {
    System.out.println("User has Loged In .");
    System.out.println("****** transacation amount has been debited ");

   // joinPoint.proceed();
   /*
    * System.out.println("Around before is running!"); System.out.println("Around after is running!");
    */

    System.out.println("******");
  }
  
  
  @Before("execution(* com.onlinetutorialspoint.spring.boot.LoginController.submit(..))")
  public void logafter(JoinPoint abc) throws Throwable {
    System.out.println("User has Loged In into account");
    
  }
  
  
  
}
