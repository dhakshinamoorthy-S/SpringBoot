package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Ex6_model;
import com.example.demo.service.BabyService;

@RestController
public class Controller {
		@Autowired
		BabyService sser;
		@PostMapping("/post")
		public List<Ex6_model> savedetails(@RequestBody List<Ex6_model> ss){
			return (List<Ex6_model>)sser.saveinfo(ss);
		}
		@GetMapping("/showdetails")
		public List<Ex6_model>showdetails(){
			return sser.showinfo();
		}
		@GetMapping("sort/{babyFirstName}")
		public List<Ex6_model>sort(String s){
			return sser.sortinfo(s);
		}
		@GetMapping("sortdesc/{babyFirstName}")
		public List<Ex6_model>sortdesc(String s){
			return sser.sortdescinfo(s);
		}
		@GetMapping("sortandpage/{pgno}/{pgsize}")
		public List<Ex6_model>sortpage(@PathVariable int pgno,@PathVariable int pgsize){
			return sser.getbypage(pgno, pgsize);
		}
		@GetMapping("sortandpageid/{pgno}/{pgsize}/{babyFirstName}")
		public List<Ex6_model>sortpagease(@PathVariable int pgno,@PathVariable int pgsize,@PathVariable String s){
			return sser.sortandpage(pgno, pgsize, s);
		}
		@GetMapping("sortandpagedes/{pgno}/{pgsize}/{babyFirstName}")
		public List<Ex6_model> sortpagedesc(@PathVariable int pgno,@PathVariable int pgsize,@PathVariable String s ){
			return sser.sortandpagedesc(pgno, pgsize, s);
		}
		
		
}
