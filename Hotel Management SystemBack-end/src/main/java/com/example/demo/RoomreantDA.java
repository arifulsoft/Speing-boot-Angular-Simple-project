package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RoomreantDA {

//	reant-data-show-----------------------------------------
	public List<Roomreant>reant() {
		List<Roomreant> sList= new ArrayList<>();
		
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","nclc123456");
			PreparedStatement pst=con.prepareStatement("select * from roomreant ");
		
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
				System.out.println("works");
				sList.add(new Roomreant(rs.getInt(1),rs.getInt(2),rs.getDouble(3),rs.getDouble(4)));
				
			}
			System.out.println(sList);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return sList;
	}
	
//	reant-data-show-----------------------------------------
	public Roomreant rentById (int rentId) {
		Roomreant roomrent =null;
		
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","nclc123456");
			PreparedStatement pst=con.prepareStatement("select * from roomreant where room_no=?");
		
			pst.setInt(1, rentId);
			
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
				System.out.println("works");
				roomrent = new Roomreant(rs.getInt(1),rs.getInt(2),rs.getDouble(3),rs.getDouble(4));
				
			}
			System.out.println("find by id");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return roomrent;
		
		
	}
    
}
