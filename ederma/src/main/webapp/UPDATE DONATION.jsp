<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Donation</title>
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
          <div class="title">Update Donation</div>
          <div class="content">
            <form action="UpdateDonationController" method="post">
              <div class="user-details">
                <div class="input-box">
                  <span class="details" >Donation Name</span>
                  <input type="text" name="donationname" placeholder="Enter your donation name" required value="<c:out value="${d.donationname}"/>"/>
                </div>
                <div class="input-box">
                  <span class="details" >Category</span>
                  <select name="donationcategory">
					<option value="<c:out value="${d.donationcategory}"/>"><c:out value="${d.donationcategory}"/></option>
					<option value="Waqaf">Waqaf</option>
					<option value="Sadaqah">Sadaqah</option>
					<option value="CSR Project">CSR Project</option>
				  </select>
                </div>
                <div class="input-box">
                  <span class="details" >Details</span>
                  <input type="text" name="donationdetails" placeholder="Enter details" required value="<c:out value="${d.donationdetails}"/>"/>
                </div>
                <div class="input-box">
                  <span class="details" >Target Amount (RM)</span>
                  <input type="text" name="targetamount" placeholder="Enter Target Amount" required value="<c:out value="${d.targetamount}"/>"/>
                </div>
                <div class="input-box">
                  <input type="hidden" name="donationid" value="<c:out value="${d.donationid}"/>"/>
                </div>
                </div>
              <div class="button">
                <input type="submit" value="Update Donation">
              </div>
            </form>
          </div>
        </div>
      
      </body>
</body>
</html>