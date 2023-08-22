package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ex4_model;

import com.example.demo.repository.StudentRepo;

@Service		
public class StudentService {
	@Autowired
	StudentRepo sr;
	
	public Ex4_model saveinfo(Ex4_model ss)
	{
		return sr.save(ss);
	}
	public List<Ex4_model>showinfo(){
		return sr.findAll();
	}
	
	public Ex4_model changeinfo(Ex4_model ss) {
		return sr.saveAndFlush(ss);
	}
	public void deleteinfo(Ex4_model ss) {
	   sr.delete(ss);
	}
	public void deleteid(int id) {
		sr.deleteById(id);
	}
}
