package we.app.sdb;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentDatabaseMap {

	HashMap<Integer,Student> student_map=new HashMap<>();
//	HashMap<String,List<Object>> student_map1=new HashMap<>();
//	List<Object> list=new ArrayList<>();

public void create()
{
	Student student1=new Student(1,"Nishitha",67,90,56,78,56);
	Student student2=new Student(2,"John Abrahim",45,70,96,45,89);
	Student student3=new Student(3,"Richard Williams",23,67,45,90,45);
	Student student4=new Student(4,"Micheal Kohr",87,20,55,73,90);
	Student student5=new Student(5,"Jenna Sue",57,92,78,45,88);
	//list.add(12);
	//list.add(15);
	//list.add(34);
	//student_map1.put("Nishitha", list);
	
	student_map.put(student1.student_id, student1);
	student_map.put(student2.student_id, student2);
	student_map.put(student3.student_id, student3);
	student_map.put(student4.student_id, student4);
	student_map.put(student5.student_id, student5);	
	
}
	public HashMap<Integer,Student> show()
	{
		return student_map;
	}


}
