package we.app.sdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.google.appengine.repackaged.com.google.datastore.v1.client.DatastoreOptions;

@Controller
public class CheckStudent extends HttpServlet {

	@RequestMapping("/checkStudent")
	@ResponseBody
	protected void doPost(@RequestParam("studentId") String studentId,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		boolean isPresent=false;
		List<Object> studentIds=new ArrayList<>();
		DatastoreService datastore=DatastoreServiceFactory.getDatastoreService();
		Query query = new Query("StudentDatastore");
		List<Entity> users = datastore.prepare(query).asList(FetchOptions.Builder.withLimit(10));


			for(Entity student:users)
			{
				studentIds.add(student.getProperty("StudentId"));
				
			}
			response.getWriter().print(studentIds);
			response.getWriter().print(studentId);
			if(studentIds.contains(studentId)){
		
				RequestDispatcher rd=request.getRequestDispatcher("update.jsp");
				rd.forward(request, response);
			}
			else
			{
				response.getWriter().print("No student found! ");
			}
		
		
	}
}
