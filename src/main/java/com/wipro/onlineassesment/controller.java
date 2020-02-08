package com.wipro.onlineassesment;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class controller {
	
	@Autowired
	private service service;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("userForm",new User());
		//System.out.println("insideccc");
		return "login";	
	}
	
	@RequestMapping("/login/do")
	String validate(@ModelAttribute("userForm") User userForm,Map<String,Object> model) {
		
		model.put("emailId",userForm.getEmailId());
		return service.validate(userForm.getEmailId(), userForm.getPassword());
	}
	
	@RequestMapping("/register")
	String register(@ModelAttribute("userForm") User userForm) {
		return "registration";
	}
	
	@RequestMapping("/registration/do")
	String succesReg(@ModelAttribute("userForm") User userForm,Map<String,Object> model) 
	{		
		model.put("fname", userForm.getFirstName());
		model.put("lastname", userForm.getLastName());
		return service.register(userForm);
	}
	
	@RequestMapping(value = "/users/all", method = RequestMethod.GET)
	public String index(Model md){
		md.addAttribute("users", service.allUser());

		return "alluser";
	}
	
	@RequestMapping(value = "/springAssessment", method = RequestMethod.GET)
	public String springAsses(Model mod) 
	{

		mod.addAttribute("spring", new Question());		

		return "springassessment";
	}
	
	@RequestMapping("/evaluate/spring/test")
	String springExam(@ModelAttribute("spring") Question qForm) 
	{		
		return service.eValSpring(qForm);	
	}
	
	@GetMapping(value = "/hibernateAssessment")
	public String hibernateAsses(Model model) 
	{

		model.addAttribute("hibernate", new Question());		

		return "hibernateassessment";
	}
	
	@RequestMapping("/evaluate/hibernate/test")
	String hibernateExam(@ModelAttribute("hibernate") Question qForm) 
	{		
		return service.eValHibernate(qForm);	
	}
	
	@GetMapping(value = "/tests/all")
	public String allTest(Model md){
		md.addAttribute("tests", service.allTest());
		return "testdetails";
	}

	

}
