<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product List</title>
</head>
<body>
	
	<h1>Scheduled Sessions</h1>
	
	
	<div style="text-align: center;">

		<table border="1">
			<col width="130">
			<th>Session Name</th>
			<th>Duration(Days)</th>
			<th>Amount</th>
			<th>Transaction Date</th>
			</tr>
			<c:forEach items="${list}" var="info">
				<tr>
					<td>${info.name}</td>
					<td>${info.duration}</td>
					<td>${info.faculty}</td>
					<td>${info.mode1}</td>
					<td><a href="Success/${info.name}/${info.duration}">Enroll me</a></td>
				

				</tr>
			</c:forEach>
		</table>
	</div>

	<a href=""><input type="submit" value="Home" /></a>
</body>
</html>