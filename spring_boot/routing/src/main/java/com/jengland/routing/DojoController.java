package com.jengland.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DojoController {
	
	@RequestMapping("{school}")
	public String dojo(@PathVariable("school") String school) {
		
		if (school.equals("dojo")) {
			return "This dojo is awesome";
		}
		if (school.equals("burbank-dojo")) {
			return "Burbank Dojo is located in Southern California";
		}
		if (school.equals("san-jose")) {
			return "SJ dojo is the headquarters";
		}
		return "";
	}
	
	
	

	

}
