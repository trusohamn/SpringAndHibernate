package com.trusohamn.my_spring_mvc.person_data;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/person")
public class PersonController {
    @Value("#{countryOptions}") 
    private Map<String, String> countryOptions;
    
    //initbinder for resolving issue with whitespace validation
    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
    	StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
    	dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

	@RequestMapping("/showForm")
	public String showForm(Model myModel) {
		
		Person newPerson = new Person();
		
		myModel.addAttribute("person", newPerson);
		
	    // add the country options to the model 
	    myModel.addAttribute("theCountryOptions", countryOptions); 
	
	    
	    
		return "person_form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("person") Person newPerson, BindingResult theBindingResult) {
		
		if (theBindingResult.hasErrors()) {
			return "person_form";
		}
		else return "person_confirmation";
	}
}
