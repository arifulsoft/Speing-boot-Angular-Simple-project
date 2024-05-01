package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class HospitalDA {

	public Appointment saveAppointment(Appointment appointment){

		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/springdb","root","nclc123456");
			PreparedStatement pst=con.prepareStatement("INSERT INTO appointment VALUES(?,?,?,?,?,?)");
			pst.setString(1, appointment.getPatient_name());
			pst.setString(2, appointment.getDate());
			pst.setInt(3, appointment.getPhone());
			pst.setString(4, appointment.getDepartment_name());
			pst.setString(5, appointment.getEmail());
			pst.setInt(6, appointment.getDoctor_id());
			pst.executeUpdate();

			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return appointment;
	}
}


	
	

