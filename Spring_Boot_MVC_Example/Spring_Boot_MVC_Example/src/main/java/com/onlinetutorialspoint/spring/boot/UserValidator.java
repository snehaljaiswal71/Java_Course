package com.onlinetutorialspoint.spring.boot;

import org.springframework.stereotype.Component;

import com.onlinetutorialspoint.bean.LoginBean;

@Component
public class UserValidator {

  
     public void validateUsers(LoginBean loginBean) throws Exception{
        
        if(loginBean.getUserName()=="") {
          throw new Exception("UserName cannot be Empty");
        }
        
        // validate if username cannot be numbers   , username character not more than 3
        
       
      }
   
}
