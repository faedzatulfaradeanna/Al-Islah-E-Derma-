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
	String donationNumber = request.getParameter("donationNumber");
	String donationType = request.getParameter("donationType");
	String donationDate = request.getParameter("donationDate");
	String donationTotal = request.getParameter("donationTotal");
	%>
	
	Donation Number: <%= donationNumber %><br>
	Donation Type: <%= donationType %><br>
	Donation Date: <%= donationDate %><br>
	Total Donation: <%= donationTotal %><br>
</body>
</html>