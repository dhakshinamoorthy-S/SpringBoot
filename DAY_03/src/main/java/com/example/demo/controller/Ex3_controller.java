package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Ex3_model;
import com.example.demo.service.EmployeeService;




@RestController
public class Ex3_controller {
	@Autowired
		EmployeeService sser;
	@PostMapping("/post")
	public Ex3_model add(@RequestBody Ex3_model ss) {
		return sser.saveinfo(ss);
	}
	@GetMapping("/Employeedetails")
	public List<Ex3_model>show(){
		return sser.showinfo();
	}
}
	
