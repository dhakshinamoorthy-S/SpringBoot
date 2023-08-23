package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Pro_model;



public interface Pro_Repo extends JpaRepository<Pro_model, Long> {

}
