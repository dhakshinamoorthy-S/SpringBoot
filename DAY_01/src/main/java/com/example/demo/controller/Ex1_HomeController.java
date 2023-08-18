package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Ex1_model;

@RestController
public class Ex1_HomeController {
   @GetMapping("/home1")
   public List<Ex1_model>info()
   {
	   return Arrays.asList
	 (new Ex1_model("ATHI KESAVAN","Hi friend"),
		(new Ex1_model("GURU PRAKASH","How are you??")));	   
   }
}
