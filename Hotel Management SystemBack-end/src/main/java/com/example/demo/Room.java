package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int room_id;
	int room_number;
	String service_type;
	int facility_id;
	String img;
	String s_disscriptions ;
	String l_disscriptions;
	public Room() {
		super();
	}
	public Room(int room_id, int room_number, String service_type, int facility_id, String img, String s_disscriptions,
			String l_disscriptions) {
		super();
		this.room_id = room_id;
		this.room_number = room_number;
		this.service_type = service_type;
		this.facility_id = facility_id;
		this.img = img;
		this.s_disscriptions = s_disscriptions;
		this.l_disscriptions = l_disscriptions;
	}
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public int getRoom_number() {
		return room_number;
	}
	public void setRoom_number(int room_number) {
		this.room_number = room_number;
	}
	public String getService_type() {
		return service_type;
	}
	public void setService_type(String service_type) {
		this.service_type = service_type;
	}
	public int getFacility_id() {
		return facility_id;
	}
	public void setFacility_id(int facility_id) {
		this.facility_id = facility_id;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getS_disscriptions() {
		return s_disscriptions;
	}
	public void setS_disscriptions(String s_disscriptions) {
		this.s_disscriptions = s_disscriptions;
	}
	public String getL_disscriptions() {
		return l_disscriptions;
	}
	public void setL_disscriptions(String l_disscriptions) {
		this.l_disscriptions = l_disscriptions;
	}
	@Override
	public String toString() {
		return "Room [room_id=" + room_id + ", room_number=" + room_number + ", service_type=" + service_type
				+ ", facility_id=" + facility_id + ", img=" + img + ", s_disscriptions=" + s_disscriptions
				+ ", l_disscriptions=" + l_disscriptions + ", getRoom_id()=" + getRoom_id() + ", getRoom_number()="
				+ getRoom_number() + ", getService_type()=" + getService_type() + ", getFacility_id()="
				+ getFacility_id() + ", getImg()=" + getImg() + ", getS_disscriptions()=" + getS_disscriptions()
				+ ", getL_disscriptions()=" + getL_disscriptions() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
