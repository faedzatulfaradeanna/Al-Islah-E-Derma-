package ederma.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ederma.db.ConnectDB;
import ederma.model.Donation;

public class DonationDAO {
	static Connection con = null;
	static PreparedStatement ps = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	private int donationId;
	private String donationName, donationCategory, donationDetails;
	private double targetAmount;
	
			private static final String ADD_DONATION = // Insert new donation
			"INSERT INTO public.donation(donationId, donationName, donationCategory, donationDetails, targetAmount) " +
			"VALUES (?, ?, ?, ?, ?);";
			
			private static final String GET_DONATION_BY_ID = // get 1 donation by id
			"SELECT donationId, donationName, donationCategory, donationDetails, targetAmount" +
			"FROM public.donation " +
			"WHERE donation.donationId = ?;";
			
			private static final String GET_ALL_DONATION = // get all donation
			"SELECT * " +
			"FROM public.donation " +
			"ORDER BY donation.donationId;";
			
			private static final String DELETE_DONATION_BY_ID = // Delete 1 donation by id
			"DELETE FROM public.donation " +
			"WHERE donation.donationId = ?;";
			
			private static final String UPDATE_DONATION_BY_ID = // Update 1 donation by id
			"UPDATE public.donation " +
			"SET donationName = ?, donationCategory = ?, donationDetails = ?, targetAmount = ?" +
			"WHERE donation.donationId = ?;";

	
	//add donation
	public void addDonation(Donation bean) {
		
		donationId = bean.getDonationId();
		donationName = bean.getDonationName();
		donationCategory = bean.getDonationCategory();
		donationDetails = bean.getDonationDetails();
		targetAmount = bean.getTargetAmount();
		
		try {
			//call getConnection() method
			con = ConnectDB.getConnection();
			
			//3. create statement
			ps = con.prepareStatement(ADD_DONATION);
			ps.setInt(1, donationId);
			ps.setString(2, donationName);
			ps.setString(3, donationCategory);
			ps.setString(4, donationDetails);
			ps.setDouble(5, targetAmount);
			
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
			String sql = GET_ALL_DONATION;
			
			//4. execute query
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				//process result
				Donation d = new Donation();
				d.setDonationId(rs.getInt("donationId"));
				d.setDonationName(rs.getString("donationName"));
				d.setDonationCategory(rs.getString("donationCategory"));
				d.setDonationDetails(rs.getString("donationDetails"));
				d.setTargetAmount(rs.getDouble("targetAmount"));
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
	public static Donation getDonationById(int donationId) {
		Donation d = new Donation();
		
		try {
			//call getConnection() method
			con = ConnectDB.getConnection();
			
			//3. create statement
			ps = con.prepareStatement(GET_DONATION_BY_ID);
			ps.setInt(1, donationId);
			
			//4. execute query
			rs = ps.executeQuery();
			if(rs.next()) {
				d.setDonationId(rs.getInt("donationId"));
				d.setDonationName(rs.getString("donationName"));
				d.setDonationCategory(rs.getString("donationCategory"));
				d.setDonationDetails(rs.getString("donationDetails"));
				d.setTargetAmount(rs.getDouble("targetAmount"));
			}
			
			//5. close connection
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return d;
	}
	
	//delete donation
	public void deleteDonation(int donationId) {
		try {
			//call getConnection() method
			con = ConnectDB.getConnection();
			
			//3. create statement
			ps = con.prepareStatement(DELETE_DONATION_BY_ID);
			ps.setInt(1, donationId);
			
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
		
		donationId = bean.getDonationId();
		donationName = bean.getDonationName();
		donationCategory = bean.getDonationCategory();
		donationDetails = bean.getDonationDetails();
		targetAmount = bean.getTargetAmount();
		
		try {
			//call getConnection() method
			con = ConnectDB.getConnection();
			
			//3. create statement
			ps = con.prepareStatement(UPDATE_DONATION_BY_ID);
			ps.setString(1, donationName);
			ps.setString(2, donationCategory);
			ps.setString(3, donationDetails);
			ps.setDouble(4, targetAmount);
			ps.setInt(5, donationId);
			
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
