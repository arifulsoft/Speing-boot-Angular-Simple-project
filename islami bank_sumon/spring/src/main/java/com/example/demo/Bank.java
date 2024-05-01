package com.example.demo;

public class Bank {
String username;
String email;
String password;




public Bank() {
	super();
}
public Bank(String username, String email, String password) {
	super();
	this.username = username;
	this.email = email;
	this.password = password;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Bank [username=" + username + ", email=" + email + ", password=" + password + ", getUsername()="
			+ getUsername() + ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}
