package we.app.sdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

@Controller
public class createStudent extends HttpServlet {
	Entity studentForm;
	
	@ResponseBody
	@RequestMapping("/createStudent")
	protected void doGet(@RequestParam("studentid")String studentid,@RequestParam("name")String name,@RequestParam("studymark1")String studymark1,@RequestParam("studymark2")String studymark2,@RequestParam("studymark3")String studymark3,@RequestParam("sportsmark1")String sportsmark1,@RequestParam("sportsmark2")String sportsmark2,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		DatastoreService datastore=DatastoreServiceFactory.getDatastoreService();
		studentForm=new Entity("StudentDatastore",studentid);
		studentForm.setProperty("StudentId",studentid);
		studentForm.setProperty("Name",name);
		studentForm.setProperty("StudyMark1",studymark1);
		studentForm.setProperty("StudyMark2",studymark2);
		studentForm.setProperty("StudyMark3",studymark3);
		studentForm.setProperty("SportsMark1",sportsmark1);
		studentForm.setProperty("SportsMark2",sportsmark2);
		datastore.put(studentForm); 

		PrintWriter out=response.getWriter();
		out.print("Student Added!!!");
		out.println("<a href=\"staffdetails.jsp\"><button>View Entry</button></a>");
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
	}

}
