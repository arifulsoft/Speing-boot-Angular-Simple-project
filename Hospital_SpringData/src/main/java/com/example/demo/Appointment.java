package com.example.demo;

public class Appointment {
	String patient_name;
	    String date;
	    int phone;
	    String department_name;
	    String email;
	   int doctor_id;
	public Appointment() {
		super();
	}
	public Appointment(String patient_name, String date, int phone, String department_name, String email,
			int doctor_id) {
		super();
		this.patient_name = patient_name;
		this.date = date;
		this.phone = phone;
		this.department_name = department_name;
		this.email = email;
		this.doctor_id = doctor_id;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}
	@Override
	public String toString() {
		return "Appointment [patient_name=" + patient_name + ", date=" + date + ", phone=" + phone
				+ ", department_name=" + department_name + ", email=" + email + ", doctor_id=" + doctor_id + "]";
	}	
	   

}
