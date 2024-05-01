package com.example.demo;

public class Doctors {
	int doctor_id;
	String doctor_name;
	String specialization;
	String department_name;
	public Doctors() {
		super();
	}
	public Doctors(int doctor_id, String doctor_name, String specialization, String department_name) {
		super();
		this.doctor_id = doctor_id;
		this.doctor_name = doctor_name;
		this.specialization = specialization;
		this.department_name = department_name;
	}
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getDoctor_name() {
		return doctor_name;
	}
	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	@Override
	public String toString() {
		return "Doctors [doctor_id=" + doctor_id + ", doctor_name=" + doctor_name + ", specialization=" + specialization
				+ ", department_name=" + department_name + ", getDoctor_id()=" + getDoctor_id() + ", getDoctor_name()="
				+ getDoctor_name() + ", getSpecialization()=" + getSpecialization() + ", getDepartment_name()="
				+ getDepartment_name() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
