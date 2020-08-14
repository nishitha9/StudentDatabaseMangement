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

session.setAttribute("student_id", request.getParameter("student_id"));
String password=request.getParameter("password");
if(password.equals("student"))
{
	RequestDispatcher rd=request.getRequestDispatcher("studentdetails.jsp");
	rd.include(request,response);
	
}
else
{
	out.println("<i> Incorrect username or password </i>");
	RequestDispatcher rd= request.getRequestDispatcher("studentlogin.jsp");
	rd.include(request,response);
	
}


%>
</body>
</html>