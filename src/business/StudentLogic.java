package business;

import database.StudentDao;
import pojo.Student;

public class StudentLogic 
{
	StudentDao db= new StudentDao();
	public void AddStudent(Student s)
	{
		db.AddStudent(s);
	}

}
