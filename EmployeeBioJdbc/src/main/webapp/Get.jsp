<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
			<h1> EMPLOYEE DETAILS </h1>
				
			<form action="DeleteController" method="post">

			<div>
			Employee_Name:<input type="text" name="Employee_Name" id="Employee_Name">
			
			</div> 
			<br/> <br/>
			
			<div>
			Employee_fathername:<input type="text" name="Employee_fathername" id="Employee_fathername">
			
			</div>
			 <br/> <br/>
			 
			<div>
			Email_id : <input type="text" name="emailid" id="emailid">
			</div>
			<br /> <br />
			
			<div>
			City : <input type="text" name="city" id="city">
			</div>
			<br /> <br />
			
			<div>
			Phone_no : <input type="text" name="phoneno" id="phoneno">
			</div>
			<br /> <br />
			
			
			<button type="submit">SUBMIT</button>
			
			<button type="button"onClick ="window.location.href='HomePage.jsp"'>OK</button>
		
			
</body>
</html>