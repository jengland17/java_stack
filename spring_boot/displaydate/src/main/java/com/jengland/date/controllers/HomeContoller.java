package com.jengland.date.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeContoller {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	

}
