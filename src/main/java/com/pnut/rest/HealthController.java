package com.pnut.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HealthController {

	@RequestMapping("/health")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}