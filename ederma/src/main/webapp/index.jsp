<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>AL-ISLAH E-DERMA APPS</title>
	
	<style>
		* {
 		box-sizing: border-box;
		}
		
		.header {
  			padding: 80px;
  			text-align: center;
			}
		
		.navbar {
  			overflow: hidden;
  			background-color: #333;
			}
		
		.navbar a {
 	 		float: left;
  			display: block;
  			color: white;
  			text-align: center;
  			padding: 14px 20px;
  			text-decoration: none;
			}

		.navbar a.right {
  			float: right;
			}


		.navbar a:hover {
  			background-color: #ddd;
  			color: black;
			}
		
		.main { 
  			background-color: white;
  			padding: 20px;
			}

		.fakeimg {
  			background-color: #aaa;
  			width: 100%;
 		 	padding: 20px;
		}
	</style>
</head>
	
<body>
	
	<div class="header">
  		<h1>AL-ISLAH E-DERMA MANAGEMENT SYSTEM</h1>
	</div>
	
	<div class="navbar">
  		<a href="index.html">Home</a>
  		<a href="ADD DONATION.jsp">Add Donation</a>
 	 	<a href="ListDonationController">List Donation</a>
  		<a href="UPDATE DONATION.jsp" class="right">Update Donation</a>
	</div>
</body>
</html>

