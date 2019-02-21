package com.trusohamn.my_spring_mvc.person_data;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/person")
public class PersonController {
    @Value("#{countryOptions}") 
    private Map<String, String> countryOptions;
	
	@RequestMapping("/showForm")
	public String showForm(Model myModel) {
		
		Person newPerson = new Person();
		
		myModel.addAttribute("person", newPerson);
		
	    // add the country options to the model 
	    myModel.addAttribute("theCountryOptions", countryOptions); 
	
		return "person_form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("person") Person newPerson) {
		
		
		return "person_confirmation";
	}
}
