<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="we.app.sdb.*" %>
<%@ page import="java.lang.Integer.*" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Set" %>
<%@ page import="com.google.appengine.api.datastore.DatastoreService" %>
<%@ page import="com.google.appengine.api.datastore.DatastoreServiceFactory" %>
<%@ page import="com.google.appengine.api.datastore.Entity"%>
<%@ page import="com.google.appengine.api.datastore.Query" %>
<%@ page import= "com.google.appengine.api.datastore.FetchOptions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>STUDENT WEB PORTAL</title>
</head>
<style>
#heading
{
text-align:center;
color:black;
background-color:#789768;
height:60px;
padding-top:1px;
}
#logout
{
text-align:right;

}

</style>
<body bgcolor="#E9D7D7">
<div id="heading">
<h3>STUDENT INFORMATION PORTAL</h3>
</div>
<div id="logout">
<form action="stafflogout.jsp">
<input type="submit" value="logout"/>
</form>
</div>
<form action="createStudent.jsp" action="post">

Create Student<input type="submit" value="create"/>
</form>

<%= "<h3 > <i>Welcome "+ request.getParameter("staff_name")+ "</i></h3>" %>
<h3 style="text-align:center"> Student Details </h3>

<% 
DatastoreService datastore=DatastoreServiceFactory.getDatastoreService();
//StudentDatastore studentdatastore=new StudentDatastore();
//studentdatastore.doGet(request, response);
//Entity student=studentdatastore.show();
//out.print(student.getKind());
%>
<table style="border:1px solid black;margin-left:auto;margin-right:auto;text-align:center;">
<tr >
<td> Student_id </td>
<td > Name </td> 
<td > Study Mark 1</td>
<td> Study Mark 2</td>
<td> Study Mark 3</td>
<td> Sports Mark 1</td>
<td> Sports Mark 2</td>

</tr>

<% 
String entityKind=(String)session.getAttribute("EntityKind");

Query query = new Query(entityKind);
List<Entity> users = datastore.prepare(query).asList(FetchOptions.Builder.withLimit(10));


	for(Entity student:users)
	{
		if(student.getProperty("StudentId")==null)
			response.sendRedirect("index.jsp");
		
			out.println("<tr>");	
			out.println("<td>"+ student.getProperty("StudentId") +"</td>"  );
			out.println("<td>"+ student.getProperty("Name") +"</td>"  );
			out.println("<td>"+ student.getProperty("StudyMark1") +"</td>" );
			out.println("<td>"+ student.getProperty("StudyMark2")+"</td>" );
			out.println("<td>"+ student.getProperty("StudyMark3") +"</td>" );
			out.println("<td>"+ student.getProperty("SportsMark1") +"</td>" );
			out.println("<td>"+ student.getProperty("SportsMark2") +"</td>" ); 
			out.println("</tr>");
	}
		
		
	
%>


</table>

</body>
</html>