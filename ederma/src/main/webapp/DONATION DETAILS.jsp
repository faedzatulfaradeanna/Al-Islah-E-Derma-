<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Donation ID: <c:out value="${param.donationID}"/><br>
	Donation Name: <c:out value="${param.donationName}"/><br>
	Donation Category: <c:out value="${param.donationCategory}"/><br>
	Details: <c:out value="${param.donationDetails}"/><br>
	Target Amount Donation: <c:out value="${param.donationTarget}"/><br>
</body>
</html>
