package com.example.demo;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int booking_id;
	java.sql.Date checkin;
	java.sql.Date checkout;
	int room_number;
	int customar_id;
	int adulat;
	int child;
	String status;
	public Booking() {
		super();
	}
	public Booking(int booking_id, Date checkin, Date checkout, int room_number, int customar_id, int adulat, int child,
			String status) {
		super();
		this.booking_id = booking_id;
		this.checkin = checkin;
		this.checkout = checkout;
		this.room_number = room_number;
		this.customar_id = customar_id;
		this.adulat = adulat;
		this.child = child;
		this.status = status;
	}
	public int getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
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
	public int getAdulat() {
		return adulat;
	}
	public void setAdulat(int adulat) {
		this.adulat = adulat;
	}
	public int getChild() {
		return child;
	}
	public void setChild(int child) {
		this.child = child;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Booking [booking_id=" + booking_id + ", checkin=" + checkin + ", checkout=" + checkout
				+ ", room_number=" + room_number + ", customar_id=" + customar_id + ", adulat=" + adulat + ", child="
				+ child + ", status=" + status + ", getBooking_id()=" + getBooking_id() + ", getCheckin()="
				+ getCheckin() + ", getCheckout()=" + getCheckout() + ", getRoom_number()=" + getRoom_number()
				+ ", getCustomar_id()=" + getCustomar_id() + ", getAdulat()=" + getAdulat() + ", getChild()="
				+ getChild() + ", getStatus()=" + getStatus() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
