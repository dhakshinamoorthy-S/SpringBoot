package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TrainBook")
public class Pro_model {
		private String name;
		private int age;
		private String gender;
		@Id
		private Long  mobileno;
		private String source;
		private String degination;
		private Date bookdate;
		public Pro_model() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Pro_model(String name, int age, String gender, Long mobileno, String source, String degination,
				Date bookdate) {
			super();
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.mobileno = mobileno;
			this.source = source;
			this.degination = degination;
			this.bookdate = bookdate;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public Long getMobileno() {
			return mobileno;
		}
		public void setMobileno(Long mobileno) {
			this.mobileno = mobileno;
		}
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getDegination() {
			return degination;
		}
		public void setDegination(String degination) {
			this.degination = degination;
		}
		public Date getBookdate() {
			return bookdate;
		}
		public void setBookdate(Date bookdate) {
			this.bookdate = bookdate;
		}
		
		
		
		
}
