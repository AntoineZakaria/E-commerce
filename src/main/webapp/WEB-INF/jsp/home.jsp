<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>
	<h1>this is home</h1>
 
	<c:forEach items="${products}" var="product">
		
		<div>
			${product.name}
			
			${product.description}
			
			${product.price}
			
			<c:url var = "showLink" value="/product">
			<c:param name="id" value="${product.id}"/>
			</c:url>
			
			<a href="${showLink}">show</a>
	
		</div>

	
	</c:forEach>

	
</body>
</html>