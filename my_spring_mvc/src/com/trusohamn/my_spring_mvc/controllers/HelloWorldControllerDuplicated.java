package com.trusohamn.my_spring_mvc.controllers;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/parent2")
public class HelloWorldControllerDuplicated {
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
	
	//a second controller method processing the html form
	//adding data to the model
	@RequestMapping("/processFormSecond")
	public String processFormv2(HttpServletRequest request, Model model) {
		String yourName = request.getParameter("yourName");	
		model.addAttribute("welcome", "v2 welcome "+yourName);
		return "print";
	}

	//a third controller method processing the html form
	//adding data to the model
	@RequestMapping("/processFormThird")
	public String processFormv3(
			@RequestParam("yourName") String yourName,
			Model model) {

		model.addAttribute("welcome", "v3 welcome "+yourName);
		return "print";
	}
}
