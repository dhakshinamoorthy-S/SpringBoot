package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ex6_model;
import com.example.demo.repository.BabyRepo;

@Service
public class BabyService {
		@Autowired
		BabyRepo sr;
		public List<Ex6_model> saveinfo(List<Ex6_model> ss){
			return (List<Ex6_model>)sr.saveAll(ss);
		}
		public List<Ex6_model>showinfo(){
			return sr.findAll();
		}
		public List<Ex6_model>sortinfo(String s){
			return sr.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
		}
		public List<Ex6_model>sortdescinfo(String s){
			return sr.findAll(Sort.by(Sort.Direction.DESC));
		}
		public List<Ex6_model> getbypage(int pgno,int pgsize){
			Page<Ex6_model> p=sr.findAll(PageRequest.of(pgno, pgsize));
			return p.getContent();
		}
		public List<Ex6_model> sortandpage(int pgno,int pgsize,String s){
			PageRequest p=PageRequest.of(pgno,pgsize,Sort.by(Sort.DEFAULT_DIRECTION,s));
			Page<Ex6_model> sd=sr.findAll(p);
			return sd.getContent();
		}
		public List<Ex6_model> sortandpagedesc(int pgno,int pgsize,String s){
			PageRequest p=PageRequest.of(pgno,pgsize,Sort.by(Sort.Direction.DESC,s));
			Page<Ex6_model> sd=sr.findAll(p);
			return sd.getContent();
		}
		
		
}
