package com.jengland.counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index {
	
	@RequestMapping("/your_server")
	public String index() {
		return "index.jsp";
	}

}
