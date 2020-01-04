<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<<jsp:useBean id="user" class="com.cg.springmvc.beans.User" scope="session"></jsp:useBean>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome <%=user.getName()%></h1>


</body>
</html>