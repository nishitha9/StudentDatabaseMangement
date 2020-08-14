<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="com.google.appengine.api.datastore.DatastoreService"%>
<%@ page import="com.google.appengine.api.datastore.DatastoreServiceFactory"%>
<%@page import= "com.google.appengine.api.datastore.Entity"%>
<%@page import="com.google.appengine.api.datastore.PreparedQuery"%>
<%@page import= "com.google.appengine.api.datastore.Query"%>
<%@page import= "com.google.appengine.api.datastore.Query.FilterOperator" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>STUDENT INFORMATION</title>
</head>
<body>
<%
String id=request.getParameter("student_id");
session.setAttribute("student_id", id);
DatastoreService datastore=DatastoreServiceFactory.getDatastoreService();
Query query = new Query("StudentDatastore").addFilter("StudentId", FilterOperator.EQUAL, id);
PreparedQuery pq=datastore.prepare(query);
for(Entity student: pq.asIterable())
{
	session.setAttribute("studentName",student.getProperty("Name"));
}

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