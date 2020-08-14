<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logout</title>
</head>
<body>
<%

session.invalidate();

%>
Session has expired. Click <a href="index.jsp"/>  here </a> to log in again.
Click <a href="studentdetails.jsp"/>  here </a> to view student details.
</body>
</html>