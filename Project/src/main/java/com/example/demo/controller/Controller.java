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

import com.example.demo.model.Pro_model;
import com.example.demo.service.Pro_Service;

@RestController
public class Controller {
	@Autowired
		Pro_Service sser;
		@PostMapping("/post")
		public List<Pro_model> add(@RequestBody  List<Pro_model> ss) {
			return sser.saveinfo(ss);
		}
		@GetMapping("showdetails")
		public List<Pro_model>show(){
			return sser.showinfo();
		}
		@GetMapping("showbyid/{mobileno}")
		public Optional<Pro_model> showinfobyid(@PathVariable Long mobileno){
			return sser.showbyid(mobileno);
		}
		@PutMapping("/put")
		public Pro_model modify(Pro_model ss) {
			return sser.changeinfo(ss);
		}
		@PutMapping("putbyid/{mobileno}")
		public String modifybyid(@PathVariable Long mobileno,@RequestBody  Pro_model ss) {
			return sser.updatebyid(mobileno, ss);
		}
		@DeleteMapping("deletebyid/{mobileno}")
		public void deletebyid(@PathVariable Long mobileno) {
			sser.deleteid(mobileno);
		}
		@DeleteMapping("deleteparm")
		public void deleteparm(@RequestParam Long mobileno) {
			sser.deleteparm(mobileno);
		}
}
