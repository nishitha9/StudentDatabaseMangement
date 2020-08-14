package we.app.sdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Query;

/**
 * Servlet implementation class StudentDatastore
 */
@Controller
public class StudentDatastore extends HttpServlet {
	
	Entity student1;
	Entity studentForm;
	@RequestMapping("/StudentDatstore")
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		student1=new Entity("StudentDatastore",1);
		student1.setProperty("StudentId","1" );
		student1.setProperty("Name","Nishitha" );
		student1.setProperty("StudyMark1","90" );
		student1.setProperty("StudyMark2","40" );
		student1.setProperty("StudyMark3","70" );
		student1.setProperty("SportsMark1","68" );
		student1.setProperty("SportsMark2","89" ); 
		DatastoreService datastore=DatastoreServiceFactory.getDatastoreService();
		datastore.put(student1);
	}
	
	@RequestMapping("/")
	public String indexPage()
	{
		return "index.jsp";
	}

}
