<%@page import="com.capgimini.firstwebapp.beans.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page session= "false" %>
    <% HttpSession session =request.getSession(false);
    EmployeeInfoBean employeeInfoBean =(EmployeeInfoBean) session.getAttribute("employeeInfoBean"); %>
     <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>Search Employee</legend>
		<form action="./searchEmployee3" method="Get">
			Employee ID: <input type="number" name="empId" required><br>
			<input type="submit" value="Search">
		</form>
	</fieldset>
	<br>
	<%if(employeeInfoBean == null){ %>
	<h3 style='color:red;'>Employee Id not found</h3>
	<%} else { %>
	<h3 style='color:green;'>Details for Employee Id<%=employeeInfoBean.getEmpId() %> </h3><br>
	
	Employee Name =<%=employeeInfoBean.getName() %>
	Age=<%=employeeInfoBean.getAge() %>
	Salary=<%=employeeInfoBean.getSalary() %>
	Designation=<%=employeeInfoBean.getDesignation() %>
	
	<%} %>
</body>
</html>