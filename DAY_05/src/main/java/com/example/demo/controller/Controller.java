package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Ex5_model;
import com.example.demo.service.BookService;

@RestController
public class Controller {
	@Autowired
   BookService sser;
	@PostMapping("/post")
	public List<Ex5_model> add(@RequestBody  List<Ex5_model> ss){
		return sser.saveinfo(ss);
	}
	@GetMapping("/showdetails")
	public List<Ex5_model> show() {
		return sser.showinfo();
	}
	@GetMapping("showdetails/{id}")
	public Optional<Ex5_model> showbyid( @PathVariable int id){
		return sser.showbyid(id);
	}
	@PutMapping("/update")
	public Ex5_model modify(@RequestBody Ex5_model ss) {
		return sser.changeinfo(ss);
	}
	@PutMapping("update/{id}")
	public  String updateby(@PathVariable  int id,@RequestBody Ex5_model ss) {
		return sser.updateinfobyid(id, ss);
	}
	

	@DeleteMapping("delete/{id}")
	public void deleteid(@PathVariable int id) {
		sser.deleteid(id);
	}
	@DeleteMapping("/deleteparm")
	public void deleteparm(@RequestParam int id) {
		sser.deleteparm(id);
	}
   
}
