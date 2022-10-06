package com.ecommerce.demo.controller;

import com.ecommerce.demo.models.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsersController {
	
	
	
	
	@GetMapping("/create-user")
	public String createUser(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "create-user";
	}
	
	
	@PostMapping("/create-user")
	public String processCreateUser(@ModelAttribute("user") User user) {
		
		System.out.println(user);
	
		return "create-user";
	}
	
	
	
	@GetMapping("/user")
	public String getUser(@RequestParam("id")String id, Model model) {
	
		return "user";
	}
	
	@GetMapping("/")
	public String home() {
		return "index";
	}

}
