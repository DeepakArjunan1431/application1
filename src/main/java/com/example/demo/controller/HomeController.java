package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class homecontroller {
	
	@GetMapping("/index")
	public String index() {
		return "This is from Home";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "This is from contact";
	}

}
