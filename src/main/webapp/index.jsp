<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>
	<h1>Spring REST Demo</h1>
	<hr>
	<a href="${pageContext.request.contextPath}/test/hello">Hello</a>
	
	<br><br>
	<a href="${pageContext.request.contextPath}/api/students">Get All Students</a>
</body>
</html>