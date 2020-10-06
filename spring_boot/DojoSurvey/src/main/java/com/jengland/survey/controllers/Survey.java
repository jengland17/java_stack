package com.jengland.survey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Survey {

	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/result")
	public String info() {
		return "info.jsp";
	}
	
	@PostMapping("/form") 
	public String survey(@RequestParam(value="name") String name, @RequestParam(value="location") String location, @RequestParam(value="language") String language, @RequestParam(value="comment") String comment, HttpSession session) {
		
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("language", language);
		session.setAttribute("comment", comment);
		
		return "info.jsp";
		
	}
	
}
