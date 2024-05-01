package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BankDa {

	public Bank save(Bank s) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bank", "root", "nclc123456");
			PreparedStatement pst = con.prepareStatement("INSERT INTO registration VALUES(?,?,?)");
			pst.setString(1, s.getUsername());
			pst.setString(2, s.getEmail());
			pst.setString(3, s.getPassword());
			
			pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return s;
	}
	
////	------------------------------- show data ------------------------------------------
//	public List<Bank> allstudent() {
//		List<Bank> slist = new ArrayList<>();
//		try {
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bank", "root", "nclc123456");
//			PreparedStatement pst = con.prepareStatement("select * from registration");
//			ResultSet rs = pst.executeQuery();
//			while (rs.next()) {
//				slist.add(new Bank(rs.getString(1), rs.getString(2), rs.getString(3)));
//			}
//
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//
//		return slist;
//	}


	//----------------------login method--------------------
	
	public Bank search(String username,String password) {
		Bank e =null;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bank", "root", "nclc123456");
			PreparedStatement ps = con.prepareStatement("select * from registration where username=? and password=?");
			ps.setString(1,username);
			ps.setString(2, password);
			
			
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				e=new Bank(rs.getString(1), rs.getString(2), rs.getString(3));
			}

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return e;
	}
	
	//search by username
	public Bank usearch(String username) {
		Bank e =null;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bank", "root", "nclc123456");
			PreparedStatement ps = con.prepareStatement("select * from registration where username=?");
			ps.setString(1,username);
		
			
			
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				e=new Bank(rs.getString(1), rs.getString(2), rs.getString(3));
			}

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return e;
	}
	
//	.....................Update data in database................
	
	
	public Bank update(Bank s) {
	
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bank", "root", "nclc123456");
			PreparedStatement pst1 = con.prepareStatement("update registration set email=?,password=? where username=?");
		
			System.out.println(pst1);
		
			pst1.setString(1,s.getEmail());
			pst1.setString(2, s.getPassword());
			pst1.setString(3, s.getUsername());
			System.out.println(pst1);
//			pst1.setString(1,s.getEmail());
//			pst1.setString(2,s.getPassword());
//			pst1.setString(3,s.getUsername());
		
		  pst1.executeUpdate();
		System.out.println("update");
			con.close();

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return s;
	}
	
//	------------------------------- show data ------------------------------------------
	public List<Bank> showData() {
		List<Bank> slist = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bank", "root", "nclc123456");
			PreparedStatement pst = con.prepareStatement("select * from registration");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				slist.add(new Bank(rs.getString(1), rs.getString(2), rs.getString(3)));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return slist;
	}
	
	//-------delete account
	public void delete(String username) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bank", "root", "nclc123456");
			PreparedStatement pst = con.prepareStatement("delete from  registration where username=?");
			pst.setString(1, username);
			
			pst.executeUpdate();
			con.close();
			System.out.println("deleted");

		} catch (Exception e) {
			// TODO: handle exception
		}

	
	}

	

}
