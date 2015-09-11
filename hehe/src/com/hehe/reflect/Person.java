package com.hehe.reflect;

public class Person {
	private String name;
	private String email;
	
	public Person(){}
	public Person(String name,String email){
		this.name = name;
		this.email = name;
	}
	public String getName() {
		return name;
	}
	public String setName(String name) {
		this.name = name;
		return this.name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
