package com.jengland.gold.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Gold {
	
	@GetMapping("/Gold")
	public String index(HttpSession session) {
		
		if(session.isNew()) {
			ArrayList<String> activities = new ArrayList<String>();
			activities.add("The Adventure Begins!");
			session.setAttribute("gold", 0);
			session.setAttribute("activities", activities);
		}
		
		return "gold.jsp"; 
	}
	
	@PostMapping("/form")
	public String gold(@RequestParam(value="building") String building, HttpSession session) {
		
		String time = new SimpleDateFormat("MMMM dd, yyyy hh:mm a").format(new Date());
		
		if(building.equals("farm")) {
			int num = ThreadLocalRandom.current().nextInt(10,20 + 1);
			int gold = (int) session.getAttribute("gold");
			session.setAttribute("gold", gold+num);
			ArrayList<String> list = (ArrayList<String>) session.getAttribute("activities");
			list.add(0, "You have enetered the Cave and earned " + num + " gold. (" + time + ")");
			session.setAttribute("activities", list);
		}
		
		if(building.equals("cave")) {
			int num = ThreadLocalRandom.current().nextInt(5,10 + 1);
			int gold = (int) session.getAttribute("gold");
			session.setAttribute("gold", gold+num);
			ArrayList<String> list = (ArrayList<String>) session.getAttribute("activities");
			list.add(0, "You have enetered the Cave and earned " + num + " gold. (" + time + ")");
			session.setAttribute("activities", list);
		}
		
		if(building.equals("house")) {
			int num = ThreadLocalRandom.current().nextInt(2,5 + 1);
			int gold = (int) session.getAttribute("gold");
			session.setAttribute("gold", gold+num);
			ArrayList<String> list = (ArrayList<String>) session.getAttribute("activities");
			list.add(0, "You have entered the House and earned " + num + " gold. (" + time + ")");
			session.setAttribute("activities", list);
		}
		
		if(building.equals("casino")) {
			int num = ThreadLocalRandom.current().nextInt(-50,50 + 1);
			int gold = (int) session.getAttribute("gold");
			session.setAttribute("gold", gold+num);
			ArrayList<String> list = (ArrayList<String>) session.getAttribute("activities");
			if (num < 0) {
				list.add(0, "You have entered the Casino and lost " + num + " gold. (" + time + ")");
				session.setAttribute("activities", list);
			}
			else {
				list.add(0, "You have entetred the Casino and won " + num + " gold. (" + time + ")");
				session.setAttribute("activities", list);
			}
		}
		
		return "redirect:/Gold"; 
		
	}
	

	@GetMapping("/reset")
	public String reset(HttpSession session) {
		session.invalidate();
		return "redirect:/Gold";
	}
}
