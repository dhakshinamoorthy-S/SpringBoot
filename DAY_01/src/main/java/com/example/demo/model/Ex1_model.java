package com.example.demo.model;

public class Ex1_model {
   private String Name;
   private String Message;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getMessage() {
	return Message;
}
public void setMessage(String message) {
	Message = message;
}
public Ex1_model(String name, String message) {
	super();
	Name = name;
	Message = message;
}
   
   
}
