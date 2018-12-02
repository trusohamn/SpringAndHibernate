package com.trusohamn.my_spring_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicController {
	@RequestMapping("/")
	public String whereIsThePage() {
		return "main_menu";
	}
}
