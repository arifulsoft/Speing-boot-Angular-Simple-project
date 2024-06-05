package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	int room_number;
	int customar_id;
    double total_bill;
    double pay;
    double due;
    String status;
    String payment_type;
    String transaction_id;
	public Payment() {
		super();
	}
	public Payment(int id, int room_number, int customar_id, double total_bill, double pay, double due, String status,
			String payment_type, String transaction_id) {
		super();
		this.id = id;
		this.room_number = room_number;
		this.customar_id = customar_id;
		this.total_bill = total_bill;
		this.pay = pay;
		this.due = due;
		this.status = status;
		this.payment_type = payment_type;
		this.transaction_id = transaction_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoom_number() {
		return room_number;
	}
	public void setRoom_number(int room_number) {
		this.room_number = room_number;
	}
	public int getCustomar_id() {
		return customar_id;
	}
	public void setCustomar_id(int customar_id) {
		this.customar_id = customar_id;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	@Override
	public String toString() {
		return "Payment [id=" + id + ", room_number=" + room_number + ", customar_id=" + customar_id + ", total_bill="
				+ total_bill + ", pay=" + pay + ", due=" + due + ", status=" + status + ", payment_type=" + payment_type
				+ ", transaction_id=" + transaction_id + ", getId()=" + getId() + ", getRoom_number()="
				+ getRoom_number() + ", getCustomar_id()=" + getCustomar_id() + ", getTotal_bill()=" + getTotal_bill()
				+ ", getPay()=" + getPay() + ", getDue()=" + getDue() + ", getStatus()=" + getStatus()
				+ ", getPayment_type()=" + getPayment_type() + ", getTransaction_id()=" + getTransaction_id()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
    
}
