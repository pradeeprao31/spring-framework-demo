package SpringMVC.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String root() {
	    return "redirect:/home";  // or use "forward:/home"
	}


    // This handles: http://localhost:8080/SpringMVC_First/home
    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("this is home url.");
        model.addAttribute("name","pradeepkumar");
        model.addAttribute("id", 971);
        
        List<String> friend=new ArrayList<String>();
        friend.add("Pooja");
        friend.add("Mahima");
        friend.add("kushi");
        friend.add("Neha");
        friend.add("Nisha");
        
        model.addAttribute("f",friend);
        
        return "index";
    }
    
    @RequestMapping("/help")
    public String help() {
    	System.out.println(" this is help pages");
    	 return "help";
    }
    
    @RequestMapping("/Men")
    public ModelAndView Men() {
    	System.out.println("for man section ");
    	ModelAndView modelAndView =new ModelAndView();
    	
    	modelAndView.addObject("name","Pradeep Kumar");
    	modelAndView.setViewName("Men");
    	LocalDateTime now=LocalDateTime.now();
    	modelAndView.addObject("time",now);
    	return modelAndView;
    	
    	
    }
}
