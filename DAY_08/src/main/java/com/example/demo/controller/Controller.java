package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Ex8_model;
import com.example.demo.service.Ex8_service;

@RestController
public class Controller {
	@Autowired
	Ex8_service sser;
	@PostMapping("/post")
	public List<Ex8_model>savedetails(@RequestBody List<Ex8_model>ss){
		return sser.saveinfo(ss);
	}
	@GetMapping("/showdetails")
	public List<Ex8_model>showdetails(){
		return sser.showinfo();
	}
	@GetMapping("start/{ownername}")
	public List<Ex8_model>startinfo( @PathVariable String ownername){
		return sser.withstart(ownername);
	}
	@GetMapping("end/{name}")
	public List<Ex8_model>endinfo( @PathVariable String ownername){
		return sser.withend(ownername);
	}
	
	
	
	
	
}
