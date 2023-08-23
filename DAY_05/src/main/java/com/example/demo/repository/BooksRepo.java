package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Ex5_model;

public interface BooksRepo  extends JpaRepository<Ex5_model,Integer>{

}
