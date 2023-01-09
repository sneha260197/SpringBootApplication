package com.springboot.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.sample.dto.StringResponse;

@RestController
public class SampleController {
	
	private static final String template = "Hello %s!";
	
	@GetMapping("/defaultHello")
	public StringResponse defaultHello(@RequestParam(value = "message", defaultValue = "World") String message) {
		return new StringResponse(String.format(template, message));
	}
	
	@PostMapping("/customHello")
	public StringResponse customHello(@RequestBody StringResponse response) {
		return new StringResponse(response.getEcho());
	}
	
}
