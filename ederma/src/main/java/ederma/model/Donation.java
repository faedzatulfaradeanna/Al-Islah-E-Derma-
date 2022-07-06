package ederma.model;

public class Donation {
	private int donationId;
	private String donationName;
	private String donationCategory;
	private String donationDetails;
	private double targetAmount;
	
	public Donation() {
		
	}

	public int getDonationId() {
		return donationId;
	}

	public void setDonationId(int donationId) {
		this.donationId = donationId;
	}

	public String getDonationName() {
		return donationName;
	}

	public void setDonationName(String donationName) {
		this.donationName = donationName;
	}

	public String getDonationCategory() {
		return donationCategory;
	}

	public void setDonationCategory(String donationCategory) {
		this.donationCategory = donationCategory;
	}

	public String getDonationDetails() {
		return donationDetails;
	}

	public void setDonationDetails(String donationDetails) {
		this.donationDetails = donationDetails;
	}

	public double getTargetAmount() {
		return targetAmount;
	}

	public void setTargetAmount(double targetAmount) {
		this.targetAmount = targetAmount;
	}
}
