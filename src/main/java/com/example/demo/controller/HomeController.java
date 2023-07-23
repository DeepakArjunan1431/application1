package com.example.demo.controller;




import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HomeController {
	
	@RequestMapping("/employees12")
	public String employee12() {
		return "This is the 1st Application";
		}
	
	

}
