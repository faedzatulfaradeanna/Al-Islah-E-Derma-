package ederma.model;

public class Donation {
	private int donationid;
	private String donationname;
	private String donationcategory;
	private String donationdetails;
	private double targetamount;
	
	public Donation() {
		
	}

	public int getDonationid() {
		return donationid;
	}

	public void setDonationid(int donationid) {
		this.donationid = donationid;
	}

	public String getDonationname() {
		return donationname;
	}

	public void setDonationname(String donationname) {
		this.donationname = donationname;
	}

	public String getDonationcategory() {
		return donationcategory;
	}

	public void setDonationcategory(String donationcategory) {
		this.donationcategory = donationcategory;
	}

	public String getDonationdetails() {
		return donationdetails;
	}

	public void setDonationdetails(String donationdetails) {
		this.donationdetails = donationdetails;
	}

	public double getTargetamount() {
		return targetamount;
	}

	public void setTargetamount(double targetamount) {
		this.targetamount = targetamount;
	}
}
