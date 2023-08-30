package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

//import com.example.demo.model.Ex7_model;
//import com.example.demo.model.Ex6_model;
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
		public List<Pro_model>sortinfo(String name){
			return sr.findAll(Sort.by(Sort.DEFAULT_DIRECTION,name));
		}
		public List<Pro_model>sortdescinfo(String name){
			return sr.findAll(Sort.by(Sort.Direction.DESC,name));
		}
		public List<Pro_model> getbypage(int pgno,int pgsize){
			Page<Pro_model> p=sr.findAll(PageRequest.of(pgno, pgsize));
			return p.getContent();
		}
		public List<Pro_model> sortandpage(int pgno,int pgsize,String s){
			PageRequest p=PageRequest.of(pgno,pgsize,Sort.by(Sort.DEFAULT_DIRECTION,s));
			Page<Pro_model> sd=sr.findAll(p);
			return sd.getContent();
		}
		public List<Pro_model> sortandpagedesc(int pgno,int pgsize,String s){
			PageRequest p=PageRequest.of(pgno,pgsize,Sort.by(Sort.Direction.DESC,s));
			Page<Pro_model> sd=sr.findAll(p);
			return sd.getContent();
		}
		public List<Pro_model> studentinfo(String name,String degination){
			return sr.getstudentinfo(name,degination);
		}
		public List<Pro_model>andStuent(String name,String degination){
			return sr.getandstudent(name,degination);
		}
		public List<Pro_model>withstart(String name){
			return sr.startwith(name);
		}
		public List<Pro_model>withend(String name){
			return sr.endwith(name);
		}
		public Integer deletinfo(int s) {
			return sr.deletestudent(s);
		}
		public Integer updateinfo(int s,int s1) {
			return sr.updateStudent(s, s1);
		}
		
		
		
}
