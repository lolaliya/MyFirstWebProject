<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Page</title>
</head>
<body>
	<h5>User Name</h5>
	${user.firstName }
	<br>
	${user.lastName }
	<br>
	<h6>Dog details</h6>
	<p>Dog name is: ${user.dog.name }</p>
	<p>Dog breed is: ${user.dog.breed }</p>
</body>
</html>