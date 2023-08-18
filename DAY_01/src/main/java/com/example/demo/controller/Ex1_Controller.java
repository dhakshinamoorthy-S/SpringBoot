package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex1_Controller 
{
@GetMapping("/name")
public String Welcome() 
{
	return "Welcome String Boot!";
}
	
}
