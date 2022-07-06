<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Donation</title>
<link rel="stylesheet" href="form.css">
</head>
<body>
<header>
        <ul>
            <li><a class="active" href="index.html">Home</a></li>
            <li><a href="ADD DONATION.jsp">Add Donation</a></li>
            <li><a href="LIST DONATION.jsp">List Donation</a></li>
            <li><a href="LOGIN.jsp">Login</a></li>
          </ul>
    </header>
    <body>
        <div class="container">
          <div class="title" >Update Donation</div>
          <div class="content">
            <form action="UpdateDonationController" method="post">
              <div class="user-details">
                <div class="input-box">
                  <span class="details" >Donation ID</span>
                  <input type="text" name="donationId" placeholder="Enter donation id" value="<c:out value="${d.donationId}"/>" required>
                </div>
                <div class="input-box">
                  <span class="details" >Donation Name</span>
                  <input type="text" name="donationName" placeholder="Enter your donation name" value="<c:out value="${d.donationName}"/>" required>
                </div>
                <div class="input-box">
                  <span class="details" >Category</span>
                  <select name="donationCategoryl">
					<option value="<c:out value="${d.donationCategory}"/>"><c:out value="${d.donationCategory}"/></option>
					<option value="Waqaf">Waqaf</option>
					<option value="Sadaqah">Sadaqah</option>
					<option value="CSR Project">CSR Project</option>
				  </select>
                </div>
                <div class="input-box">
                  <span class="details" >Details</span>
                  <input type="text" name="donationDetails" placeholder="Enter details" value="<c:out value="${d.donationDetails}"/>" required>
                </div>
                <div class="input-box">
                  <span class="details" >Target Amount (RM)</span>
                  <input type="text" name="targetAmount" placeholder="Enter Target Amount" value="<c:out value="${d.targetAmount}"/>" required>
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