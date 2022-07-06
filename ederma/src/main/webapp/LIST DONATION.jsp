<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Donation</title>
<link href=list.css rel="stylesheet">
</head>
<header>
      <ul>
          <li><a class="active" href="index.html">Home</a></li>
          <li><a href="ADD DONATION.jsp">Add Donation</a></li>
          <li><a href="LIST DONATION.jsp">List Donation</a></li>
        </ul>
  </header>
<body>
	<table class="content-table">
    <thead>
      <tr>
        <th>Donation ID</th>
        <th>Donation Name</th>
        <th>Category</th>
        <th>Details</th>
        <th>Target Amount</th>
        <th colspan = "4">Action</th>
        </tr>
    </thead>
        <c:forEach items="${donations}" var="d" varStatus="donations">
		<tr>
			<td><c:out value="${d.donationId}"/></td>
			<td><c:out value="${d.donationName}"/></td>
			<td><c:out value="${d.donationCategory}"/></td>
			<td><c:out value="${d.donationDetails}"/></td>
			<td><c:out value="${d.targetAmount}"/></td>
			<td><a class="btn btn-primary" href="ViewDonationController?donationId=<c:out value="${d.donationId}"/>">View</a></td>
			<td><a class="btn btn-primary" href="UpdateDonationController?donationId=<c:out value="${d.donationId}"/>">Update</a></td>
			<td><button class="btn btn-danger" id="<c:out value="${d.donationId}"/>" onclick="confirmation(this.id)">Delete</button></td>
		</tr>
		</c:forEach>
	</table>
	<script>
		function confirmation(id){
			console.log(id);
			var r = confirm("Are you sure you want to delete?");
			if (r == true){
				location.href = 'DeleteDonationController?donationId=' + id;
				alert("Donation successfully deleted");
			}
			else{
				return false;
			}
		}
	</script> 
</body>
</html>