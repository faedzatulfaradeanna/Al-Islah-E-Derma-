package ederma.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ederma.db.ConnectDB;
import ederma.model.*;


public class DonationDAO {
	static Connection con = null;
	static PreparedStatement ps = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	private int donationid;
	private String donationname, donationcategory, donationdetails;
	private double targetamount;
	
			private static final String ADD_DONATION = // Insert new donation
			"INSERT INTO donation(donationname, donationcategory, donationdetails, targetamount) " +
			"VALUES (?, ?, ?, ?);";
			
			private static final String GET_DONATION_BY_ID = // get 1 donation by id
			"SELECT * " +
			"FROM donation " +
			"WHERE donationid = ?;";
			
			private static final String GET_ALL_DONATION = // get all donation
			"SELECT * " +
			"FROM donation " +
			"ORDER BY donationid;";
			
			private static final String DELETE_DONATION_BY_ID = // Delete 1 donation by id
			"DELETE FROM donation " +
			"WHERE donationid = ?;";
			
			private static final String UPDATE_DONATION_BY_ID = // Update 1 donation by id
			"UPDATE donation " +
			"SET donationname = ?, donationcategory = ?, donationdetails = ?, targetamount = ?" +
			"WHERE donationid = ?;";

	
	//add donation
	public void addDonation(Donation bean) {

		donationname = bean.getDonationname();
		donationcategory = bean.getDonationcategory();
		donationdetails = bean.getDonationdetails();
		targetamount = bean.getTargetamount();
		
		try {
			//call getConnection() method
			con = ConnectDB.getConnection();
			
			//3. create statement
			ps = con.prepareStatement(ADD_DONATION);
			ps.setString(1, donationname);
			ps.setString(2, donationcategory);
			ps.setString(3, donationdetails);
			ps.setDouble(4, targetamount);
			
			//4. execute query
			ps.executeUpdate();
			System.out.println("Successfully inserted");
			
			//5. close connection
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//get all donations
		public static List<Donation> getAllDonations(){
			List<Donation> donations = new ArrayList<Donation>();
			
			try {
				//call getConnection() method
				con = ConnectDB.getConnection();
				
				//3. create statement
				stmt = con.createStatement();
				
				//4. execute query
				rs = stmt.executeQuery(GET_ALL_DONATION);
				
				while(rs.next()) {
					//process result
					Donation d = new Donation();
					d.setDonationid(rs.getInt("donationid"));
					d.setDonationname(rs.getString("donationname"));
					d.setDonationcategory(rs.getString("donationcategory"));
					d.setDonationdetails(rs.getString("donationdetails"));
					d.setTargetamount(rs.getDouble("targetamount"));
					donations.add(d);
				}
				
				//5. close connection
				con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return donations;
		}
	
	//get donation by id
	public static Donation getDonationById(int donationid) {
		Donation d = new Donation();
		
		try {
			//call getConnection() method
			con = ConnectDB.getConnection();
			
			//3. create statement
			ps = con.prepareStatement(GET_DONATION_BY_ID);
			ps.setInt(1, donationid);
			
			//4. execute query
			rs = ps.executeQuery();
			if(rs.next()) {
				d.setDonationid(rs.getInt("donationid"));
				d.setDonationname(rs.getString("donationname"));
				d.setDonationcategory(rs.getString("donationcategory"));
				d.setDonationdetails(rs.getString("donationdetails"));
				d.setTargetamount(rs.getDouble("targetamount"));
			}
			
			//5. close connection
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return d;
	}
	
	//delete donation
	public void deleteDonation(int donationid) {
		try {
			//call getConnection() method
			con = ConnectDB.getConnection();
			
			//3. create statement
			ps = con.prepareStatement(DELETE_DONATION_BY_ID);
			ps.setInt(1, donationid);
			
			//4. execute query
			ps.executeUpdate();
			
			//5. close connection
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//update donation
	public void updateDonation(Donation bean) {
		
		donationid = bean.getDonationid();
		donationname = bean.getDonationname();
		donationcategory = bean.getDonationcategory();
		donationdetails = bean.getDonationdetails();
		targetamount = bean.getTargetamount();
		
		try {
			//call getConnection() method
			con = ConnectDB.getConnection();
			
			//3. create statement
			ps = con.prepareStatement(UPDATE_DONATION_BY_ID);
			ps.setString(1, donationname);
			ps.setString(2, donationcategory);
			ps.setString(3, donationdetails);
			ps.setDouble(4, targetamount);
			ps.setInt(5, donationid);
			
			//4. execute query
			ps.executeUpdate();
			
			System.out.println("Successfully updated");
			
			//5. close connection
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
