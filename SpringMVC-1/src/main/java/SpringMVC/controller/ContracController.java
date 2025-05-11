package SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import SpringMVC.Model.User;
import jakarta.servlet.http.HttpServletRequest;


@Controller
public class ContracController {
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	
	
	@RequestMapping(path="/processForm", method = RequestMethod.POST)
	public String handlerForm(@RequestParam("email") String email,
			@RequestParam("userName") String userName,
			@RequestParam("Password") String Password, Model model) {
		 
		
		/* This is by using the Servlet Method
		 * public String handlerForm(@RequestParam("email") String email,
			@RequestParam("userName") String userName,
			@RequestParam("Password") String Password, Model model
			
			) 
		 * public String handlerForm(HttpServletRequest httpServletRequest)
		 * String email= httpServletRequest.getParameter("email"); String
		 * userName=httpServletRequest.getParameter("userName"); String Password=
		 * httpServletRequest.getParameter("Password")
		 */;
	
		 
		 
		
		  System.out.println("User email is "+email);
		  System.out.println("User name is "+userName);
		  System.out.println("User password is "+Password);
		 
		 
		 User user= new User();
		 
		 user.setEmail(email);
		 user.setUserName(userName);
		 user.setPassword(Password);
		 
		 
		 
			
			  model.addAttribute("email", email); 
			  model.addAttribute("userName", userName);
			  model.addAttribute("Password", Password);
			 
		 
		 System.out.println(user);
		 
		 
		model.addAttribute("user", user);
		 
		return "success";
		
		
	
		
	}

}
