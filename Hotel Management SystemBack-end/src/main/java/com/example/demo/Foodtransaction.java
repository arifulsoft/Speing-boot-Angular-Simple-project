package com.example.demo;

public class Foodtransaction {
	
	int s_number;
	int c_id;
	String f_type;
	String f_menu;
	double amount;
	String date;
	
	public Foodtransaction() {
		super();
	}

	public Foodtransaction(int s_number, int c_id, String f_type, String f_menu, double amount, String date) {
		super();
		this.s_number = s_number;
		this.c_id = c_id;
		this.f_type = f_type;
		this.f_menu = f_menu;
		this.amount = amount;
		this.date = date;
	}

	public int getS_number() {
		return s_number;
	}

	public void setS_number(int s_number) {
		this.s_number = s_number;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getF_type() {
		return f_type;
	}

	public void setF_type(String f_type) {
		this.f_type = f_type;
	}

	public String getF_menu() {
		return f_menu;
	}

	public void setF_menu(String f_menu) {
		this.f_menu = f_menu;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Foodtransaction [s_number=" + s_number + ", c_id=" + c_id + ", f_type=" + f_type + ", f_menu=" + f_menu
				+ ", amount=" + amount + ", date=" + date + ", getS_number()=" + getS_number() + ", getC_id()="
				+ getC_id() + ", getF_type()=" + getF_type() + ", getF_menu()=" + getF_menu() + ", getAmount()="
				+ getAmount() + ", getDate()=" + getDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
