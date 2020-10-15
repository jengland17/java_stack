package com.jengland.events.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.jengland.events.models.Answer;
import com.jengland.events.models.Question;
import com.jengland.events.models.User;
import com.jengland.events.services.QuestionService;


@Controller
public class HomeController {
	
	private final QuestionService questionServ;

	
	public HomeController(QuestionService questionServ) {
		this.questionServ = questionServ;

	}

	
	@GetMapping("/dashboard")
	public String dashboard(Model model, HttpSession session) {
		User loggedInUser = (User) session.getAttribute("user");
		if (loggedInUser == null) {
			return "redirect:/";
		}
		model.addAttribute("allQuestions", questionServ.getQuestions());
		return "dashboard.jsp";
	} 
	
	@GetMapping("/question")
	public String question(HttpSession session, Model model) {
		User loggedInUser = (User) session.getAttribute("user");
		if (loggedInUser == null) {
			return "redirect:/";
		}
		model.addAttribute("newQuestion", new Question());
		return "question.jsp"; 
	}
	
	@PostMapping("/question/new")
	public String createQuestion(@Valid @ModelAttribute("newQuestion") Question newQuestion, BindingResult result, Model model, HttpSession session) {
		User loggedInUser = (User) session.getAttribute("user");
		if (result.hasErrors()) {
			return "question.jsp";
		} else {
			newQuestion.setUser(loggedInUser);
			questionServ.createQuestionWithTags(newQuestion);
			return "redirect:/dashboard"; 
		}
	}
	
	@GetMapping("/question/{id}")
	public String showQuestion(@PathVariable("id") Long id, Model model, HttpSession session) {
		User loggedInUser = (User) session.getAttribute("user");
		if (loggedInUser == null) {
			return "redirect:/";
		}
		model.addAttribute("someQuestion", questionServ.getQuestion(id));
		model.addAttribute("newAnswer", new Answer());
		return "answer.jsp"; 
	}
	
	@PostMapping("/question/{id}/answer")
	public String answer(@Valid @ModelAttribute("newAnswer") Answer newAnswer, BindingResult result, Model model, @PathVariable("id") Long id, HttpSession session) {
		User loggedInUser = (User) session.getAttribute("user");
		if (result.hasErrors()) {
			model.addAttribute("someQuestion", questionServ.getQuestion(id));
			return "answer.jsp";
		}
		newAnswer.setQuestion(questionServ.getQuestion(id));
		newAnswer.setUser(loggedInUser);
		newAnswer.setId(null);
		Answer a = questionServ.create(newAnswer);
		if (a == null) {
			result.rejectValue("content", "unique", "You have already answered");
			model.addAttribute("someQuestion", questionServ.getQuestion(id));
			return "answer.jsp";
		}
		
		return "redirect:/question/" + id; 
		
	}
	
	
	
}
