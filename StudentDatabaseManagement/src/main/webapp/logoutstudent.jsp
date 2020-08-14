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
//out.println(session.getAttribute("EntityKind"));
session.invalidate();


%>
Session has expired. Click <a href="index.jsp"/>  here </a> to log in again. <br>
view student Details <a href="studentdetails.jsp"/> here </a>
</body>
</html>