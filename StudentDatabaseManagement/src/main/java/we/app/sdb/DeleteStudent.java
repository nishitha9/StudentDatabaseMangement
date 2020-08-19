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
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@Controller
public class DeleteStudent extends HttpServlet {
	Entity studentForm;
	
	@ResponseBody
	@RequestMapping("/deleteStudent")
	protected void doGet(@RequestParam("studentId") String studentId, HttpServletRequest request, HttpServletResponse response) throws IOException 
		{
		response.setContentType("text/html");
		DatastoreService datastore=DatastoreServiceFactory.getDatastoreService();
		
		Key studentKey = KeyFactory.createKey("StudentDatastore", studentId);
		datastore.delete(studentKey);
		
		
		PrintWriter out=response.getWriter();
		out.print("Student Deleted!!!");
		out.println("<a href=\"staffdetails.jsp\"><button>View Entry</button></a>");
	}
	
}