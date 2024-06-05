package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PaymentDA {

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
//	----------------------------------------------- 

	public Payment addamount(int c_id, double amount) {
		Payment e = null;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "nclc123456");
			PreparedStatement ps = con.prepareStatement("select * from payment where customar_id=?");
			ps.setInt(1, c_id);
			ResultSet rs = ps.executeQuery();

			double predue = 0;
			double currentdue = 0;

			while (rs.next()) {
				predue = rs.getDouble(6);
				currentdue = predue + amount;
				e = new Payment(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5),
						rs.getDouble(6), rs.getString(7), rs.getString(8), rs.getString(9));
			}

			PreparedStatement ps1 = con.prepareStatement("update payment set due=? where customar_id=?");
			ps1.setDouble(1, currentdue);
			ps1.setInt(2, c_id);

			ps1.executeUpdate();

		} catch (Exception ex) {
			// TODO: handle exception
		}

		return e;
	}
	
//	----------------------------------------------- 

	public List<ShowData> gettabledata(int c_id) {
		List<ShowData> slist=new ArrayList();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "nclc123456");
			PreparedStatement ps = con.prepareStatement("select b.checkin, b.checkout,c.name,c.phone,p.total_bill,p.pay,p.due from booking b JOIN customar c ON (b.customar_id=c.customar_id) JOIN payment p ON (c.customar_id=p.customar_id) WHERE b.customar_id=?"  );
			ps.setInt(1, c_id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				
				slist.add(new ShowData(rs.getDate(1), rs.getDate(2), rs.getString(3), rs.getString(4),
						rs.getDouble(5), rs.getDouble(6), rs.getDouble(7)));

			}

		} catch (Exception ex) {
			// TODO: handle exception
		}
		return slist;
		
	}
	
	

}
