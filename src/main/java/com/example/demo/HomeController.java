package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.mode.Alien;


@Controller
public class HomeController {
	@Autowired
	private AlienRepo repo;
	
	@GetMapping("/t")
	public String home() {
		System.out.println("home controller");
		 return "index";
	}
	
	@PostMapping("/addAlien")
	public void addAlien(Alien a,Model m) {
    	   m.addAttribute("result",a);
     }
	
	@GetMapping("/getAliens")
	public String getAliens(Model m) {
		
		m.addAttribute("result",repo.findAll());
		return "showaliens";
		
	}
	
	
}
