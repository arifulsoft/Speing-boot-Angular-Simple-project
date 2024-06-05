package com.example.demo;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.sql.Date;

public class RoomDA {
	
//	String url="";
//	String user="";
//	String pass="";
//	String showallrooms="";
	
//	public List<Room> allroom() {
//		List<Room> alldata=new ArrayList<>();
//		try {
//			Connection con=DriverManager.getConnection(url,user,pass);
//			PreparedStatement ps=con.prepareStatement(showallrooms);
//			ResultSet rs=ps.executeQuery();
//			while(rs.next()) {
//				alldata.add(new Room(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5)));
//			}
//			
//		}catch(Exception e) {
//			
//		}
//		
//		return alldata;
//	}
	
	
//	public List<Room> allroom() {
//		List<Room> alldata=new ArrayList<>();
//		try {
//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","nclc123456");
//			PreparedStatement ps=con.prepareStatement("select * from room");
//			ResultSet rs=ps.executeQuery();
//			while(rs.next()) {
//				alldata.add(new Room(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5)));
//			}
//			
//		}catch(Exception e) {
//			
//		}
//		
//		return alldata;
//	}
//	public Room roomById(int id){
//		Room room=new Room();
//		try {
//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","nclc123456");
//			PreparedStatement ps=con.prepareStatement("select * from room where room_number=?");
//			ps.setInt(1, id);
//			ResultSet rs=ps.executeQuery();
//			while(rs.next()) {
//				room=new Room(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7));
//			}
//		}catch(Exception e) {
//			
//		}
//		
//		return room;
//	}
	


	
	public Room roomById(int id) {
		Room e =null;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "nclc123456");
			PreparedStatement pst1 = con.prepareStatement("select * from room where room_number=?");
			pst1.setInt(1, id);
		
			ResultSet rs = pst1.executeQuery();
			while (rs.next()) {
				e=new Room(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7));
			}

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return e;
	}
	
	//------------------------check available rooms----------------------------
//	List<Room> availableRoom=new ArrayList<>();
//	List<Booking> roombycheckin=new ArrayList<>();
//	List<Booking> roombycheckout=new ArrayList<>();
//	
//	public List<Room> availableRooms(Date checkin, Date Checkout){
//		
//		System.out.println(checkin);
//		System.out.println(Checkout);
//		
//		try {
//			//---------Convart Date
//			SimpleDateFormat obj=new SimpleDateFormat("MM-dd-yyyy");
//			SimpleDateFormat obj1=new SimpleDateFormat("yyyy-MM-dd");
////			Date checkindate=obj1.parse(checkin);
////			Date checkoutdate=obj1.parse(Checkout);
//			
//			long check_indate=checkin.getTime();
//			long check_outdate=Checkout.getTime();
////			int checkin_date=checkindate.getDate();
////			int checkout_date=checkoutdate.getDate();
//			
//			
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "nclc123456");
//			PreparedStatement pst1 = con.prepareStatement("select * from booking order by room_no, checkin;");
////			pst1.setString(1, Checkout);
////			pst1.setTimestamp(1, Timestamp.valueOf(Checkout));
////			where str_to_date(checkin,%m/%d/%Y)>str_to_date(?,%m/%d/%Y)
//			
//			ResultSet rs = pst1.executeQuery();
//			 
//			while (rs.next()) {
//				System.out.println(rs.getInt(1));
//				Date check_in=obj.parse(rs.getString(2));
//				Date check_out=obj.parse(rs.getString(3));
//				
//				long dcheck_in=check_in.getTime();
//				long dcheck_out=check_out.getTime();
//				if(dcheck_in > check_outdate || dcheck_out>check_indate) {
//					roombycheckin.add( new Booking(rs.getInt(1), rs.getDate(2), rs.getDate(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7),rs.getString(8)));
//				}
//				
//			}
//			for(int i=0;i<roombycheckin.size();i++) {
//				System.out.println(roombycheckin.get(i).booking_id+" "+roombycheckin.get(i).room_number+" "+roombycheckin.get(i).checkin+" "+roombycheckin.get(i).checkout);
//			}
//			 
//		}catch(Exception e) {
//			System.out.println(e);
//			
//		}
//		
//		return availableRoom;
//	}
//	
	
	
	
	//===================================Find Available Rooms=============================
	
	public List<Room> findAvailableRooms(Date startDate, Date endDate){
		List<Room> availableRooms=new ArrayList<>();
		System.out.println(startDate);
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "nclc123456");
			PreparedStatement psAllRooms=con.prepareStatement("SELECT * FROM room");
			ResultSet rsAllRooms=psAllRooms.executeQuery();
			System.out.println("1st part");
			//part2
			String queryBooking = "SELECT * FROM booking WHERE checkin BETWEEN ? AND ? OR checkout BETWEEN ? AND ?";
			PreparedStatement psBookings = con.prepareStatement(queryBooking);
			psBookings.setDate(1, startDate );
			psBookings.setDate(2, endDate);
			psBookings.setDate(3, startDate);
			psBookings.setDate(4, endDate);
			ResultSet rsBookings=psBookings.executeQuery();
			System.out.println("2nd part");
			
			//part 3
			
			while(rsAllRooms.next()) {
				boolean isBooked = false;
				int roomId=rsAllRooms.getInt(2);
//				rsBookings.beforeFirst();
				while (rsBookings.next()) {
					System.out.println(rsBookings.getInt(4));
					int bookedRoomId=rsBookings.getInt(4);
					if (roomId==bookedRoomId) {
						isBooked = true;
						break;
					}
				}
				
				
				System.out.println("3rd part");
				if (isBooked!=true) {
					Room room=new Room(rsAllRooms.getInt(1),rsAllRooms.getInt(2),rsAllRooms.getString(3),rsAllRooms.getInt(4),rsAllRooms.getString(5),rsAllRooms.getString(6),rsAllRooms.getString(7));
					availableRooms.add(room);
				}
			}
			rsBookings.close();
			psBookings.close();
			for(int i=0;i<availableRooms.size();i++) {
				System.out.println(availableRooms.get(i).room_id);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return availableRooms;
	}
}
