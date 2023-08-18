package com.example.demo.controller;

//import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex2_Controller {
 
 private String name;
@GetMapping("/my")
public String GetName() {
	name="S,DHAKSHINAMOORTHY";
	return "Welcome " +name+ " !";
}
}
