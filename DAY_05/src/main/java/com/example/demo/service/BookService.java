package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ex5_model;
import com.example.demo.repository.BooksRepo;
@Service
public class BookService {
	@Autowired
	BooksRepo sr;
	
	public List<Ex5_model> saveinfo(List<Ex5_model> ss){
		return sr.saveAll(ss);
	}
	
	public List<Ex5_model> showinfo() {
		return sr.findAll();
	}
	public Optional<Ex5_model> showbyid(int id){
		return sr.findById(id);
	}
	public Ex5_model changeinfo(Ex5_model ss) {
		return sr.saveAndFlush(ss);
	}
	public String updateinfobyid(int id,Ex5_model ss) {
		sr.saveAndFlush(ss);
		if(sr.existsById(id)) {
			return "Updated";
		}
		else {
			return "Enter valid id";
		}
	}
	public void deleteid(int id) {
		sr.deleteById(id);
	}
	public void deleteparm(int id) {
		sr.deleteById(id);
	}
	
	
	
}
