
package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

//import com.example.demo.model.Ex7_model;
import com.example.demo.model.Pro_model;

import jakarta.transaction.Transactional;



public interface Pro_Repo extends JpaRepository<Pro_model, Long> {


	@Query(value="select *from trainbook where name=:s or degination=:sn",nativeQuery=true)
	public List<Pro_model> getstudentinfo(@Param("s") String name,@Param("sn") String degination);

	@Query(value="select *from trainbook where name=:s and degination=:sn",nativeQuery=true)
	public List<Pro_model> getandstudent(@Param("s") String name,@Param("sn") String degination);

	@Query(value="select * from trainbook where name like :g%",nativeQuery=true)
	public List<Pro_model> startwith(@Param("g") String name);

	@Query(value="select * from trainbook where name like %:g",nativeQuery=true)
	public List<Pro_model> endwith(@Param("g") String name);

	@Modifying
	@Transactional
	@Query(value="delete from trainbook where age=:s",nativeQuery=true)
	public Integer deletestudent(@Param("s") int id);

	@Modifying
	@Transactional
	@Query(value="update trainbook  set age=?1 where age=?2" ,nativeQuery=true)
	public Integer updateStudent(@Param("s") int age,@Param("s1") int newage);

	
}
