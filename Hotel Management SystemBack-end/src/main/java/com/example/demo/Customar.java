package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int customar_id;
	String name;
	String email;
	String phone;
	String passport;
	String nid;
	int room_number;
	public Customar() {
		super();
	}
	public Customar(int customar_id, String name, String email, String phone, String passport, String nid,
			int room_number) {
		super();
		this.customar_id = customar_id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.passport = passport;
		this.nid = nid;
		this.room_number = room_number;
	}
	public int getCustomar_id() {
		return customar_id;
	}
	public void setCustomar_id(int customar_id) {
		this.customar_id = customar_id;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	public String getNid() {
		return nid;
	}
	public void setNid(String nid) {
		this.nid = nid;
	}
	public int getRoom_number() {
		return room_number;
	}
	public void setRoom_number(int room_number) {
		this.room_number = room_number;
	}
	@Override
	public String toString() {
		return "Customar [customar_id=" + customar_id + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", passport=" + passport + ", nid=" + nid + ", room_number=" + room_number + ", getCustomar_id()="
				+ getCustomar_id() + ", getName()=" + getName() + ", getEmail()=" + getEmail() + ", getPhone()="
				+ getPhone() + ", getPassport()=" + getPassport() + ", getNid()=" + getNid() + ", getRoom_number()="
				+ getRoom_number() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
