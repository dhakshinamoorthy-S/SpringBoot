package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Ex2_model;

//import com.example.demo.model.Ex1_model;

@RestController
public class Ex2_homeController {
@GetMapping("/home2")
public List<Ex2_model>info(){
	return Arrays.asList
			(new Ex2_model("KAVIN",18,"KASIPALAYAM",638454,"GOBI","ERODE","TAMILNADU","INDIA"),
					(new Ex2_model("GURU PRAKASH",26,"KATCHAR",612204,"THIRU","THANJAVUR","TAMILNADU","INDIA")));
}
}
