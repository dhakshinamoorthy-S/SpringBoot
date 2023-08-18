package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex3_Contoller {
	@Value("${var1}")
	private String Color;
@GetMapping("/color")
public String MyFav() 
{
	return "My favorite color is "+ Color;
}
}
