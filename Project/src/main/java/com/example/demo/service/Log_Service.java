package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Login;
import com.example.demo.repository.Log_repo;

@Service
public class Log_Service {
	@Autowired
	Log_repo sr;
	public Login saveinfo(Login  ss){
		return sr.save(ss);
	}
	public List<Login>showinfo(){
		return sr.findAll();
	}
}
	
	

