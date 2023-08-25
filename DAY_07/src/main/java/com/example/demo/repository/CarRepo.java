package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Ex7_model;
//import com.example.demo.model.StudentEntity;

import jakarta.transaction.Transactional;

//import org.springframework.stereotype.Repository;


public interface CarRepo extends JpaRepository<Ex7_model, Integer> {

	@Query(value="select *from cardetails where owners=:s or carType=:sn",nativeQuery=true)
	public List<Ex7_model> getstudentinfo(@Param("s")int owners,@Param("sn") String carType);

	@Query(value="select *from cardetails where owners=:s and carType=:sn",nativeQuery=true)
	public List<Ex7_model> getandstudent(@Param("s") int owners,@Param("sn") String carType);

	@Query(value="select * from cardetails where owners like :g%",nativeQuery=true)
	public List<Ex7_model> startwith(@Param("g") int owners);

	@Query(value="select * from cardetails where addres like %:g",nativeQuery=true)
	public List<Ex7_model> endwith(@Param("g") String addres);

	@Modifying
	@Transactional
	@Query(value="delete from cardetails where id=:s",nativeQuery=true)
	public Integer deletestudent(@Param("s") int id);

	@Modifying
	@Transactional
	@Query(value="update cardetails  set id=?1 where id=?2" ,nativeQuery=true)
	public Integer updateStudent(@Param("s") int id,@Param("s1") int newid);

}
