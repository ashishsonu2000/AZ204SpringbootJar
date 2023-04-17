package com.az204.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzSpringbootController {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		
		return "Hello World";
	}

}
