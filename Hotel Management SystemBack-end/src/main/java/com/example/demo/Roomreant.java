package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Roomreant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
    int room_no;
    double room_reant;
    double service_bill;
    
	public Roomreant() {
		super();
	}
	public Roomreant(int id, int room_no, double room_reant, double service_bill) {
		super();
		this.id = id;
		this.room_no = room_no;
		this.room_reant = room_reant;
		this.service_bill = service_bill;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoom_no() {
		return room_no;
	}
	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}
	public double getRoom_reant() {
		return room_reant;
	}
	public void setRoom_reant(double room_reant) {
		this.room_reant = room_reant;
	}
	public double getService_bill() {
		return service_bill;
	}
	public void setService_bill(double service_bill) {
		this.service_bill = service_bill;
	}
	@Override
	public String toString() {
		return "RoomreantDA [id=" + id + ", room_no=" + room_no + ", room_reant=" + room_reant + ", service_bill="
				+ service_bill + ", getId()=" + getId() + ", getRoom_no()=" + getRoom_no() + ", getRoom_reant()="
				+ getRoom_reant() + ", getService_bill()=" + getService_bill() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
