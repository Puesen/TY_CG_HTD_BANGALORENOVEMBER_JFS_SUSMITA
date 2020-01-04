<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><form action="./register" method="post">
<fieldset>
		<legend>Employee Personal Address</legend>
		
		<table>
			
			<tr>
				<td>User Name:
				</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
			<tr>
				<td>Email:
				</td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
			
				<td>password:
				</td>
				<td><input type="password" name="password"></td>
			</tr>
				</table>
		</fieldset>
		<fieldset>
		<legend>Employee Address Details 1</legend>
		<table>
		<tr>
				<td>Address Type :</td>
				<td><select  name="addressBeans[0].addType">
				<option>---------Select----------</option>
				<option value= "p">Permanent</option>
				<option value="t">Temporary</option>
				</select></td>
				</tr>
			<tr>
			
			<td>Address 1:</td>
			<td><input type ="text" name="addressBeans[0].address1"></td>
		</tr>
		<tr>
		<td>Address 2:</td>
			<td><input type ="text" name="addressBeans[0].address2"></td>
		</tr>
		</table>
		
		</fieldset><fieldset><legend>Employee Address Details 2</legend>
		<table>
		<tr>
				<td>Address Type :</td>
				<td><select  name="addressBeans[1].addType">
				<option>---------Select----------</option>
				<option value= "p">Permanent</option>
				<option value="t">Temporary</option>
				</select></td>
				</tr>
			<tr>
			
			<td>Address 1:</td>
			<td><input type ="text" name="addressBeans[1].address1"></td>
		</tr>
		<tr>
		<td>Address 2:</td>
			<td><input type ="text" name="addressBeans[1].address2"></td>
		</tr>
		</table>
		
		</fieldset>
		
		<table>
		<tr>
				<td><input type="submit" name="login"></td>
			</tr>
	
		<tr><td>
		</td></tr></table>
	</form>

</body>
</html>