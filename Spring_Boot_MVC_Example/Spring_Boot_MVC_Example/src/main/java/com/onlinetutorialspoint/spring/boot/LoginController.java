package com.onlinetutorialspoint.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.onlinetutorialspoint.bean.LoginBean;

@Controller
public class LoginController {
  
  @Autowired
  UserValidator userValidator;
  
  
  
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String init(Model model) {
		model.addAttribute("msg", "Please Enter Your Login Details");
		return "login.jsp";
	}
   
	@RequestMapping(value = "/loginTest", method = RequestMethod.GET)
  public String print(Model model) {
	  //Model  view 
    model.addAttribute("msg", "Hesdvdsvbfdbfllo");
    model.addAttribute("msg1", "abcfd");
    model.addAttribute("msg2", "abcdd");
    return "hello.jsp";
  }
   

	
	@RequestMapping(method = RequestMethod.POST)
	//@PostMapping
	public String submit(Model model,
			@ModelAttribute("loginBean") LoginBean loginBean) throws Exception {
	//  UserValidator user =new UserValidator();
	//  user.validateUsers(loginBean);
	  userValidator.validateUsers(loginBean);
		if (loginBean != null && loginBean.getUserName() != null
				& loginBean.getPassword() != null) {
			if (loginBean.getUserName().equals("abc")
					&& loginBean.getPassword().equals("abc")) {
				model.addAttribute("msg", loginBean.getUserName());
				return "success.jsp";
			} else {
				model.addAttribute("error", "Invalid Details");
				return "login.jsp";
			}
			
		} else {
			model.addAttribute("error", "Please enter Details");
			return "login.jsp";
		}
	}
}
