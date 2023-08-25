package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ex7_model;
//import com.example.demo.model.StudentEntity;
import com.example.demo.repository.CarRepo;

@Service
public class CarService {
		@Autowired
		CarRepo sr;
		public List<Ex7_model> saveinfo(List<Ex7_model>ss){
			return sr.saveAll(ss);
		}
		public List<Ex7_model>showinfo(){
			return sr.findAll();
		}
		public List<Ex7_model> studentinfo(int owners,String carType){
			return sr.getstudentinfo(owners,carType);
		}
		public List<Ex7_model>andStuent(int owners,String carType){
			return sr.getandstudent(owners,carType);
		}
		public List<Ex7_model>withstart(int owners){
			return sr.startwith(owners);
		}
		public List<Ex7_model>withend(String addres){
			return sr.endwith(addres);
		}
		public Integer deletinfo(int s) {
			return sr.deletestudent(s);
		}
		public Integer updateinfo(int s,int s1) {
			return sr.updateStudent(s, s1);
		}
		
		
}
