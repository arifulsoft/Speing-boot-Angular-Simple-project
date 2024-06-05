package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomarDA {
//	------------------------------ 
	public Customar book(Customar s) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "nclc123456");
			PreparedStatement pst = con.prepareStatement("INSERT INTO customar VALUES(?,?,?,?,?,?,?)");
			pst.setInt(1, s.getCustomar_id());
			pst.setString(2, s.getName());
			pst.setString(3, s.getEmail());
			pst.setString(4, s.getPhone());
			pst.setString(5, s.getPassport());
			pst.setString(6, s.getNid());
			pst.setInt(7, s.getRoom_number());

			pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return s;
	}

//	------------------------------ 
	public Foodtransaction addorder(Foodtransaction s) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "nclc123456");
			PreparedStatement pst = con.prepareStatement("INSERT INTO foodtransaction VALUES(?,?,?,?,?,?)");
			pst.setInt(1, s.getS_number());
			pst.setInt(2, s.getC_id());
			pst.setString(3, s.getF_type());
			pst.setString(4, s.getF_menu());
			pst.setDouble(5, s.getAmount());
			pst.setString(6, s.getDate());

			pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return s;
	}

//	customar-data-show-----------------------------------------
	public Customar booksingle(int id) {
		Customar roomrent = null;

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "nclc123456");
			PreparedStatement pst = con.prepareStatement("select * from customar where room_number=?");

			pst.setInt(1, id);

			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				System.out.println("works");
				roomrent = new Customar(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getInt(7));

			}
			System.out.println("find by id");

		} catch (Exception e) {
			// TODO: handle exception
		}
		return roomrent;

	}

//	customar-passport-nid-----------------------------------------
	public Customar passNid(String passport, String nid) {
		Customar roomrent = null;
		System.out.println("customer query works - 1");

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "nclc123456");
			PreparedStatement pst = con.prepareStatement("select * from customar where passport=? or nid=?");
			System.out.println("customer query works - 2");
			pst.setString(1, passport);
			pst.setString(2, nid);
			System.out.println("customer query works - 3");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				System.out.println("customer query works-4");
				roomrent = new Customar(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getInt(7));

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return roomrent;

	}
	
	
	
}
