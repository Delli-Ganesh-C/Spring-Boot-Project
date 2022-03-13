package com.springboot.learning.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class Producer {
	
	WebClient webClient = WebClient.create();

}
