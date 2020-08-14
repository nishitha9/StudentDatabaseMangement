
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>STUDENT INFORMATION</title>
</head>
<body>
<%
session.setAttribute("EntityKind","StudentDatastore");
String password=request.getParameter("password");

if(password.equals("staff"))
{
	RequestDispatcher rd=request.getRequestDispatcher("staffdetails.jsp");
	rd.forward(request,response);
	//response.sendRedirect("staffdetails.jsp");
}
else
{
	out.println("<i> Incorrect user name or password </i>");
	RequestDispatcher rd=request.getRequestDispatcher("stafflogin.jsp");
	rd.include(request,response);
}


%>
</body>
</html>