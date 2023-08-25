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

import com.example.demo.model.Ex7_model;
//import com.example.demo.model.StudentEntity;
import com.example.demo.service.CarService;

@RestController
public class Controller {
	 @Autowired
	 CarService sser;
	 @PostMapping("/post")
	 public List<Ex7_model>savedetails(@RequestBody List<Ex7_model>ss){
		 return sser.saveinfo(ss);
	 }
	 @GetMapping("/showdetails")
	 public List<Ex7_model>showdetails(){
		 return sser.showinfo();
	 }
	 @GetMapping("/getnew/{owners}/{carType}")
		public List<Ex7_model> displayAll(@PathVariable int owners,@PathVariable String carType){ //or
			return sser.studentinfo(owners, carType);
		}
		@GetMapping("/andget/{owners}/{carType}")
		public List<Ex7_model>andget(@PathVariable int owners,@PathVariable String carType){  //and
			return sser.andStuent(owners, carType);
		}
		@GetMapping("/start/{owners}")
		public List<Ex7_model> starting(@PathVariable int owners){
			return sser.withstart(owners);
		}
		
		@GetMapping("/end/{addres}")
		public List<Ex7_model> ending(@PathVariable String addres){
			return sser.withend(addres);
		}
		@DeleteMapping("/delid/{id}")
		public String deleting(@PathVariable int id){
			return sser.deletinfo(id)+" DELETED";
		}
		@PutMapping("updat/{id}/{newid}")
		public String updating(@PathVariable int id,@PathVariable int newid) {
			return sser.updateinfo(id, newid)+" UPDATED";
		}
		
		
}
