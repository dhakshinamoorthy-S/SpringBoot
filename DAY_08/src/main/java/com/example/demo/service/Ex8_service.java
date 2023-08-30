package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ex8_model;
import com.example.demo.repository.Ex8_repo;

@Service
public class Ex8_service {
	 @Autowired
	 Ex8_repo sr;
	 public List<Ex8_model>saveinfo(List<Ex8_model>  ss){
		 return sr.saveAll(ss);
	 }
	 public List<Ex8_model>showinfo(){
		 return sr.findAll();
	 }
	 public  List<Ex8_model>withstart(String ownername){
		 return sr.startwith(ownername);
	 }
	 public List<Ex8_model>withend(String ownername){
		 return sr.endwith(ownername);
	 }
}
