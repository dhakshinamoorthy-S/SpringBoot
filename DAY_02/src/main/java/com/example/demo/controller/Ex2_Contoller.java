package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex2_Contoller {
	@Value("${var}")
	private String name;
  @GetMapping("/ex2")
  public String display() {
	  return "I am "+name+" .";
  }
}
