<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DONATION INFOS</title>
</head>
<body>
	<%
	String donationID = request.getParameter("donationID");
	String donationName= request.getParameter("donationName");
	String donationCategory = request.getParameter("donationCategory");
	String donationDetails = request.getParameter("donationDetails");
	double donationTarget = Double.parseDouble(request.getParameter("donationTarget"));
	%>
	
	Donation ID: <%= donationID %><br>
	Donation Name: <%= donationName %><br>
	Donation Category: <%= donationCategory %><br>
	Details: <%= donationDetails %><br>
	Target Amount Donation: <%= donationTarget %><br>
</body>
</html>
