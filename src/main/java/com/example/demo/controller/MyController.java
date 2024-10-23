package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/getDS")
	public String getDoctorService() {
		return "client2 microservice called...";
	}

	@GetMapping("/welcome/{name}")
	public String wish(@PathVariable String name) {
		return "Hi "+name+" Welcome to Doctor Service";
	}
}
