package we.app.sdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

public class createStudent extends HttpServlet {
	Entity studentForm;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		DatastoreService datastore=DatastoreServiceFactory.getDatastoreService();
		studentForm=new Entity("StudentDatastore",request.getParameter("studentid"));
		studentForm.setProperty("StudentId",request.getParameter("studentid"));
		studentForm.setProperty("Name",request.getParameter("name"));
		studentForm.setProperty("StudyMark1",request.getParameter("studymark1"));
		studentForm.setProperty("StudyMark2",request.getParameter("studymark2"));
		studentForm.setProperty("StudyMark3",request.getParameter("studymark3"));
		studentForm.setProperty("SportsMark1",request.getParameter("sportsmark1"));
		studentForm.setProperty("SportsMark2",request.getParameter("sportsmark2"));
		datastore.put(studentForm); 

		PrintWriter out=response.getWriter();
		out.print("Student Added!!!");
		out.println("<a href=\"staffdetails.jsp\"><button>View Entry</button></a>");
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
	}

}
