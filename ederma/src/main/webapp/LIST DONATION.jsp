<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Donation</title>
<link href=tableDonation.css rel="stylesheet">
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
        <th colspan = "2">Action</th>
        </tr>
    </thead>
        <c:forEach items="${donations}" var="d" varStatus="donations">
		<tr>
			<td><c:out value="${d.donationid}"/></td>
			<td><c:out value="${d.donationname}"/></td>
			<td><c:out value="${d.donationcategory}"/></td>
			<td><c:out value="${d.donationdetails}"/></td>
			<td><c:out value="${d.targetamount}"/></td>
			<td><a class="btn btn-primary" href="UpdateDonationController?donationid=<c:out value="${d.donationid}"/>">Update</a></td>
			<td><button class="btn btn-danger" id="<c:out value="${d.donationid}"/>" onclick="confirmation(this.id)">Delete</button></td>
		</tr>
		</c:forEach>
	</table>
	<script>
		function confirmation(id){
			console.log(id);
			var r = confirm("Are you sure you want to delete?");
			if (r == true){
				location.href = 'DeleteDonationController?donationid=' + id;
				alert("Donation successfully deleted");
			}
			else{
				return false;
			}
		}
	</script> 
</body>
</html>