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
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Query;

/**
 * Servlet implementation class StudentDatastore
 */
public class StudentDatastore extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	Entity student1;
	Entity studentForm;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		student1=new Entity("StudentDatastore",2);
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



	

}
