<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="create-user" modelAttribute="user" method="POST">
		
			<form:hidden path = "id"/>
		
			<table>
				<tbody>
					<tr>
						<td><label>First Name:</label></td>
						<td><form:input path="firstName" /></td>
					
					</tr>
					
					<tr>
						<td><label>Last Name:</label></td>
						<td><form:input path="lastName" /></td>
					
					</tr>
					
					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="email" /></td>
					
					
					<tr>
						<td><label>password:</label></td>
						<td><form:input path="password" /></td>
					
					</tr>
					
					<tr>
						<td><label></label></td>
						<td><input type="submit" value = "save" class ="Save" /></td>
					
					</tr>
				</tbody>
			</table>
		
		
		</form:form>
		
</body>
</html>