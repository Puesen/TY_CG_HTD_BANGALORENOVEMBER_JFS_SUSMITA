<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page session="false" %>
    
    <%String msg=(String)request.getAttribute("msg"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4><a href="./home"></a></h4>
<fieldset>
	<legend>Add Employee</legend>
	<form action="./addEmployee2" method="post">
		<table>
			<tr>
				<td>Employee ID</td>
				<td>:</td>
				<td><input type="number" name="empId" required></td>
			</tr>
			<tr>
				<td>Employee Name</td>
				<td>:</td>
				<td><input type="text" name="name" required></td>
			</tr>
			<tr>
				<td>Age</td>
				<td>:</td>
				<td><input type="number" name="age" required></td>
			</tr>
			<tr>
				<td>Salary</td>
				<td>:</td>
				<td><input type="number" name="salary" required></td>
			</tr>
			<tr>
				<td>Designation</td>
				<td>:</td>
				<td><input type="text" name="designation" required></td>
			</tr>
			<tr>
				<td>Password</td>
				<td>:</td>
				<td><input type="password" name="password" required></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><br> 
				<input type="submit"value="ADD"></td>
			</tr>

		</table>
	</form></fieldset>
	<%if(msg !=null && !msg.isEmpty()){ %>
<h3 style="color:navy;"><%=msg  %></h3>
<%} %>
	
<h2>Jsp Page</h2>
</body>
</html>