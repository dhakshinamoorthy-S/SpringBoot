package com.example.demo.model;

//import java.util.List;

///import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="logindetails")
public class Login {
	
	@Id
	private String mailid;
	private String username;
	private  String password;

	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(String mailid, String username, String password) {
		super();
		this.mailid = mailid;
		this.username = username;
		this.password = password;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
