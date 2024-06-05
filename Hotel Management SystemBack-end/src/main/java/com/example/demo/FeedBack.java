package com.example.demo;

public class FeedBack {
	int id ;
	String name; 
	String email ;
	String massage ;
	public FeedBack() {
		super();
	}
	public FeedBack(int id, String name, String email, String massage) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.massage = massage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMassage() {
		return massage;
	}
	public void setMassage(String massage) {
		this.massage = massage;
	}
	@Override
	public String toString() {
		return "FeedBack [id=" + id + ", name=" + name + ", email=" + email + ", massage=" + massage + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getEmail()=" + getEmail() + ", getMassage()=" + getMassage()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
