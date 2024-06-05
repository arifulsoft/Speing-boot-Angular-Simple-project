package com.example.demo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookingDA {
//	booking-data-show-----------------------------------------
	public List<Booking>allbook(int id) {
		List<Booking> sList= new ArrayList<>();
		
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","nclc123456");
			PreparedStatement pst=con.prepareStatement("select * from booking where room_no=? ");
			pst.setInt(1, id);
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
				System.out.println("works");		
				
				sList.add(new Booking(rs.getInt(1),rs.getDate(2),rs.getDate(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getString(8)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return sList;
	}
	
	
//	------------------------------booking Search Data -------------------------------------
	
	public Booking searchdata(int c_id)  {
		Booking e =null;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "nclc123456");
			PreparedStatement pst1 = con.prepareStatement("select * from booking where customar_id=?");
			pst1.setInt(1, c_id);
		
			ResultSet rs = pst1.executeQuery();
			while (rs.next()) {
				e=new Booking(rs.getInt(1),rs.getDate(2),rs.getDate(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getString(8));
			}

		} catch (Exception ex) {
			// TODO: handle exception
			System.out.println(ex);
		}

		return e;
	}
	
	
	
	
	
//	------------------------------Food order Search Data -------------------------------------
	
	public Foodtransaction ordersearchdata(int c_id)  {
		Foodtransaction e =null;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "nclc123456");
			PreparedStatement pst1 = con.prepareStatement("select * from foodtransaction where c_id=?");
			pst1.setInt(1, c_id);
		
			ResultSet rs = pst1.executeQuery();
			while (rs.next()) {
				e=new Foodtransaction(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getDouble(5),rs.getString(6));
			}

		} catch (Exception ex) {
			// TODO: handle exception
			System.out.println(ex);
		}

		return e;
	}
	
	
	
	
	
	
	
	
	
	
	
	//check in------------------------------------------------------
	public void checkin(int bookingId) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "nclc123456");
			PreparedStatement pst1 = con.prepareStatement("update booking  set status='check in' where booking_id=?");
			pst1.setInt(1, bookingId);
		
			pst1.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	//===================================check out======================================
	
	public void checkout(int bookingId) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "nclc123456");
			PreparedStatement pst1 = con.prepareStatement("update booking  set status='check out' where booking_id=?");
			pst1.setInt(1, bookingId);
		
			pst1.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	List<Booking> bookingList=new ArrayList<>();
	public List<Booking> precheckinlist(String passport, String nid){
		CustomarDA customarDA=new CustomarDA();
		Customar customar= customarDA.passNid(passport, nid);
		int c_id=customar.getCustomar_id();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "nclc123456");
			PreparedStatement pst1 = con.prepareStatement("select * from booking where customar_id=? and status='not check in'");
			pst1.setInt(1, c_id);
		
			ResultSet rs = pst1.executeQuery();
			while (rs.next()) {
				bookingList.add( new Booking(rs.getInt(1),rs.getDate(2),rs.getDate(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getString(8)));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return bookingList;
		}
	
	//======================================Check in List============================
	
	List<Booking> checkingList=new ArrayList<>();
	public List<Booking> checkinlist(String passport, String nid){
		CustomarDA customarDA=new CustomarDA();
		Customar customar= customarDA.passNid(passport, nid);
		int c_id=customar.getCustomar_id();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "nclc123456");
			PreparedStatement pst1 = con.prepareStatement("select * from booking where customar_id=? and status='check in'");
			pst1.setInt(1, c_id);
		
			ResultSet rs = pst1.executeQuery();
			while (rs.next()) {
				bookingList.add( new Booking(rs.getInt(1),rs.getDate(2),rs.getDate(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getString(8)));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return bookingList;
		}
	
	//================================ check out List==========================================
	
	List<Booking> checkoutlist=new ArrayList<>();
	public List<Booking> checkoutlist(String passport, String nid){
		CustomarDA customarDA=new CustomarDA();
		Customar customar= customarDA.passNid(passport, nid);
		int c_id=customar.getCustomar_id();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "nclc123456");
			PreparedStatement pst1 = con.prepareStatement("select * from booking where customar_id=? and status='check out'");
			pst1.setInt(1, c_id);
		
			ResultSet rs = pst1.executeQuery();
			while (rs.next()) {
				bookingList.add( new Booking(rs.getInt(1),rs.getDate(2),rs.getDate(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getString(8)));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return bookingList;
		}
	
	//=============================all booking list by date=======================================
	
	List<Booking> allbookinglist=new ArrayList<>();
	public List<Booking> allbookinglist(Date start, Date end){
		CustomarDA customarDA=new CustomarDA();
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "nclc123456");
			PreparedStatement pst1 = con.prepareStatement("select * from booking where checkin between ? and ? or checkout between ? and ?");
			pst1.setDate(1, start);
			pst1.setDate(2, end);
			pst1.setDate(3, start);
			pst1.setDate(4, end);
			ResultSet rs = pst1.executeQuery();
			while (rs.next()) {
				bookingList.add( new Booking(rs.getInt(1),rs.getDate(2),rs.getDate(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getString(8)));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return bookingList;
		}
	
	
	
	
}
