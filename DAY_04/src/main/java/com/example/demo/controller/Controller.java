package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Ex4_model;

import com.example.demo.service.StudentService;

@RestController
public class Controller {
		
	@Autowired
	StudentService sser;
@PostMapping("/post")
public Ex4_model add(@RequestBody Ex4_model ss) {
	return sser.saveinfo(ss);
}
@GetMapping("/showdetails")
public List<Ex4_model>show(){
	return sser.showinfo();
}
@PutMapping("/update")
public Ex4_model modify(@RequestBody Ex4_model ss) {
	return sser.changeinfo(ss);
}
@DeleteMapping("/deletedetails")
public String del(@RequestBody Ex4_model ss) {
	sser.deleteinfo(ss);
	return "Deleted Successfully";
}
@DeleteMapping("deleteid/{id}")
 public void deteleid(@PathVariable int id) {
	sser.deleteid(id);
}
}
