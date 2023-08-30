package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Ex8_model;
//import com.example.demo.model.Ex8_model;

public interface Ex8_repo extends JpaRepository<Ex8_model, Integer> {

	@Query(value="select * from startdetails where ownername like :g%",nativeQuery=true)
	public List<Ex8_model> startwith(@Param("g") String ownername);

	@Query(value="select * from startdetails where ownername like %:g",nativeQuery=true)
	public List<Ex8_model> endwith(@Param("g") String ownername);
}

