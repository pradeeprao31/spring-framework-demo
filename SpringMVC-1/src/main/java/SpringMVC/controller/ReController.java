package SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	@RequestMapping("/one")
	public RedirectView one() {
//		System.out.println("this is the first handler");
//		return "redirect:/two";
		RedirectView redirectView= new RedirectView();
		redirectView.setUrl("https://leetcode.com/problemset/");
		return redirectView;
		
	}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("this is the second handler");
		return "help";
	}

}
