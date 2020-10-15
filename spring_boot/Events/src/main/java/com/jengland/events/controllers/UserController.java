package com.jengland.events.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jengland.events.models.LoginUser;
import com.jengland.events.models.User;
import com.jengland.events.services.UserService;

@Controller
public class UserController {
	
	private final UserService userServ;
	
	public UserController(UserService userServ) {
		this.userServ = userServ;
	}
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("registeringUser", new User());
		model.addAttribute("loginUser", new LoginUser());
		return "index.jsp";
	}
	
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("registeringUser") User registeringUser, BindingResult result, Model model, HttpSession session) {
		if (!registeringUser.getPassword().equals(registeringUser.getConfirm())) {
			result.rejectValue("confirm", "Match", "Confirm Password must match Password!");
		}
		if (userServ.getUser(registeringUser.getEmail()) != null) {
			result.rejectValue("email", "Unique", "Email already in use!");
		}
		
		if (result.hasErrors()) {
			model.addAttribute("loginUser", new LoginUser());
			return "index.jsp";
		} else {
			session.setAttribute("user", userServ.create(registeringUser));
			return "redirect:/";
		}
	}
	
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("loginUser") LoginUser loginUser, BindingResult result, Model model, HttpSession session) {
		User loggingInUser = userServ.login(loginUser, result);
		if (result.hasErrors()) {
			model.addAttribute("registeringUser", new User());
			return "index.jsp";
		} else {
			session.setAttribute("user", loggingInUser);
			return "redirect:/dashboard";
		}
	}
	
	@GetMapping("/logout") 
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		return "redirect:/";
	}

}
