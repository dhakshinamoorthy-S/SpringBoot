package com.example.demo.model;

//import java.security.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="traindet")
public class Details {
	@Id
	private int trainno;
	private String time;
	private String atstart;
	private String atend;
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Details(int trainno, String time, String atstart, String atend) {
		super();
		this.trainno = trainno;
		this.time = time;
		this.atstart = atstart;
		this.atend = atend;
	}
	public int getTrainno() {
		return trainno;
	}
	public void setTrainno(int trainno) {
		this.trainno = trainno;
	}
	public String getTime() {
		return time;
	}
	public void setTime( String time) {
		this.time = time;
	}
	public String getAtstart() {
		return atstart;
	}
	public void setAtstart(String atstart) {
		this.atstart = atstart;
	}
	public String getAtend() {
		return atend;
	}
	public void setAtend(String atend) {
		this.atend = atend;
	}
	
}
