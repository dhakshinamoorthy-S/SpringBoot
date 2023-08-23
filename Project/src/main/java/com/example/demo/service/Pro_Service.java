package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Pro_model;
import com.example.demo.repository.Pro_Repo;

@Service
public class Pro_Service {
	@Autowired
		Pro_Repo sr;
		public List<Pro_model> saveinfo(List<Pro_model> ss){
			return sr.saveAll(ss);
		}
		public List<Pro_model>showinfo(){
			return sr.findAll();
			
		}
		public Optional<Pro_model> showbyid(Long mobileno){
			return sr.findById(mobileno);
		}
		public Pro_model changeinfo(Pro_model ss) {
			return sr.saveAndFlush(ss);
		}
		public String updatebyid(Long mobileno,Pro_model ss) {
			sr.saveAndFlush(ss);
			if(sr.existsById(mobileno)) {
				return "VAILD MOBILE NUMBER";
			}
			else {
				return "PLEASE CORRECT YOUR MOBILE NUMBER";
			}
		}
		public void deleteid(Long mobileno) {
			sr.deleteById(mobileno);
		}
		public void deleteparm(Long mobileno) {
			sr.deleteById(mobileno);
		}
		
}
