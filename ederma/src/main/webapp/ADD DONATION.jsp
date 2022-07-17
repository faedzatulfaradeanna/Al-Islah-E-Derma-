<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ADD DONATION</title>
<link rel="stylesheet" href="formDonation.css">
</head>
<body>
	<header>
        <ul>
            <li><a class="active" href="index.html">Home</a></li>
            <li><a href="ADD DONATION.jsp">Add Donation</a></li>
            <li><a href="ListDonationController">List Donation</a></li>
          </ul>
    </header>
    <body>
        <div class="container">
          <div class="title" >Add Donation</div>
          <div class="content">
            <form action="AddDonationController" method="post">
              <div class="user-details">
                <div class="input-box">
                  <span class="details" >Donation Name</span>
                  <input type="text" name="donationName" placeholder="Enter your donation name" required>
                </div>
                <div class="input-box">
                  <span class="details" >Category</span>
                  <select name="donationCategory">
					<option value="Waqaf">Waqaf</option>
					<option value="Sadaqah">Sadaqah</option>
					<option value="CSR Project">CSR Project</option>
				  </select>
                </div>
                <div class="input-box">
                  <span class="details" >Details</span>
                  <input type="text" name="donationDetails" placeholder="Enter details" required>
                </div>
                <div class="input-box">
                  <span class="details" >Target Amount (RM)</span>
                  <input type="text" name="targetAmount" placeholder="Enter Target Amount" required>
                </div>
              </div>
              <div class="button">
                <input type="submit" value="Add Donation">
              </div>
            </form>
          </div>
        </div>
      
      </body>
</html>