<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DONATION DETAILS</title>
</head>
<body>
	Donation Number: <c:out value="${param.donationNumber}"/><br>
	Donation Type: <c:out value="${param.donationType}"/><br>
	Donation Date: <c:out value="${param.donationDate}"/><br>
	Total Donation: <c:out value="${param.donationTotal}"/><br>
</body>
</html>

