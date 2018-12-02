package com.trusohamn.my_spring_mvc.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	//a controller method showing the html form
	@RequestMapping("/showForm")
	public String showForm() {
		return "form";
	}
	
	//a controller method processing the html form
	@RequestMapping("/processForm")
	public String processForm() {
		return "print";
	}

}
