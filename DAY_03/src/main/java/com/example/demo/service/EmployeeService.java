package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ex3_model;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeService {
			@Autowired
			EmployeeRepo sr;
			
			public Ex3_model saveinfo(Ex3_model ss) {
				return sr.save(ss);
			}
			public List<Ex3_model>showinfo(){
				return sr.findAll();
			}
			
			
}
