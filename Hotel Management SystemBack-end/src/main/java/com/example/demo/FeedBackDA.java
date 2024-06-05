package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FeedBackDA {
	public FeedBack feedback(FeedBack s) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "nclc123456");
			PreparedStatement pst = con.prepareStatement("INSERT INTO feedback VALUES(?,?,?,?)");
			pst.setInt(1, s.getId());
			pst.setString(2, s.getName());
			pst.setString(3, s.getEmail());
			pst.setString(4, s.getMassage());
			

			pst.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return s;
	}
	
//	Feedback-data-show-----------------------------------------

	public List<FeedBack>feedBack() {
		List<FeedBack> sList= new ArrayList<>();
		
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","nclc123456");
			PreparedStatement pst=con.prepareStatement("select * from feedback");
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
				sList.add(new FeedBack(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return sList;
	}
	
	
}
