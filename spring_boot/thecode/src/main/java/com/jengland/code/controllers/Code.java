package com.jengland.code.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class Code {
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/code")
	public String code(HttpSession session, RedirectAttributes flash) {
		String lastGuess = (String) session.getAttribute("lastGuess");
		
		if(lastGuess == null) {
			flash.addAttribute("message", "No Cheating!");
			return "redirect:/";
		}
		if(lastGuess.equals("bushido")) {
			return "bushido.jsp";
		}
		else {
			flash.addAttribute("message", "No Cheating!");
			return "redirect:/";
		}
		
	}
	
	@PostMapping("/process")
	public String process(@RequestParam(value="code") String code, RedirectAttributes flash, HttpSession session) {
		
		System.out.println(code.toLowerCase().equals("bushido"));
		
		if (code.toLowerCase().equals("bushido")) {
			session.setAttribute("lastGuess", code.toLowerCase());
			return "redirect:/code"; 
		} 
		
		flash.addFlashAttribute("message", "You must train harder!");
		return "redirect:/";
		
	}

}
