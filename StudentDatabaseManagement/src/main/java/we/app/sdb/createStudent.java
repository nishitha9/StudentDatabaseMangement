package we.app.sdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter;

import com.google.appengine.api.datastore.Entity;

@Controller
public class createStudent extends HttpServlet {
	Entity studentForm;
	
	
	@ResponseBody
	@RequestMapping(value="/createStudent",
	method=RequestMethod.POST,
	consumes = MediaType.APPLICATION_JSON_VALUE)
	public void doPost(@RequestBody HashMap<String,Object> studentData /*@RequestParam HashMap<String, String> studentData */,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//studentData.get("")
		
		//response.setContentType("text/plain");
	/*	DatastoreService datastore=DatastoreServiceFactory.getDatastoreService();
		studentForm=new Entity("StudentDatastore",studentData.get("studentid"));
		studentForm.setProperty("StudentId",studentData.get("studentid"));
		studentForm.setProperty("Name",studentData.get("name"));
		studentForm.setProperty("StudyMark1",studentData.get("studymark1"));
		studentForm.setProperty("StudyMark2",studentData.get("studymark2"));
		studentForm.setProperty("StudyMark3",studentData.get("studymark3"));
		studentForm.setProperty("SportsMark1",studentData.get("sportsmark1"));
		studentForm.setProperty("SportsMark2",studentData.get("sportsmark2")); 
		
		datastore.put(studentForm);  */

	//	System.out.println(studentData.getStudentid());
		PrintWriter out=response.getWriter();
	//	out.println(studentData.getStudentid( )+ " " + studentData.getSportsmark1());
		out.println(studentData.get("studentid"));
		out.print("Student Added!!!");
		out.println("<a href=\"staffdetails.jsp\"><button>View Entry</button></a>");
	}
	
	


}
