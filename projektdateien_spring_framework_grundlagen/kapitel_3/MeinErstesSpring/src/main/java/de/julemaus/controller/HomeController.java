package de.julemaus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping
	public String zeigeHomeSeite() {
		return "home";
	}
} 
