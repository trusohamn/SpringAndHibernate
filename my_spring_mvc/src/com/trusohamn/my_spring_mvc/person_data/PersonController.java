package com.trusohamn.my_spring_mvc.person_data;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/person")
public class PersonController {
	
	@RequestMapping("/showForm")
	public String showForm(Model myModel) {
		
		Person newPerson = new Person();
		
		myModel.addAttribute("person", newPerson);
		return "person_form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("person") Person newPerson) {
		
		
		return "person_confirmation";
	}
}
