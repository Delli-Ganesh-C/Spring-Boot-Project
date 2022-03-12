package com.springboot.learning.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class Consumer {
	
	@GetMapping(value = "/status")
	public String status() {
		return "Success!!";
	}
}
