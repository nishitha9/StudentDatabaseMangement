package we.app.sdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.Query;

@Controller
public class DeleteStudent extends HttpServlet {
	Entity studentForm;
	
	@ResponseBody
	@RequestMapping("/deleteStudent")
	protected void doGet(@RequestParam("studentId") String studentId, HttpServletRequest request, HttpServletResponse response) throws IOException 
		{
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();	
		List<Object> studentIds=new ArrayList<>();
		DatastoreService datastore=DatastoreServiceFactory.getDatastoreService();
		Query query = new Query("StudentDatastore");
		List<Entity> users = datastore.prepare(query).asList(FetchOptions.Builder.withLimit(10));


			for(Entity student:users)
			{
				studentIds.add(student.getProperty("StudentId"));
				
			}
		//	out.println(studentIds);
			if(!studentIds.contains(studentId))
			{
				out.print("student not found");
			}

			else
			{
		Key studentKey = KeyFactory.createKey("StudentDatastore", studentId);
		datastore.delete(studentKey);
		
		
		
		out.print("Student Deleted!!!");
		out.println("<a href=\"staffdetails.jsp\"><button>View Entry</button></a>");
			}
	}
	
}