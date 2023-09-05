package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demo.model.Ex7_model;
//import com.example.demo.model.Ex6_model;
import com.example.demo.model.Pro_model;
import com.example.demo.service.Pro_Service;

@RestController
@CrossOrigin
public class Controller {
	@Autowired
		Pro_Service sser;  //json to java object
		@PostMapping("/post")
		public Pro_model add(@RequestBody Pro_model ss) {
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
		public Pro_model modify(@RequestBody Pro_model ss) {
			return sser.changeinfo(ss);
		}
		@PutMapping("putbyid/{mobileno}")
		public String modifybyid(@PathVariable Long mobileno,@RequestBody  Pro_model ss) {
			return sser.updatebyid(mobileno, ss);
		}
		@DeleteMapping("deletebyid/{mobileno}")
		public void deletebyid(@PathVariable Long mobileno) {
			sser.detelteid(mobileno);
		}
		@DeleteMapping("deleteparm")
		public void deleteparm(@RequestParam Long mobileno) {
			sser.deleteparm(mobileno);
		}
		@GetMapping("sort/{name}")
		public List<Pro_model>sort(@PathVariable String name){
			return sser.sortinfo(name);
		}
		@GetMapping("sortdesc/{name}")
		public List<Pro_model>sortdesc(@PathVariable String name){
			return sser.sortdescinfo(name);
		}
		@GetMapping("sortandpage/{pgno}/{pgsize}")
		public List<Pro_model>sortpage(@PathVariable int pgno,@PathVariable int pgsize){
			return sser.getbypage(pgno, pgsize);
		}
		@GetMapping("sortandpageid/{pgno}/{pgsize}/{name}")
		public List<Pro_model>sortpagease(@PathVariable int pgno,@PathVariable int pgsize,@PathVariable String name){
			return sser.sortandpage(pgno, pgsize, name);
		}
		@GetMapping("sortandpagedes/{pgno}/{pgsize}/{name}")
		public List<Pro_model> sortpagedesc(@PathVariable int pgno,@PathVariable int pgsize,@PathVariable String name ){
			return sser.sortandpagedesc(pgno, pgsize, name);
		}
		@GetMapping("/getnew/{name}/{degination}")
		public List<Pro_model> displayAll(@PathVariable String name,@PathVariable String degination){ //or
			return sser.studentinfo(name, degination);
		}
		@GetMapping("/andget/{name}/{degination}")
		public List<Pro_model>andget(@PathVariable String name,@PathVariable String degination){  //and
			return sser.andStuent(name, degination);
		}
		@GetMapping("/start/{name}")
		public List<Pro_model> starting(@PathVariable String name){
			return sser.withstart(name);
		}
		
		@GetMapping("/end/{name}")
		public List<Pro_model> ending(@PathVariable String name){
			return sser.withend(name);
		}
		@DeleteMapping("/delid/{age}")
		public String deleting(@PathVariable int age){
			return sser.deletinfo(age)+" DELETED";
		}
		@PutMapping("updat/{age}/{newage}")
		public String updating(@PathVariable int age,@PathVariable int newage) {
			return sser.updateinfo(age, newage)+" UPDATED";
		}
		
		
		
		
}
