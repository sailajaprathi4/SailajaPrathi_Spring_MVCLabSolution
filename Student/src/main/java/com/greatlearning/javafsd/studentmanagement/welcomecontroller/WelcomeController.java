package com.greatlearning.javafsd.studentmanagement.welcomecontroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/") //whenever we enter / in web page it maps to handleWelcome method
	public String handleWelcome()
	{
		return "welcome";
	}
	
}
 


	
	

