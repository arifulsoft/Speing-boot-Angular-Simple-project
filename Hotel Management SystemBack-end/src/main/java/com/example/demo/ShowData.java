package com.example.demo;

import java.sql.Date;

public class ShowData {
	java.sql.Date checkin;
	java.sql.Date checkout;
	String name;
	String phone;
	double total_bill;
    double pay;
    double due;
	public ShowData() {
		super();
	}
	public ShowData(Date checkin, Date checkout, String name, String phone, double total_bill, double pay, double due) {
		super();
		this.checkin = checkin;
		this.checkout = checkout;
		this.name = name;
		this.phone = phone;
		this.total_bill = total_bill;
		this.pay = pay;
		this.due = due;
	}
	public java.sql.Date getCheckin() {
		return checkin;
	}
	public void setCheckin(java.sql.Date checkin) {
		this.checkin = checkin;
	}
	public java.sql.Date getCheckout() {
		return checkout;
	}
	public void setCheckout(java.sql.Date checkout) {
		this.checkout = checkout;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public double getTotal_bill() {
		return total_bill;
	}
	public void setTotal_bill(double total_bill) {
		this.total_bill = total_bill;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	public double getDue() {
		return due;
	}
	public void setDue(double due) {
		this.due = due;
	}
	@Override
	public String toString() {
		return "ShowData [checkin=" + checkin + ", checkout=" + checkout + ", name=" + name + ", phone=" + phone
				+ ", total_bill=" + total_bill + ", pay=" + pay + ", due=" + due + ", getCheckin()=" + getCheckin()
				+ ", getCheckout()=" + getCheckout() + ", getName()=" + getName() + ", getPhone()=" + getPhone()
				+ ", getTotal_bill()=" + getTotal_bill() + ", getPay()=" + getPay() + ", getDue()=" + getDue()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
    
    
}
